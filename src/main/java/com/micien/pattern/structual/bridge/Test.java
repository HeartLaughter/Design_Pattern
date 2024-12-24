package com.micien.pattern.structual.bridge;

public class Test {
    public static void main(String[] args) {
        //你在这里声明bank和accont的时候，就可以想象到底是account里构造器里传bank还是bank里传account.
        //不是都传的，不然就循环依赖，成死锁了
        Account depositAccount = new DepositAccount();
        Account savingAccount = new SavingAccount();
        Bank ABCBank = new ABCBank(depositAccount);
        Bank ICBCBank = new ICBCBank(depositAccount);
        Bank ABCBank2 = new ABCBank(savingAccount);

        ABCBank.openAccount();
        ICBCBank.openAccount();
        ABCBank2.openAccount();
        /*//在这里你就明白了，按照这种设计模式，如果你要显示showtype，你这方法就肯定要在Bank里定义了
        * 不然你在这里怎么showtype
        * */



    }
}
