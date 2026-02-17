package Wallet;

public class Wallet {
    int money = 0;

    void putMoney (int money){//ใส่เงิน
        this.money +=  money;
    }
    void getMoney (int money){//เอาเงินออก
        if (this.money > money) {
            this.money -= money;
        }
        else {
            System.out.println( "Can't get money, becuse you money not enough");
        }
    }

    public int getCurrentBath(){//โชว์เงินในเป๋าตัง
        return this.money;
    }

}
