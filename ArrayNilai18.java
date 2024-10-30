import java.util.Scanner;

public class ArrayNilai18{
    public static void main (String[] args){
        Scanner sc = new Scanner( System.in);
        int[]  Nilaiakhir = new int[10];

        for(int i = 0; i < Nilaiakhir.length; i++){
            System.out.print("Masukkan Nilai akhir ke - " + i + ":");
            Nilaiakhir [i] = sc.nextInt();

        }
        for (int i=0; i<Nilaiakhir.length;i++){
            if (Nilaiakhir[i] > 70){
                System.out.println("mahasiswa ke - " + i + "lulus");
            }else{
                System.out.println("mahasiswa ke - " + i + "tidak lulus");
            }
        }
    }
}