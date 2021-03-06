/**
 * DSS - Digital Signature Services
 * Copyright (C) 2015 European Commission, provided under the CEF programme
 * 
 * This file is part of the "DSS - Digital Signature Services" project.
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
 */
package eu.europa.esig.dss.validation;

import java.util.List;

import eu.europa.esig.dss.enumerations.SignaturePolicyType;
import eu.europa.esig.dss.model.DSSDocument;
import eu.europa.esig.dss.model.Digest;

/**
 * Represents the value of a SignaturePolicy
 *
 */
public class SignaturePolicy {

	private final String identifier;
	private boolean zeroHash;
	private Digest digest;
	private DSSDocument policyContent;
	
	// optional parameters (used in XAdES)
	private String description;
	private List<String> documentationReferences;

	/**
	 * Two qualifiers for the signature policy have been identified so far:
	 * • a URL where a copy of the signature policy MAY be obtained;
	 * • a user notice that should be displayed when the signature is verified.
	 */
	private String url;
	private String notice;

	/**
	 * The default constructor for SignaturePolicy. It represents the implied policy.
	 */
	public SignaturePolicy() {
		this.identifier = SignaturePolicyType.IMPLICIT_POLICY.name();
	}

	/**
	 * The default constructor for SignaturePolicy.
	 *
	 * @param identifier
	 *            the policy identifier
	 */
	public SignaturePolicy(final String identifier) {
		this.identifier = identifier;
	}

	/**
	 * Returns the signature policy identifier
	 * 
	 * @return the signature policy identifier
	 */
	public String getIdentifier() {
		return identifier;
	}

	public boolean isZeroHash() {
		return zeroHash;
	}

	public void setZeroHash(boolean zeroHash) {
		this.zeroHash = zeroHash;
	}

	public Digest getDigest() {
		return digest;
	}

	public void setDigest(Digest digest) {
		this.digest = digest;
	}

	/**
	 * Returns the signature policy url (if found)
	 * 
	 * @return the url of the signature policy (or null if not available information)
	 */
	public String getUrl() {
		return url;
	}

	public void setUrl(final String url) {
		this.url = url;
	}
	
	/**
	 * Gets description
	 */
	public String getDescription() {
		return description;
	}
	
	/**
	 * Sets description (*optional)
	 * @param description {@link String}
	 */
	public void setDescription(final String description) {
		this.description = description;
	}

	/**
	 * Gets the documentation references
	 * NOTE: optional, used in XAdES
	 * 
	 * @return a list of {@link String} documentation references
	 */
	public List<String> getDocumentationReferences() {
		return documentationReferences;
	}

	/**
	 * Sets the documentation references
	 * @param documentationReferences a list of {@link String} documentation references
	 */
	public void setDocumentationReferences(List<String> documentationReferences) {
		this.documentationReferences = documentationReferences;
	}

	public String getNotice() {
		return notice;
	}

	public void setNotice(final String notice) {
		this.notice = notice;
	}

	/**
	 * Returns a DSSDocument with the signature policy content
	 * 
	 * @return a DSSDocument which contains the signature policy
	 */
	public DSSDocument getPolicyContent() {
		return policyContent;
	}

	public void setPolicyContent(DSSDocument policyContent) {
		this.policyContent = policyContent;
	}

}
