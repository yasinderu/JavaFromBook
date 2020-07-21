package com.yasinderu;

public class TabelPerkalian {
    public void buatTabel() {
        System.out.println("Tabel Perkalian");

        System.out.print("    ");
        for (int i = 1; i <= 9; i++) {
            System.out.print("   " + i);
        }
        System.out.println("\n--------------------------------------------");

        for (int i = 1; i <= 9; i++) {
            System.out.print(i + " | ");
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}
