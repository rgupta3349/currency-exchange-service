package com.rajan.spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class CurrencyExchange {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name="currency_from")
	String from;
	@Column(name="currency_to")
	String to;
	int conversionMultiply;
	int port;
	
	public CurrencyExchange() {
		// TODO Auto-generated constructor stub
	}
	

	public CurrencyExchange(String from, String to, int conversionMultiply, int port) {
		
		this.from = from;
		this.to = to;
		this.conversionMultiply = conversionMultiply;
		this.port = port;
	}


	public int getPort() {
		return port;
	}
	
	public String getFrom() {
		return from;
	}

	public void setPort(int port) {
		this.port = port;
	}


	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public int getConversionMultiply() {
		return conversionMultiply;
	}
	public void setConversionMultiply(int conversionMultiply) {
		this.conversionMultiply = conversionMultiply;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}
	
	
	

}
