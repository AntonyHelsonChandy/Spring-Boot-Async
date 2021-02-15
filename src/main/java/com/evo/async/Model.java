package com.evo.async;

import java.math.BigDecimal;
import java.util.UUID;

public class Model {

	private String id; 
    private BigDecimal start;
    private int end;
    private String bankName;
    private String currencyCode;
	public String getid() {
		return id;
	}
	public void setid(String id) {
		this.id = id;
	}
	public BigDecimal getStart() {
		return start;
	}
	public void setStart(BigDecimal start) {
		this.start = start;
	}
	public int getEnd() {
		return end;
	}
	public void setEnd(int end) {
		this.end = end;
	}
	public Model(String id, BigDecimal start, int end, String bankName, String currencyCode) {
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
