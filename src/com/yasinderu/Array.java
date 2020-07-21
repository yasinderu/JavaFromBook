package com.yasinderu;

public class Array {
    public void maxBarisArray2Dimensi () {
        int maxBaris = 0;
        int indexMaxBaris = 0;

        int[][] matrix = new int[4][4];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 100);
            }
        }

        for (int j = 0; j < matrix[0].length; j++) {
            maxBaris += matrix[0][j];
        }
        for (int i = 0; i < matrix.length; i++) {
            int totalBarisIni = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                totalBarisIni += matrix[i][j];
            }
            if (totalBarisIni > maxBaris) {
                maxBaris = totalBarisIni;
                indexMaxBaris = i;
            }
        }

        System.out.println("Baris " + indexMaxBaris + " memiliki penjumlahan maximum = " + maxBaris);
    }

    public void nilaiUjian (char[][] jawaban) {
        char[] kunci = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

        for (int i = 0; i < jawaban.length; i++) {
            int nilai = 0;
            for (int j = 0; j < jawaban[i].length; j++) {
                if (jawaban[i][j] == kunci[j]) {
                    nilai++;
                }
            }
            System.out.println("Jawaban Siswa " + (i+1) + " Memiliki Nilai " + nilai);
        }
    }
}
