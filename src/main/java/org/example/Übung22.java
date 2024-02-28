package org.example;

import java.util.Scanner;

public class Übung22 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        String[][] stundenplan = new String[5][6];
        while (running) {}
        System.out.println("Menü: ");
        System.out.println("1. Eingaben");
        System.out.println("2. Anzeigen");
        System.out.println("3. Beenden");
        System.out.println("Auswahl");
        int choice= scanner.nextInt();

        switch(choice){
            case 1:
                stundenplan= test.eingeben( stundenplan);
                break;
            case 2:
                test.anzeigen(stundenplan);
                break;
            case 3:
                running = false;
                break;

            default:
                System.out.println("Ungültige Eingabe");
        }
    }


}