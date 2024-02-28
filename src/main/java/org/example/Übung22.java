package org.example;

import java.util.Scanner;

public class Übung22 {

    final static String[][] stundenplan = new String[5][6];

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        while (running) {
            System.out.println("Menü: ");
            System.out.println("1. Eingaben");
            System.out.println("2. Anzeigen");
            System.out.println("3. Beenden");
            System.out.println("Auswahl");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    eingaben();
                    break;
                case 2:
                    anzeigen();
                    break;
                case 3:
                    running = false;
                    break;

                default:
                    System.out.println("Ungültige Eingabe");
            }
        }
    }

    public static void eingaben() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie die Stundenplan ein: ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.println("Stunde " + (j + 1) + " Tag " + (i + 1) + " Eingabe: ");
                stundenplan[i][j] = scanner.nextLine();
            }
        }
    }

    public static void anzeigen() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.println("Stunde " + (j + 1) + " Tag " + (i + 1) + " Stunde: " + stundenplan[i][j]);
            }
        }
    }
}

