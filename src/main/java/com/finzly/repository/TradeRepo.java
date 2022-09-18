package com.finzly.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.finzly.entity.Trade;

public interface TradeRepo extends JpaRepository<Trade, Integer>{

}
