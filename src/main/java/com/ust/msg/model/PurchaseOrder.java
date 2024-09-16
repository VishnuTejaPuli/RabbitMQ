package com.ust.msg.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PurchaseOrder implements Serializable{
	
	private String orderId;
	private String company;
	private int qty;
	private double price;
	

}
