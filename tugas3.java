import java.util.Scanner;
public class tugas3 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String merk, kategori;
        int ukuran,harga = 0;

        System.out.println("Toko Sepatu");

        System.out.println("daftar ukuran sepatu");
        System.out.println("merk sepatu  : converse");
        System.out.println("kategori     : ");
        System.out.println("1. slip on   : 36-40");
        System.out.println("2. high on   : 40-44");
        System.out.println("merk sepatu  : sketcher ");
        System.out.println("kategori     : ");
        System.out.println("1. woman     : 36-41 ");
        System.out.println("2. man       : 41-44 ");
        System.out.println("merk sepatu  : nike");
        System.out.println("kategori     : ");
        System.out.println("1. kids      : 36-40 ");
        System.out.println("2. adult     : 40-44 ");

        System.out.print("Masukkan merk : ");
        merk = input.nextLine();

        System.out.print("Masukkan Kategori : ");
        kategori = input.nextLine();

        System.out.print("Masukkan Ukuran : ");
        ukuran = input.nextInt();

        if (merk.equalsIgnoreCase("converse")) {
            if (kategori.equalsIgnoreCase("slip on")) {
                harga = 800000;
            }
            else if (kategori.equalsIgnoreCase("high top")) { 
                harga = 1200000;
            }
        }
        else if (merk.equalsIgnoreCase("sketcher")) {
            if (kategori.equalsIgnoreCase("woman")){
                harga = 1000000;
            } 
            else if (kategori.equalsIgnoreCase("man")) { 
                harga = 1800000;
            }
        }
        else if (merk.equalsIgnoreCase("nike")) {
            if (kategori.equalsIgnoreCase("kids")){
                harga = 750000;
            }
            else if (kategori.equalsIgnoreCase("adult")) { 
                harga = 1500000;
            }
        }
        else {
            System.out.println("Merk Tidak Valid");
        }
        System.out.println("Total Bayar = " + harga );
    }
    
    
}
