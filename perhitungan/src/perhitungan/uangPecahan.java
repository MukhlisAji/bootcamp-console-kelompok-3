package perhitungan;
import java.util.Scanner;

public class uangPecahan {

    static void hitungUang(int inputUang) {
        int seratusRibu = 0;
        int limaPuluh = 0;
        int duaPuluh = 0;
        int sepuluh = 0;
        int limaRibu = 0;
        int duaRibu = 0;
        int seribu = 0;
        int limaRatus = 0;
        int duaRatus = 0;
        int seratus = 0;
        int limaPuluhPerak =0;

        while (inputUang > 0) {
            if (inputUang >= 100000) {
                inputUang -= 100000;
                seratusRibu++;
            } else if (inputUang >= 50000) {
                inputUang -= 50000;
                limaPuluh++;
            } else if (inputUang >= 20000) {
                inputUang -= 20000;
                duaPuluh++;
            } else if (inputUang >= 10000) {
                inputUang -= 10000;
                sepuluh++;
            } else if (inputUang >= 5000) {
                inputUang -= 5000;
                limaRibu++;
            } else if (inputUang >= 2000) {
                inputUang -= 2000;
                duaRibu++;
            } else if (inputUang >= 1000) {
                inputUang -= 1000;
                seribu++;
            } else if (inputUang >= 500) {
                inputUang -= 500;
                limaRatus++;
            } else if (inputUang >= 200) {
                inputUang -= 200;
                duaRatus++;
            } else if (inputUang >= 100) {
                inputUang -= 100;
                seratus++;
            } else if (inputUang >= 50) {
                inputUang -= 50;
                limaPuluhPerak++;
            }
        }

        System.out.println("Uang Pecahan: ");
        if (seratusRibu != 0) {
            System.out.println("100.000 " + seratusRibu);
        }
        if (limaPuluh != 0) {
            System.out.println("50.000 \t" + limaPuluh);

        }
        if (duaPuluh != 0) {
            System.out.println("20.000 \t" + duaPuluh);

        }
        if (sepuluh != 0) {
            System.out.println("10.000 \t" + sepuluh);

        }
        if (limaRibu != 0) {
            System.out.println("5.000 \t" + limaRibu);

        }
        if (duaRibu != 0) {
            System.out.println("2.000 \t" + duaRibu);

        }
        if (seribu != 0) {
            System.out.println("1.000 \t" + seribu);

        }
        if (limaRatus != 0) {
            System.out.println("500 \t" + limaRatus);

        }
        if (duaRatus != 0) {
            System.out.println("200 \t" + duaRatus);

        }
        if (seratus != 0) {
            System.out.println("100 \t" + seratus);
        }
        if (limaPuluhPerak != 0) {
            System.out.println("50 \t" + seratus);
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Masukkan sejumlah uang: ");
        uangPecahan uang = new uangPecahan();
        uang.hitungUang(s.nextInt());
    }
}