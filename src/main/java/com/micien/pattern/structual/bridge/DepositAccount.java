package com.micien.pattern.structual.bridge;

public class DepositAccount extends Account {

    DepositAccount(String typeName) {
        super(typeName);
    }

    @Override
    public void showType() {
        System.out.println("Type: Deposit Account");
    }


}
