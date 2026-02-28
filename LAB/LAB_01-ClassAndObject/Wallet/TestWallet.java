package Wallet;

public class TestWallet {
    public static void main(String[] args) {
        Wallet myWallet = new Wallet();
        System.out.println("I have new wallet");
        System.out.println("Cerrent wallet have : " + myWallet.getCurrentBath() + " Bath");

        myWallet.putMoney(500);
        System.out.println("I put " +  myWallet.getCurrentBath() + " Bath to wallet" );
        System.out.println("Cerrent wallet have : " + myWallet.getCurrentBath() + " Bath");

        System.out.println();

        myWallet.getMoney(200);
        System.out.println("I would like to eating buffet (use 200 bath)");
        System.out.println("You get money 200 Bath");
        System.out.println("Your money in wallet have " + myWallet.getCurrentBath() + " Bath");
        System.out.println("Cerrent wallet have : " + myWallet.getCurrentBath() + " Bath");

        System.out.println();

        myWallet.getMoney(170);
        System.out.println("I am going to see movie at cinima (use 170 bath)");
        System.out.println("You get money 170 Bath");
        System.out.println("Your money in wallet have " + myWallet.getCurrentBath() + " Bath");
        System.out.println("Cerrent wallet have : " + myWallet.getCurrentBath() + " Bath");

        System.out.println();

        myWallet.getMoney(200);
        System.out.println("I would like to eating buffet (use 200 bath)");
        System.out.println("You get money 200 Bath");
        System.out.println("Your money in wallet have " + myWallet.getCurrentBath() + " Bath");
        System.out.println("Cerrent wallet have : " + myWallet.getCurrentBath() + " Bath");

        System.out.println();

        myWallet.putMoney(200);
        System.out.println("Your money in wallet have " + myWallet.getCurrentBath() + " Bath");

        myWallet.getMoney(-50);
        System.out.println("Your money in wallet have " + myWallet.getCurrentBath() + " Bath");

    }
}
