package com.company;

import java.util.Scanner;

public class Main {
    Scanner in = new Scanner(System.in);
    String name, age, membership, niveau, diciplin, abonnement;

    //sortering af konkurrence svømmere og motionister
    Membership ms = new Membership();

    public void addMembership(){
        System.out.println("Write your name");
        name = in.nextLine();
        System.out.println("Write your age");
        age = in.nextLine();
        System.out.println("Write wether you active or passiv");
        membership = in.nextLine();
        System.out.println("Are you Competitive or svimming for excersie ");
        niveau = in.nextLine();
        if(niveau.equals("Competitive")) {
            System.out.println("Write your age");
            diciplin = in.nextLine();
        } else{
            diciplin = "Not defined";
        }
        abonnement = "0";
        ms.add(name, age, membership, abonnement);
    }

    public static void main(String[] args) {
	// write your code here
    }
}
