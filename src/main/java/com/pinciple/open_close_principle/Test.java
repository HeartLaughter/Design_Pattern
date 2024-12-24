package com.pinciple.open_close_principle;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Test {
    public static void main(String[] args) {
        course icourse = new DiscountJavaClass(1, "data", 388);

        DiscountJavaClass discountJavaClass = (DiscountJavaClass) icourse;

        System.out.print(discountJavaClass.getOriginalPrice() + discountJavaClass.getPrice());
    }
}
