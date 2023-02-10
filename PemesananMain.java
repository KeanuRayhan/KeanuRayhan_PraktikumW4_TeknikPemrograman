package Kasus2;

import java.util.Scanner;

public class PemesananMain {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int noDaftar=0, porsi=0;
		char konfirmasi = 'Y';
		Penjualan menu = new Penjualan();
		
		menu.tambahMenuMakanan("Batagor Kering", 5_000, 20);
		menu.tambahMenuMakanan("Roti Bakar", 12_000, 20);
		menu.tambahMenuMakanan("IndomieTelor", 10_000, 20);
		menu.tambahMenuMakanan("Kwetiaw Goreng", 12_000, 20);
		menu.tambahMenuMakanan("Nasi Goreng", 12_000, 20);
		menu.tambahMenuMakanan("Air Mineral", 3_000, 20);
		menu.tambahMenuMakanan("Teh Manis", 4_000, 20);
		menu.tambahMenuMakanan("Jus Alpukat", 8_000, 20);
		menu.tambahMenuMakanan("Teh Botol", 5_000, 20);
		menu.tambahMenuMakanan("Kopi Hitam", 3_000, 20);
		
		menu.tampilDaftarMenu();
		
		while(konfirmasi != 'N') {
			System.out.println("\nMau Pesan Apa ?(Pilihlah sesuai no. Daftar Menu)");
			noDaftar = keyboard.nextInt();
			System.out.println("Pesan Berapa Porsi ?");
			porsi = keyboard.nextInt();
			
			menu.pengecekanNoDaftar(noDaftar, porsi);
			
			System.out.println("Apakah anda ingin memesan lagi ?");
			konfirmasi= keyboard.next().toUpperCase().charAt(0);
			
		}
		menu.perhitunganPerJenis();
		keyboard.close();
		
	}

}
