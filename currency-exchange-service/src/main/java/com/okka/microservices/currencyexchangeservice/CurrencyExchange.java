package com.okka.microservices.currencyexchangeservice;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * Created by ozgurokka on 9/9/21 11:13 AM
 */
@Entity
public class CurrencyExchange {
    @Id
    private  Long id;
    private String fromx;
    private String tox;
    private BigDecimal cnvM;
    private String environmet;

    public CurrencyExchange(Long id, String from, String to, BigDecimal cnvM, String environmet) {
        this.id = id;
        this.fromx = from;
        this.tox = to;
        this.cnvM = cnvM;
        this.environmet = environmet;
    }

    public CurrencyExchange() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFromx() {
        return fromx;
    }

    public void setFromx(String from) {
        this.fromx = from;
    }

    public String getTox() {
        return tox;
    }

    public void setTox(String to) {
        this.tox = to;
    }

    public BigDecimal getCnvM() {
        return cnvM;
    }

    public void setCnvM(BigDecimal cnvM) {
        this.cnvM = cnvM;
    }

    public String getEnvironmet() {
        return environmet;
    }

    public void setEnvironmet(String environmet) {
        this.environmet = environmet;
    }
}
