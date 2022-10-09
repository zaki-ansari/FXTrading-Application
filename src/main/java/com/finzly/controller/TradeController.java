package com.finzly.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.finzly.entity.Trade;
import com.finzly.service.impl.TradeServiceImpl;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/FX")
public class TradeController {
	
	@Autowired
	private TradeServiceImpl tradeService;
	
	@PostMapping("/bookTrade")
	ResponseEntity<String> bookTrade(@RequestBody Trade trade){
		String msg = tradeService.bookTrade(trade);
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}
	
	@GetMapping("/trades")
	ResponseEntity<List<Trade>> getAllTrades(){
		List<Trade>trades  = this.tradeService.getAllTrades();
		return new ResponseEntity<List<Trade>>(trades,HttpStatus.OK);
	}

}
