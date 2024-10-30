import java.util.Scanner;

public class Tugas2JB9{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        double totalBiaya = 0;

        System.out.println("------ Welcome  -----");
        System.out.println("--- Socrates Cafe ---");
        System.out.println("---------------------");

        System.out.print("Masukkan jumlah pesanan anda: ");
        int jumlahPesanan = sc.nextInt();
        sc.nextLine();

        String[] namaPesanan = new String[jumlahPesanan];
        double[] hargaPesanan = new double[jumlahPesanan];


        for ( int i=0; i <jumlahPesanan; i++){
                System.out.print("Masukkan nama pesanan ke-" + (i + 1) + ": ");
                namaPesanan[i] = sc.nextLine();
    
                System.out.print("Masukkan harga untuk " + namaPesanan[i] + ": ");
                hargaPesanan[i] = sc.nextDouble();
                sc.nextLine();
        }
        System.out.println("--- Daftar Pesanan anda ---");
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.println((i + 1) + " pesanan " + namaPesanan[i] + " - Rp " + hargaPesanan[i]);
            totalBiaya += hargaPesanan[i];
        }

         System.out.println("\nTotal Biaya: Rp " + totalBiaya);
     }
 }