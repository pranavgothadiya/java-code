package com.atm.input;

import java.math.BigDecimal;

public class InputData {

	public static final int WITHDROW = 1;
	public static final int MINI_STATE = 2;
	public static final int CHEQUE_DEPO = 3;

	private static volatile InputData inputData = null;

	private InputData() {
	}

	public static InputData get() {
		if (inputData == null) {
			inputData = new InputData();
		}
		return inputData;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public boolean isReceipt() {
		return isReceipt;
	}

	public void setReceipt(boolean isReceipt) {
		this.isReceipt = isReceipt;
	}

	public static int getChequeDepo() {
		return CHEQUE_DEPO;
	}

	private int type;
	private BigDecimal amount;
	private String cardNo;
	private boolean isReceipt;
	private String pin;

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

}
