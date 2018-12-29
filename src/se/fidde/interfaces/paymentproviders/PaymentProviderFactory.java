package se.fidde.interfaces.paymentproviders;

import java.net.MalformedURLException;

public class PaymentProviderFactory {
	public static PaymentProvider getProvider(SupportedPaymentProviders provider) throws MalformedURLException {
		switch (provider) {
		case PAYPAL:
			return new Paypal();

		case KLARNA:
			return new Klarna();

		default:
			throw new IllegalArgumentException(String.format("%s is not supported", provider));
		}
	}
}
