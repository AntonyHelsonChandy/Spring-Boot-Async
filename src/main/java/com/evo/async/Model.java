package com.evo.async;

import java.math.BigDecimal;
import java.util.UUID;

public class Model {

    private int id;
    private int start;
    private int end;
    private String bankName;
    private String currencyCode;
	public int getid() {
		return id;
	}
	public void setid(int id) {
		this.id = id;
	}
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getEnd() {
		return end;
	}
	public void setEnd(int end) {
		this.end = end;
	}
	public Model(int id, int start, int end, String bankName, String currencyCode) {
		super();
		this.id = id;
		this.start = start;
		this.end = end;
		this.bankName = bankName;
		this.currencyCode = currencyCode;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getCurrencyCode() {
		return currencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}




}
