package com.micien.pattern.structual.bridge;

public class SavingAccount extends Account {


    SavingAccount(String typeName) {
        super(typeName);
    }

    @Override
    public void showType() {
        System.out.println("Type: Saving account");
    }


}
