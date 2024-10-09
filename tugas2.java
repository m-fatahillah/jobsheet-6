import java.util.Scanner;
public class tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        String jenisBuku;
        int jumlah;
        double diskon = 0;

        System.out.println("------------ TOKO BUKU ------------");
        System.out.print("Masukkan jenis buku : ");
        jenisBuku = input.nextLine();
        System.out.print("Masukkan jumlah : ");
        jumlah = input.nextInt();

        if (jenisBuku.equalsIgnoreCase("kamus")) {
            diskon = 0.10;
            if (jumlah > 2 ){
                diskon += 0.02;
            }
        }
        else if (jenisBuku.equalsIgnoreCase("novel")) { 
            diskon += 0.07;
            if (jumlah > 3) {
            diskon += 0.02;
            } else if (jumlah <= 3)
                diskon += 0.01; 
        }
        else {if (jumlah > 3) {
            diskon += 0.05;
        }
    }
        System.out.println("Anda Mendapat Diskon Sebesar : " + diskon);
        input.close();
    }
    
}
