package com.okka.microservices.currencyconversionservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Created by ozgurokka on 9/9/21 4:00 PM
 */
//@FeignClient(name="ozgur-proxy", url="localhost:8001")
@FeignClient(name="currency-exchange")
public interface CurrencyExchangeProxy {

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public CurrConversion retrieveExchangeValue(
            @PathVariable String from,
            @PathVariable String to);
}
