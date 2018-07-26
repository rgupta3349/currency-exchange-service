package com.rajan.spring.currencyexchangeservice;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.rajan.spring.entity.CurrencyExchange;
import com.rajan.spring.repository.CurrencyExchangeRepository;

@RestController
@ComponentScan
public class CurrencyExchangeController {
	
	@Autowired
	Environment env;
	
	@Autowired
	private CurrencyExchangeRepository repository;
	
	@GetMapping(path="/hello")
	public CurrencyExchange HelloWorld()
	{
		String appName = env.getProperty("spring.application.name");
		int port = Integer.parseInt(env.getProperty("server.port"));
		
		CurrencyExchange currencyExchange = new CurrencyExchange("USD","INR",65,0);
		currencyExchange.setPort(port);
		
		repository.save(currencyExchange);
		
		return currencyExchange;
	}
	
	@GetMapping(path="/currency-exchange/from/{from}/to/{to}")
	public CurrencyExchange CurrencyExchange(@PathVariable String from, @PathVariable String to)
	{
		//String appName = env.getProperty("spring.application.name");
		//int port = Integer.parseInt(env.getProperty("server.port"));
		
		//CurrencyExchange currencyExchange = new CurrencyExchange("USD","INR",65,0);
		//currencyExchange.setPort(port);
		
		CurrencyExchange currencyExchange = repository.findByFromAndTo(from,to);
		
		//repository.save(currencyExchange);
		
		return currencyExchange;
	}
	
	@GetMapping(path="/currency-exchange/{rate}")
	//@HystrixCommand(fallbackMethod = "reliable")
	public String CurrencyExchange(@PathVariable int rate)
	{
		String appName = env.getProperty("spring.application.name");
		
		
		return appName;
	}
	
	public String reliable()
	{
		String appName = "Failure Response";
		
		
		return appName;
	}

}
