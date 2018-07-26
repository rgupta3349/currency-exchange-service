package com.rajan.spring.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.rajan.spring.entity.CurrencyExchange;

@Repository
@Component
public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange,Long>{
	CurrencyExchange findByFromAndTo(String from, String to);

}
