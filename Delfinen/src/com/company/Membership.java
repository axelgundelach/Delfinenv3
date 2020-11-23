package com.company;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Membership {


    ArrayList<Kontigent> members = new ArrayList<>();
    private final String FILENAME = "C:\\Users\\Wande\\Desktop\\Members.txt";

    public void add(String name, String age, String membership, String abonnement){
        Kontigent kontigent = new Kontigent(name, age, membership, abonnement);
        members.add(kontigent);
    }

    public void loadList() {
        try {
            Scanner fileReader = new Scanner(new File(FILENAME));
            while (fileReader.hasNext()) {
                members.add(new Kontigent(
                        fileReader.nextLine(),
                        fileReader.nextLine(),
                        fileReader.nextLine(),
                        fileReader.nextLine()));
            }
            System.out.println("\nFile loaded.\n");
        } catch (IOException e) {
            System.out.println("\nI/O exception: " + e + "\n");
        }
    }

    void saveList() {
        try {
            PrintStream outFile = new PrintStream(new File(FILENAME));
            for (int i = 0; i < members.size(); i++) {
                Kontigent p = members.get(i);
                outFile.println(p.getName());
                outFile.println(p.getAge());
                outFile.println(p.getMembership());
                outFile.println((p.getAbonnement()));
            }
            System.out.println("\nFile saved.\n");
        } catch (IOException e) {
            System.out.println("\nI/O exception: " + e + "\n");
        }
    }

}
