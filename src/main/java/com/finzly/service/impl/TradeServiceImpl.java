package com.finzly.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finzly.entity.Trade;
import com.finzly.repository.TradeRepo;
import com.finzly.service.TradeService;

@Service
public class TradeServiceImpl implements TradeService {
	
	@Autowired
	private TradeRepo tradeRepo;

	@Override
	public String bookTrade(Trade trade) {
		double convertedAmount=trade.getAmount()*trade.getRate();
		this.tradeRepo.save(trade);
		String msg = "You are transferring INR "+convertedAmount+" to John M.( Assuming that rate was "+trade.getRate()+")";
		return msg;
	}

	@Override
	public List<Trade> getAllTrades() {
		List<Trade> trades = this.tradeRepo.findAll();
		return trades;
	}

}
