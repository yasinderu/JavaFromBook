package com.yasinderu;

public class Kalender {
    private int tahun;
    private int bulan;

    public Kalender(int tahun, int bulan) {
        this.tahun = tahun;
        this.bulan = bulan;
    }

    public void tampilKalender() {
        tampilJudulBulan(this.tahun, this.bulan);
        tampilTubuhBulan(this.tahun, this.bulan);
    }

    private void tampilJudulBulan(int tahun, int bulan) {
        System.out.println(" " + dapatNamaBulan(bulan) + " " + tahun);
        System.out.println("------------------------------------------ ");
        System.out.println(" Minggu Senin Selasa Rabu Kamis Jumat Sabtu");
    }

    private void tampilTubuhBulan(int tahun, int bulan) {
        int hariMulai = dapatHariMulai(tahun, bulan);

        int jumlahHariDalamSebulan = dapatJmlHariDalamSebulan(tahun, bulan);
        for (int i = 0; i < hariMulai; i++) {
            System.out.print("      ");
        }
        for (int i = 1; i <= jumlahHariDalamSebulan; i++) {
            System.out.printf("%6d", i);
            if ((i + hariMulai) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    private String dapatNamaBulan(int bulan) {
        String namaBulan = "";
        switch (bulan) {
            case 1: namaBulan = "January"; break;
            case 2: namaBulan = "February"; break;
            case 3: namaBulan = "Maret"; break;
            case 4: namaBulan = "April"; break;
            case 5: namaBulan = "Mei"; break;
            case 6: namaBulan = "Juni"; break;
            case 7: namaBulan = "Juli"; break;
            case 8: namaBulan = "Agustus"; break;
            case 9: namaBulan = "September"; break;
            case 10: namaBulan = "Oktober"; break;
            case 11: namaBulan = "November"; break;
            case 12: namaBulan = "Desember"; break;
        }
        return namaBulan;
    }

    private int dapatHariMulai(int tahun, int bulan) {
        final int HARI_MULAI_JAN_1_1800 = 3;
        int totalJumlahHari = dapatTotalJmlHari(tahun, bulan);

        return (totalJumlahHari + HARI_MULAI_JAN_1_1800) % 7;
    }

    private int dapatTotalJmlHari(int tahun, int bulan) {
        int total = 0;
        for (int i = 1800; i < tahun; i++) {
            if (apakahTahunKabisat(i)) {
                total += 366;
            }else {
                total += 365;
            }
        }
        for (int i = 1; i < bulan; i++) {
            total += dapatJmlHariDalamSebulan(tahun, i);
        }
        return total;
    }

    private int dapatJmlHariDalamSebulan(int tahun, int bulan) {
        if (bulan == 1 || bulan == 3 || bulan == 5 || bulan == 7 || bulan == 8 ||
            bulan == 10 || bulan == 12) {
            return 31;
        }
        if (bulan == 4 || bulan == 6 || bulan == 9 || bulan == 11) {
            return 30;
        }
        if (bulan == 2) return apakahTahunKabisat(tahun) ? 29 : 28;
        return 0;
    }

    private boolean apakahTahunKabisat(int tahun) {
        return tahun % 400 == 0 || (tahun % 4 == 0 && tahun % 100 != 0);
    }
}
