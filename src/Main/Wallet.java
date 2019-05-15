package Main;

public class Wallet {
    private static int wallet = 150;
    public Wallet(int w) {
        wallet = w;


    }
    static void setWallet(int w) {
        wallet = w;
    }

    static int getWallet(){
        return wallet;
    }
}
