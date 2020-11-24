package com.company;

import java.util.Scanner;

public class Menu {
    static Scanner scan = new Scanner(System.in);
    static String navn;
    static int alder;
    static int niveau;


    public static void run() {
        int tal = 0;
        while (true) {
            udskrivMenu();

            tal = indtastTal();
            scan.nextLine();

            switch (tal) {
                case 1:
                    opretBruger();
                    break;
                case 2:
                    udskrivMedlemmer();
                    break;
                case 3:
                    udskrivØkonomi();
                    break;
                default: System.exit(1);
            }
            //System.out.println("tryk enter for at returnere til hovedmenu");
            //Printer linjen ovenover uden at scanne??
            scan.nextLine();
        }
    }

    public static void udskrivMenu() {
        System.out.println("Hovedmenu - 9 afslutter programmet");
        System.out.println("1. Opret bruger");
        System.out.println("2. Udskriv medlemmer + evt. restance ");
        System.out.println("3. Udskriv samlede kontingent betalinger");
        System.out.print("Indtast menu nummer: ");
    }

    public static int indtastTal(){
        int tal = 0;
        while(!scan.hasNextInt()){
            System.out.println("\nDu skal skrive et tal!");
            System.out.print("Indtast menu nummer: ");
            scan.nextLine();
        }
        tal = scan.nextInt();
        return tal;
    }

    public static void opretBruger() {
        System.out.println();
        System.out.print("Indtast navn: ");
        navn = scan.nextLine();
        System.out.println("Indtast alder: ");
        alder = scan.nextInt();
        if (alder < 18) {
            System.out.println("Kontingent pris: 1000kr");
        }
        else if (alder >= 18 && alder < 60) {
            System.out.println("Kontingent pris: 1600kr");
        }
        else {
            System.out.println("Kontingent pris: 1200kr");
        }
        System.out.println("Motionist eller konkurrencesvømmer? Tast 1 eller 2: ");
        niveau = scan.nextInt();
        if (niveau == 1) {
            System.out.println("Du valgte motionist");
        }
        else {
            System.out.println("Du valgte konkurrencesvømmer");
        }
    }

    public static void udskrivMedlemmer() {
        System.out.println();
        System.out.println("Noget print.all gøgl ind her");
    }

    public static void udskrivØkonomi() {
        System.out.println();
        System.out.println("Igen noget print af alle medlemmers kontingent betaling.");
    }
}


