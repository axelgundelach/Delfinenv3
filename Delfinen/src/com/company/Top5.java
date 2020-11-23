package com.company;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Top5 {
    private final double Seniorrabat = 0.25;
    private final double totalseniorrabat = 1600 * Seniorrabat;
    Membership ms = new Membership();

    ArrayList<Konkurrence> top5 = new ArrayList<>();
    private final String FILENAME = "C:\\Users\\Wande\\Desktop\\Members.txt";

    public void add(String name, String age, String niveau, String diciplin, String time){
        Konkurrence konkurrence = new Konkurrence(name, age, niveau, diciplin, time);
        top5.add(konkurrence);
    }

    public void listload() {
        try {
            Scanner fileReader = new Scanner(new File(FILENAME));
            while (fileReader.hasNext()) {
                top5.add(new Konkurrence(
                        fileReader.nextLine(),
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

    void listSave() {
        try {
            PrintStream outFile = new PrintStream(new File(FILENAME));
            for (int i = 0; i < top5.size(); i++) {
                Konkurrence p = top5.get(i);
                outFile.println(p.getName());
                outFile.println(p.getAge());
                outFile.println(p.getNiveau());
                outFile.println(p.getDiciplin());
                outFile.println(p.getTime());
            }
            System.out.println("\nFile saved.\n");
        } catch (IOException e) {
            System.out.println("\nI/O exception: " + e + "\n");
        }
    }

    void drawlist(){
        for (int i = 0; i < ms.getList().size(); i++) {
            Kontigent p = ms.getList().get(i);
            String compare = "Konkurrence";
            if(compare.compareTo(get)){
                add(p.getName(), p.getAge(),p.getMembership(), "ikke defineret", "tid");
            }
        }
    }

}
