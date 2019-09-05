package com.Pattern.Strategy;

import java.math.BigDecimal;

/**
 * @author Ocean
 * @date 2019/6/19 23:02
 */
public class VIPStrategy implements Strategy{
    @Override
    public BigDecimal getPrice(BigDecimal originalPrice) {
        System.out.println("VIP用户下单可享8折优惠");
        originalPrice=originalPrice.multiply(new BigDecimal(0.8).setScale(2,BigDecimal.ROUND_HALF_UP));
        return originalPrice;
    }
}
