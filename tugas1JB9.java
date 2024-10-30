import java.util.Scanner;

public class tugas1JB9{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int mahasiswa,nilaitertinggi = 0,nilaiterendah = 100;
        double total = 0;
        double rata = 0;
        


        System.out.print("Masukkan Jumlah Mahasiswa : ");
        mahasiswa = sc.nextInt();

        int [] NilaiMhs = new int[mahasiswa];

        for(int i = 0; i <NilaiMhs.length; i++){
            System.out.print("masukkan nilai mahasiswa ke - " + (i+1) + " : ");
            NilaiMhs [i] = sc.nextInt();
            total += NilaiMhs[i];

            if (NilaiMhs[i] > nilaitertinggi) {
                nilaitertinggi = NilaiMhs[i];
            }
            if (NilaiMhs[i] < nilaiterendah) {
                nilaiterendah = NilaiMhs[i];
            }
        }
        rata = total / mahasiswa;
        System.out.println("Total nilai mahasiswa = " + total);
        System.out.println("Nilai tertinggi = " + nilaitertinggi);
        System.out.println("Nilai terendah = " + nilaiterendah);
        System.out.println("Nilai rata-rata = " + rata);
    }
}