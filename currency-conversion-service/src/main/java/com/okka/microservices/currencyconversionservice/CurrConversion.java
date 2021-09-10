package com.okka.microservices.currencyconversionservice;

import java.math.BigDecimal;

/**
 * Created by ozgurokka on 9/9/21 3:14 PM
 */
public class CurrConversion {
    private long id;
    private String fromx;
    private String tox;
    private BigDecimal cnvM;
    private BigDecimal quantity;
    private BigDecimal tcA;
    private String environmet;

    public CurrConversion(long id, String fromx, String tox, BigDecimal cnvM, BigDecimal quantity, BigDecimal tcA, String environmet) {
        this.id = id;
        this.fromx = fromx;
        this.tox = tox;
        this.cnvM = cnvM;
        this.quantity = quantity;
        this.tcA = tcA;
        this.environmet = environmet;
    }

    public CurrConversion() {
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFromx() {
        return fromx;
    }

    public void setFromx(String fromx) {
        this.fromx = fromx;
    }

    public String getTox() {
        return tox;
    }

    public void setTox(String tox) {
        this.tox = tox;
    }

    public BigDecimal getCnvM() {
        return cnvM;
    }

    public void setCnvM(BigDecimal cnvM) {
        this.cnvM = cnvM;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getTcA() {
        return tcA;
    }

    public void setTcA(BigDecimal tcA) {
        this.tcA = tcA;
    }

    public String getEnvironmet() {
        return environmet;
    }

    public void setEnvironmet(String environmet) {
        this.environmet = environmet;
    }
}
