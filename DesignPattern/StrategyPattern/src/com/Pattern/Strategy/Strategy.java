package com.Pattern.Strategy;

import java.math.BigDecimal;

/**
 * @author Ocean
 * @date 2019/6/19 22:51
 */
public interface Strategy {

    public BigDecimal getPrice(BigDecimal originalPrice);
}
