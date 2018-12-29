package se.fidde.interfaces.common;

import java.math.BigDecimal;

public class Cost {
	private final BigDecimal amount;
	private final Currency currency;

	public Cost() {
		this.amount = new BigDecimal(1);
		this.currency = Currency.SEK;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public Currency getCurrency() {
		return currency;
	}
}
