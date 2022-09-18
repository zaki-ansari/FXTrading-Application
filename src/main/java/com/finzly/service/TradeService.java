package com.finzly.service;

import java.util.List;

import com.finzly.entity.Trade;

public interface TradeService {
	
	String bookTrade(Trade trade);
	
	List<Trade> getAllTrades();
	
	
	
	

}
