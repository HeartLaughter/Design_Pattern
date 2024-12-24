package com.micien.pattern.structual.bridge;

public class ICBCBank extends Bank {

    ICBCBank(Account account) {
        super(account);
    }

    @Override
    public Account openAccount() {
        System.out.println("ICBC打开了银行账户");
        return account;
    }
}
