import java.util.Scanner;

public class tugas3JB9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("------ Welcome ------");
        System.out.println("------ Socrates Cafe ------");
        System.out.println("-------------------------");

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappuccino", "Chocolate Ice"};
        
        System.out.print("Masukkan nama menu yang akan Anda cari: ");
        String menutersedia = sc.nextLine();
        
        boolean found = false;
        int HasilPencarian = -1;

        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(menutersedia)) {
                HasilPencarian = i;
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Menu \"" + menutersedia + "\" ditemukan pada indeks ke-" + HasilPencarian);
        } else {
            System.out.println("Menu \"" + menutersedia + "\" tidak ditemukan dalam daftar menu.");
        }
    }
}
