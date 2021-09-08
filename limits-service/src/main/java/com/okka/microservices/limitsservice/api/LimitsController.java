package com.okka.microservices.limitsservice.api;

import com.okka.microservices.limitsservice.configuration.Config;
import com.okka.microservices.limitsservice.model.Limits;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ozgurokka on 9/7/21 5:20 PM
 */
@RestController
public class LimitsController {

    @Autowired
    private Config conf;

    @GetMapping("/limits")
    public Limits retrieveLimits(){
        return new Limits(conf.getMin(),conf.getMax());
    }
}


