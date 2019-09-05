package com.Pattern.Strategy;

import java.math.BigDecimal;

/**
 * @author Ocean
 * @date 2019/6/19 23:02
 */
public class newCustomerStrategy implements Strategy{
    @Override
    public BigDecimal getPrice(BigDecimal originalPrice) {
        System.out.println("新用户无折扣，但首次下单立减10元");
        originalPrice=originalPrice.subtract(new BigDecimal(10));
        return originalPrice;
    }
}
