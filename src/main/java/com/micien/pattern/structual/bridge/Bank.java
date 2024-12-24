package com.micien.pattern.structual.bridge;

public abstract class Bank {
    protected Account account;
    Bank(Account account) {
        this.account = account;
    }

    public Account openAccount() {
        System.out.println("抽象银行打开了抽象账户");
        return account;
    }

}
