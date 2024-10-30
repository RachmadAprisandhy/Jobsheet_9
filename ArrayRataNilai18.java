import java.util.Scanner;

public class ArrayRataNilai18{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int [] NilaiMhs = new int[10];
        double total = 0;
        double rata;

        for(int i = 0; i <NilaiMhs.length; i++){
            System.out.print("masukkan nilai mahasiswa ke - " + (i+1) + " : ");
            NilaiMhs [i] = sc.nextInt();
        }
        for (int i = 0; i< NilaiMhs.length; i++){
            total += NilaiMhs [i];
        }
        rata = total /NilaiMhs.length;
        System.out.println("Rata-rata Nilai Mahasiswa = " + rata);

    }
}