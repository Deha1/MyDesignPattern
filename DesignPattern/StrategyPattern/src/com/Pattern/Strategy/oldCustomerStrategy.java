package com.Pattern.Strategy;

import java.math.BigDecimal;

/**
 * @author Ocean
 * @date 2019/6/19 23:02
 */
public class oldCustomerStrategy implements Strategy{

    @Override
    public BigDecimal getPrice(BigDecimal originalPrice) {
        System.out.println("老用户下单可得9折优惠哦");
        originalPrice= originalPrice.multiply(new BigDecimal(0.9).setScale(2,BigDecimal.ROUND_HALF_UP));
        return originalPrice;
    }
}
