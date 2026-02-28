package PersomWallet;

public class Person {
    String fristname;
    String lastname;
    Wallet myWallet = new Wallet() ;

    public Person (String fristname , String lastname){
        this.fristname = fristname;
        this.lastname = lastname;
    }

    public int checkMoney(){
        return myWallet.getBalance();
    }

    public void useMoney(int money){
        myWallet.getMoney(money);
    }

    public void saveMoney(int money){
        myWallet.putMoney(money);
    }

    public void changeWallet(Wallet wallet){
        wallet.balance = myWallet.balance;
        this.myWallet = wallet;
    }

    public void printInfo(){
        System.out.println("Name : " + fristname + " " +lastname);
        System.out.println("Wallet : " + checkMoney());
    }
}
