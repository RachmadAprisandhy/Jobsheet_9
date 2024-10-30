import java.util.Scanner;

public class ArrayRataNilai18{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int mahasiswa,mahasiswalulus = 0,mahasiswatidaklulus = 0;
        double total = 0;
        double rata=0,ratatidaklulus = 0,ratalulus = 0,totallulus = 0,totaltidaklulus = 0;
        


        System.out.print("Masukkan Jumlah Mahasiswa : ");
        mahasiswa = sc.nextInt();

        int [] NilaiMhs = new int[mahasiswa];

        for(int i = 0; i <NilaiMhs.length; i++){
            System.out.print("masukkan nilai mahasiswa ke - " + (i+1) + " : ");
            NilaiMhs [i] = sc.nextInt();
            if (NilaiMhs[i] > 70){
                mahasiswalulus ++;
                totallulus += NilaiMhs[i];
            }if(NilaiMhs [i]<= 70){
                mahasiswatidaklulus ++;
                totaltidaklulus += NilaiMhs[i];
            }
        }
        ratalulus = totallulus / mahasiswalulus;
        ratatidaklulus = totaltidaklulus / mahasiswatidaklulus;
        System.out.println("Rata-rata Nilai Mahasiswa lulus = " + ratalulus);
        System.out.println("Rata-rata Nilai Mahasiswa tidak lulus= " + ratatidaklulus);

    }
}