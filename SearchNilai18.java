import java.util.Scanner;
public class SearchNilai18{
    public static void main (String [] args){
        Scanner sc = new Scanner( System.in);
        int key = 0;
        int hasil = 0;
        int jumlahNilai;

        System.out.print("Masukkan Jumlah Mahasiswa : ");
         jumlahNilai = sc.nextInt();

         int [] arrNilai = new int [jumlahNilai]; 
        
        for(int i= 0; i < arrNilai.length; i++){
            System.out.print("masukkan nilai mahasiswa ke - " + (i+1) + ":");
            arrNilai [i] = sc.nextInt();
        }
        System.out.println(" masukkan nilai yang akan anda cari");
        key = sc.nextInt();
        for (int i =0; i < arrNilai.length;i++){
            if ( arrNilai[i] == key){
                hasil = i;
                break;
            }
        }
        if (hasil !=0){
            System.out.println("nilia yang anda cari" + key + ", merupakan nilai dari mahasiswa ke- : " + (hasil + 1));
        }else{
        
            System.out.println("nilai yang anda cari tidak ditemukan");
        }



    }
}
