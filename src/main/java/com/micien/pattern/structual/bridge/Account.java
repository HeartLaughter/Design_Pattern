package com.micien.pattern.structual.bridge;

//目前比较困扰我的，到底是在Account中注入Bank,还是Bank中注入account？
/*
Geely 是bank中注入account，我试试Account中注入Bank;但是如果把account
* */
public abstract class Account {
    private String typeName;
    Account(String typeName) {
        this.typeName = typeName;
    }

    //你看，写到这里就很奇怪，只有银行才能打开账户，而不是账户里打开账户？假如你这函数写在这里，你account类传自己Account类，太奇怪
/*    Account openAccount(Account account) {
        System.out.println("打开一个抽象账户");
        return account;
    }*/
    //但是geely还说有2个openAccount，是Bank里的openAccount方法，委托Account里的openAccount方法
    //这种方式我觉得也是比较ok的，也不用想openAccount到底是放在bank里还是放在account里，因为这样想的话，是都说得通的

    //总之，怎么设计取决于业务

    abstract public void showType();


}
