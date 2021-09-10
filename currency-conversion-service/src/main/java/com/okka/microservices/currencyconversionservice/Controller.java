package com.okka.microservices.currencyconversionservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.util.HashMap;

/**
 * Created by ozgurokka on 9/9/21 3:12 PM
 */
@RestController
public class Controller {
    @Autowired
    public CurrencyExchangeProxy proxy;

    @GetMapping("currency-conversion/from/{from}/to/{to}/quantity/{quantity}")
    public CurrConversion calculateCC(@PathVariable String from, @PathVariable String to, @PathVariable BigDecimal quantity){

        HashMap<String,String> uriVariables = new HashMap<>();
        uriVariables.put("from",from);
        uriVariables.put("to",to);
        ResponseEntity<CurrConversion> resEnt = new RestTemplate().getForEntity("http://localhost:8001/currency-exchange/from/{from}/to/{to}",CurrConversion.class,uriVariables);
        CurrConversion c = resEnt.getBody();
        return  new CurrConversion(c.getId(),from,to,c.getCnvM(),quantity,quantity.multiply(c.getCnvM()),c.getEnvironmet());
    }

    @GetMapping("currency-conversion-feign/from/{from}/to/{to}/quantity/{quantity}")
    public CurrConversion calculateCCf(@PathVariable String from, @PathVariable String to, @PathVariable BigDecimal quantity){


        CurrConversion c = proxy.retrieveExchangeValue(from,to);
        return  new CurrConversion(c.getId(),from,to,c.getCnvM(),quantity,quantity.multiply(c.getCnvM()),c.getEnvironmet());
    }
}
