package se.fidde.interfaces.paymentproviders;

import java.io.IOException;

import se.fidde.interfaces.common.Cost;
import se.fidde.interfaces.common.User;

public interface PaymentProvider {
	boolean handlePayment(User user, Cost amount) throws IOException;
}
