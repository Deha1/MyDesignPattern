package com.Pattern.Context;

import com.Pattern.Strategy.Strategy;

import java.math.BigDecimal;

/**
 * @author Ocean
 * @date 2019/6/19 23:03
 */
public class Context {

    private Strategy strategy ;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }
    public BigDecimal getPrice(BigDecimal originalPrice)
    {
        return strategy.getPrice(originalPrice);
    }

}
