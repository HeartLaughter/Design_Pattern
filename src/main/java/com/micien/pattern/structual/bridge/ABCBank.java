package com.micien.pattern.structual.bridge;

//子类构造函数必须显示调用父类构造函数
public class ABCBank extends Bank {
    ABCBank(Account account) {
        super(account);
    }

    @Override
    public Account openAccount() {
        System.out.println("ABC打开了银行账户");
        return account;
    }
}
