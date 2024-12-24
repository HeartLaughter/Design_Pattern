package com.micien.pattern.structual.bridge;

public class DepositAccount extends Account {

    @Override
    public void showType() {
        System.out.println("Type: Deposit Account");
    }


}
