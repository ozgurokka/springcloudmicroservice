package com.okka.microservices.currencyexchangeservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * Created by ozgurokka on 9/9/21 11:20 AM
 */
@RestController
public class Controller {

    @Autowired
    private Environment environment;

    @Autowired
    private CurrencyExchangeRepository repo;

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public CurrencyExchange retrieveExchangeValue(
            @PathVariable String from,
            @PathVariable String to) {
        String port = environment.getProperty("local.server.port");
        //CurrencyExchange currencyExchange = new CurrencyExchange(1000L, from, to,
        //        BigDecimal.valueOf(50),port);

        CurrencyExchange currencyExchange = repo.findByFromxAndTox(from,to);
        currencyExchange.setEnvironmet(port);
        return currencyExchange;

    }
}
