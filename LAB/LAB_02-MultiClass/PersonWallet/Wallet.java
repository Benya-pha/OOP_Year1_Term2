package PersomWallet;

    public class Wallet {
        int balance;

        public int getBalance(){
            return balance;
        }

        public void putMoney(int money){
            if(money >= 0){
                balance += money;
            }else{
                System.out.println("can't put money");
            }
        }

        public void getMoney(int money){
            if(balance >= money){
                balance -= money;
            }else {
                System.out.println("Can't get money, becuse you money not enough");
            }
        }
    }
