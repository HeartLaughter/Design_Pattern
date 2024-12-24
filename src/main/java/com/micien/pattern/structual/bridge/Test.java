package com.micien.pattern.structual.bridge;

public class Test {
    public static void main(String[] args) {
        //你在这里声明bank和accont的时候，就可以想象到底是account里构造器里传bank还是bank里传account.
        //不是都传的，不然就循环依赖，成死锁了
        Account depositAccount = new DepositAccount("Deposit Account");
        Account savingAccount = new SavingAccount("Saving Account");
        Bank ABCBank = new ABCBank(depositAccount);
        Bank ICBCBank = new ICBCBank(depositAccount);
        Bank ABCBank2 = new ABCBank(savingAccount);

        ABCBank.openAccount();
        ABCBank.showType();
        ICBCBank.openAccount();
        ICBCBank.showType();
        ABCBank2.openAccount();
        ABCBank2.showType();
        /*//在这里你就明白了，按照这种设计模式，如果你要显示showtype，你这方法就肯定要在Bank里定义了
        * 不然你在这里怎么showtype
        * */

        /*我之前没有这么想，是因为没有想到客户端调用的时候的情景，但是我感觉这还是表象，肯定还有更深层的设计上的原因
        *所以在这里去Bank里写showtype
        *
        *  */
        /*
        * 如果这里新加了一钟账户类型，也可以和Bank解耦*/
        FraudAccount fraudAccount = new FraudAccount("Fraud account");
        Bank bank3 = new ABCBank(fraudAccount);
        bank3.showType();





    }
}
