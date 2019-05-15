package Main;

import java.util.Scanner;


public class Gift_Shop {


    public void tpShop() {
        System.out.println("Welcome to the shop!");
        System.out.println("Your current amount of money is : " + Wallet.getWallet());
        System.out.println("The following items you can buy are below:");
        System.out.println("Koala Plush $6");
        System.out.println("Giraffe Plush $5");
        System.out.println("Real Monkey $999");
        System.out.println("Monkey Plush $10");
        System.out.println("Bobblehead $2");
        System.out.println("Xbox $150");
        System.out.println("Ps4 $999");
        System.out.println("Real Giraffe $546");
        System.out.println("Snow Globe $5");
        System.out.println("Mug $10");
        Scanner In = new Scanner(System.in);
        String userinput;
        userinput = In.nextLine();
        int giraffeplush = 2;
        int koalaplush = 6;
        int realmonkey = 999;
        int monkeyplush = 10;
        int bobblehead = 2;
        int xbox = 150;
        int ps4 = 999;
        int realgiraffe = 546;
        int snowglobe = 5;
        int mug = 10;


        if (userinput.toLowerCase().equals("koala plush") && Wallet.getWallet() >= 2) {
            System.out.println("You have successfully bought a koala plush");
            Wallet.setWallet(Wallet.getWallet() - koalaplush);
            System.out.println("Your current amount of money is:" + Wallet.getWallet());
        } else if (userinput.toLowerCase().equals("giraffe plush") && Wallet.getWallet() >= 6) {
            System.out.println("You have successfully bought a giraffe plush");
            Wallet.setWallet(Wallet.getWallet() - giraffeplush);
            System.out.println("Your current amount of money is:" + Wallet.getWallet());
        } else if (userinput.toLowerCase().equals("real monkey") && Wallet.getWallet() >= 999) {
            System.out.println("You have successfully bought a real monkey");
            Wallet.setWallet(Wallet.getWallet() - realmonkey);
            System.out.println("Your current amount of money is:" + Wallet.getWallet());
        } else if (userinput.toLowerCase().equals("monkey plush") && Wallet.getWallet() >= 10) {
                System.out.println("You have successfully bought a monkey plush");
                Wallet.setWallet(Wallet.getWallet() - monkeyplush);
                System.out.println("Your current amount of money is:" + Wallet.getWallet());
            } else if (userinput.toLowerCase().equals("bobble head") && Wallet.getWallet() >= 2) {
                System.out.println("You have successfully bought a bobble head");
                Wallet.setWallet(Wallet.getWallet() - bobblehead);
                System.out.println("Your current amount of money is:" + Wallet.getWallet());
            } else if (userinput.toLowerCase().equals("xbox") && Wallet.getWallet() >= 150) {
            System.out.println("You have successfully bought a xbox");
            Wallet.setWallet(Wallet.getWallet() - xbox);
            System.out.println("Your current amount of money is:" + Wallet.getWallet());
        } else if (userinput.toLowerCase().equals("ps4") && Wallet.getWallet() >= 999) {
                    System.out.println("You have successfully bought a ps4");
                    Wallet.setWallet(Wallet.getWallet() - ps4);
                    System.out.println("Your current amount of money is:" + Wallet.getWallet());
                    } else if (userinput.toLowerCase().equals("real giraffe") && Wallet.getWallet() >= 546) {
                    System.out.println("You have successfully bought a real giraffe");
                    Wallet.setWallet(Wallet.getWallet() - realgiraffe);
                    System.out.println("Your current amount of money is:" + Wallet.getWallet());
                } else if (userinput.toLowerCase().equals("mug") && Wallet.getWallet() >= 10) {
            System.out.println("You have successfully bought a mug");
            Wallet.setWallet(Wallet.getWallet() - mug);
            System.out.println("Your current amount of money is:" + Wallet.getWallet());
        } else if (userinput.toLowerCase().equals("snow globe") && Wallet.getWallet() >= 5) {
            System.out.println("You have successfully bought a snow globe");
            Wallet.setWallet(Wallet.getWallet() - snowglobe);
            System.out.println("Your current amount of money is:" + Wallet.getWallet());
        } else if (userinput.toLowerCase().equals("koala plush") && Wallet.getWallet() < 6) {
                System.out.println("You cannot afford a koala plush");
            } else if (userinput.toLowerCase().equals("giraffe plush") && Wallet.getWallet() < 2) {
                System.out.println("You cannot afford a giraffe plush");
            } else if (userinput.toLowerCase().equals("real monkey") && Wallet.getWallet() < 999) {
                System.out.println("You cannot afford a real monkey");
            } else if (userinput.toLowerCase().equals("monkey plush") && Wallet.getWallet() < 10) {
                System.out.println("You cannot afford a monkey plush");
            } else if (userinput.toLowerCase().equals("bobble head") && Wallet.getWallet() < 2) {
            System.out.println("You cannot afford a bobble head");
        } else if (userinput.toLowerCase().equals("xbox") && Wallet.getWallet() < 150) {
            System.out.println("You cannot afford a xbox");
        } else if (userinput.toLowerCase().equals("ps4") && Wallet.getWallet() < 999) {
            System.out.println("You cannot afford a ps4");
        } else if (userinput.toLowerCase().equals("snow globe") && Wallet.getWallet() < 5) {
            System.out.println("You cannot afford a snow globe");
        } else if (userinput.toLowerCase().equals("real giraffe") && Wallet.getWallet() < 546) {
            System.out.println("You cannot afford a real giraffe");
        } else if (userinput.toLowerCase().equals("mug") && Wallet.getWallet() < 10) {
                System.out.println("You cannot afford a mug");

        }


        }
    }



