package PersomWallet;

public class Tester {
    public static void main(String[] args) {
        Person jame = new Person("Jame" , "Smith");
        jame.printInfo();
        System.out.println();

        System.out.println("save money 1000");
        jame.saveMoney(1000);
        jame.printInfo();
        System.out.println();

        System.out.println("save money 200");
        jame.useMoney(200);
        jame.printInfo();
        System.out.println();

        System.out.println("change wallet");
        Wallet chap = new Wallet();
        jame.changeWallet(chap);
        jame.printInfo();
        System.out.println();

        System.out.println(chap.balance);
    }
}
