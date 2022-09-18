package com.finzly.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
public class Trade {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer tradeId;
	private String currencyPair;
	private String customerName;
	private Integer amount;
	private Double rate;
	
	
	
	

}
