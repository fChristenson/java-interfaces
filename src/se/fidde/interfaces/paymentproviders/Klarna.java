package se.fidde.interfaces.paymentproviders;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import se.fidde.interfaces.common.Cost;
import se.fidde.interfaces.common.User;

public class Klarna implements PaymentProvider {

	private final URL paymentUrl;

	public Klarna() throws MalformedURLException {
		this.paymentUrl = new URL("https://www.klarna.com/se/");
	}

	@Override
	public boolean handlePayment(User user, Cost cost) throws IOException {
		HttpURLConnection connection = (HttpURLConnection) this.paymentUrl.openConnection();
		connection.setRequestMethod("GET");
		System.out.println(connection.getResponseCode());
		return true;
	}

	public URL getPaymentUrl() {
		return paymentUrl;
	}

}
