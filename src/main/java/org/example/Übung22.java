package org.example;

import java.util.Scanner;

public class Übung22 {
    final static String[][] stundenplan = new String[5][6];
    final static String[] taggen = new String[]{"Mo", "Di", "Mi", "Do", "Fr"};

    public static void main(String[] args) {
        freieZeile();

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

        scanner.close();
    }

    public static void eingaben() {
        int i,j;

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Welcher tag soll gebucht werden? (1~5) ");
            i = scanner.nextInt();
        }while(i < 1 || i > 5);

        do {
            System.out.println("Welcher block soll gebucht werden? (1~6) ");
            j = scanner.nextInt();
        }while(j < 1 || j > 6);

        System.out.println("Geben Sie den Namen ein: ");
        stundenplan[i-1][j-1] = scanner.next().toString();
    }

    public static void  freieZeile() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                stundenplan[i][j] = "frei";
            }
        }
    }

    public static void anzeigen() {
        System.out.print("\t\t\t");

        for (int i = 0; i < 5; i++) {
            System.out.format("%-20s\t", taggen[i]);
        }
        System.out.println();

        for (int j = 0; j < 6; j++) {
            System.out.format("Block %d\t\t", j + 1);

            for (int i = 0; i < 5; i++) {
                System.out.format("%-20s\t", stundenplan[i][j]);
            }
            System.out.println();
        }
    }
}

