package se.fidde.interfaces;

import se.fidde.interfaces.common.Cost;
import se.fidde.interfaces.common.User;
import se.fidde.interfaces.paymentproviders.PaymentHandlingService;
import se.fidde.interfaces.paymentproviders.SupportedPaymentProviders;

public class Main {
	public static void main(String[] args) {
		User user = new User("Fredrik");
		Cost cost = new Cost();

		SupportedPaymentProviders provider = SupportedPaymentProviders.PAYPAL;

		PaymentHandlingService.sendPayment(user, cost, provider);
	}
}
