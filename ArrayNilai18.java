import java.util.Scanner;

public class ArrayNilai18{
    public static void main (String[] args){
        Scanner sc = new Scanner( System.in);
        int[]  Nilaiakhir = new int[10];

        for(int i = 0; i < 10; i++){
            System.out.print("Masukkan Nilai akhir ke - " + i + ":");
            Nilaiakhir [i] = sc.nextInt();

        }
        for (int i=0; i<10;i++){
            System.out.println("Nilai akhir ke- " + i + " adalah " + Nilaiakhir[1]);
        }
    }
}