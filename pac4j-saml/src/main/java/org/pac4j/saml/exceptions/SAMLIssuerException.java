package org.pac4j.saml.exceptions;

/**
 * This is {@link SAMLIssuerException}.
 *
 * @author Misagh Moayyed
 * @since 3.0.0
 */
public class SAMLIssuerException extends SAMLException {
    private static final long serialVersionUID = 6973714579016063655L;

    public SAMLIssuerException(final String message) {
        super(message);
    }

    public SAMLIssuerException(final Throwable t) {
        super(t);
    }

    public SAMLIssuerException(final String message, final Throwable t) {
        super(message, t);
    }
}
