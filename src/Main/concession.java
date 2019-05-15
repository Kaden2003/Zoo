package Main;

import java.util.Scanner;


public class concession {


    public void cshop() {
        System.out.println("Welcome to the concession stand!");
        System.out.println("Your current amount of money is : " + Wallet.getWallet());
        System.out.println("You can buy the following items below:");
        System.out.println("funnel cake $2");
        System.out.println("hotdog $6");
        System.out.println("popcorn $5");
        System.out.println("cake $7");
        System.out.println("large popcorn $10");

        Scanner In = new Scanner(System.in);
        String userinput;
        userinput = In.nextLine();
        int funnelCake = 2;
        int hotDog = 6;
        int popCorn = 5;
        int cake = 10;
        int largePopcorn = 10;


        if (userinput.toLowerCase().equals("funnel cake") && Wallet.getWallet() >= 2) {
            System.out.println("You have successfully bought a funnel cake");
            Wallet.setWallet(Wallet.getWallet() - funnelCake);
            System.out.println("Your current amount of money is:" + Wallet.getWallet());
        } else if (userinput.toLowerCase().equals("hotdog") && Wallet.getWallet() >= 6) {
            System.out.println("You have successfully bought a hotdog");
            Wallet.setWallet(Wallet.getWallet() - hotDog);
            System.out.println("Your current amount of money is:" + Wallet.getWallet());
        } else if (userinput.toLowerCase().equals("popcorn") && Wallet.getWallet() >= 5) {
            System.out.println("You have successfully bought popcorn");
            Wallet.setWallet(Wallet.getWallet() - popCorn);
            System.out.println("Your current amount of money is:" + Wallet.getWallet());
        } else if (userinput.toLowerCase().equals("large popcorn") && Wallet.getWallet() >= 10) {
            System.out.println("You have successfully bought a large popcorn");
            Wallet.setWallet(Wallet.getWallet() - largePopcorn);
            System.out.println("Your current amount of money is:" + Wallet.getWallet());
        } else if (userinput.toLowerCase().equals("cake") && Wallet.getWallet() >= 2) {
            System.out.println("You have successfully bought cake");
            Wallet.setWallet(Wallet.getWallet() - cake);
            System.out.println("Your current amount of money is:" + Wallet.getWallet());

        } else if (userinput.toLowerCase().equals("funnel cake") && Wallet.getWallet() < 2) {
            System.out.println("You cannot afford a funnel cake");
        } else if (userinput.toLowerCase().equals("hotdog") && Wallet.getWallet() < 6) {
            System.out.println("You cannot afford a hotdog");
        } else if (userinput.toLowerCase().equals("popcorn") && Wallet.getWallet() < 5) {
            System.out.println("You cannot afford popcorn");
        } else if (userinput.toLowerCase().equals("large popcorn") && Wallet.getWallet() < 10) {
            System.out.println("You cannot afford a large popcorn");
        } else if (userinput.toLowerCase().equals("cake") && Wallet.getWallet() < 2) {
            System.out.println("You cannot afford a cake");


        }


    }
}



