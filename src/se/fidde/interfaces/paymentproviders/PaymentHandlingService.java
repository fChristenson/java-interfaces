package se.fidde.interfaces.paymentproviders;

import java.io.IOException;
import java.net.MalformedURLException;

import se.fidde.interfaces.common.Cost;
import se.fidde.interfaces.common.User;

public class PaymentHandlingService {
	public static void sendPayment(User user, Cost cost, SupportedPaymentProviders provider) {
		try {
			PaymentProvider paymentProvider = PaymentProviderFactory.getProvider(provider);
			boolean paymentSent = paymentProvider.handlePayment(user, cost);

			if (paymentSent) {
				System.out.println(String.format("Payment succeeded for user: %s", user.getUsername()));
			} else {
				System.err.println(String.format("Payment failed for user: %s", user.getUsername()));
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
