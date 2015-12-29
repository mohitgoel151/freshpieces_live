package org.util.otp;

/**
 * Implementations of this interface generate random token strings.
 */
public interface OtpGenerator {
	
	/**
	 * Generates a random token.
	 */
	public String generateToken();
}
