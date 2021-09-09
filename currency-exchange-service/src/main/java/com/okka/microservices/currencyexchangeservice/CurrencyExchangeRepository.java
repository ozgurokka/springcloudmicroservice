package com.okka.microservices.currencyexchangeservice;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by ozgurokka on 9/9/21 11:45 AM
 */
public interface CurrencyExchangeRepository extends CrudRepository<CurrencyExchange,Long> {
    public CurrencyExchange findByFromxAndTox(String from, String to);
}
