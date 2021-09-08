package com.okka.microservices.limitsservice.model;

/**
 * Created by ozgurokka on 9/7/21 5:22 PM
 */
public class Limits {
    private int min;
    private int max;

    public Limits(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }
}
