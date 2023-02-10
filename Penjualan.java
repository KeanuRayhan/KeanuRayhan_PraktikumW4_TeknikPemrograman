package Kasus2;

public class Penjualan {
	private produk[] makanan;
	private static byte id = 0;
	private String[] nama_produk;
	private int[] quantity;
	private double[] harga_total;
	private static int indexVariabel=0;
	
	public Penjualan() {
		makanan = new produk[10];
		nama_produk = new String[10];
		quantity = new int[10];
		harga_total = new double[10];
	}
	
	public void tambahMenuMakanan(String nama, double harga, int stok) {
		makanan[id] = new produk(nama, harga, stok);
		this.nextId();
	}
	
	public void tampilDaftarMenu() {
		for(int i=0; i<=45; i++) {
			System.out.print("=");
		}
		System.out.println();
		System.out.println("Daftar Menu Makanan");
		for(int i=0; i<=45; i++) {
			System.out.print("=");
		}
		System.out.println();
		for(int i=0; i<id; i++) {
			System.out.println(i+1 + ". " + makanan[i].getNamaMakanan() + "(" + makanan[i].getStok() + ")" + "\t\tRp. " + makanan[i].getHargaMakanan());
		}
		for(int i=0; i<=45; i++) {
			System.out.print("=");
		}
		System.out.println();
	}

	public boolean isOutOfStock(int id) {
		if(makanan[id].getStok() <= 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public void nextId() {
		id++;
	}
	
	public void nextIndex() {
		indexVariabel++;
	}
	
	public void pengecekanNoDaftar(int no, int jumlah) {
		//String cekMakanan;
		for(int i=0; i<id; i++) {
			if(i == no) {
				makanan[i-1].getNamaMakanan();
				if(!isOutOfStock(i-1)) {
					pengecekanStok(jumlah, i-1);
				}
			}
		}
	}
	
	public void pengecekanStok(int jumlah, int index) {
		int sisaStok = makanan[index].getStok() - jumlah;
		if(sisaStok > 0) {
			this.nama_produk[indexVariabel] = makanan[index].getNamaMakanan();
			this.quantity[indexVariabel] = jumlah;
			this.harga_total[indexVariabel] = makanan[index].getHargaMakanan();
			makanan[index].setStok(sisaStok);
			//perhitungan(index, jumlah);
			nextIndex();
		} else {
			System.out.println("Maaf, Stok tidak mencukupi");
		}
	}
	
	public void perhitunganPerJenis() {
		double[] total_MakananSama;
		total_MakananSama = new double[10];
		for(int i=0; i<=indexVariabel; i++) {
			total_MakananSama[i] = this.harga_total[i] * this.quantity[i];
			}
		perhitunganTotal(total_MakananSama);
		//PrintTotal(total_pembayaran);
	}
	
	public void perhitunganTotal(double harga[]) {
		double total_Pembayaran=0;
		for(int j=0; j<=indexVariabel; j++) {
			total_Pembayaran = total_Pembayaran + harga[j];
		}
		PrintTotal(total_Pembayaran);
	}
		
	public void PrintTotal(double harga) {
		System.out.println();
		for(int i=0; i<=45; i++) {
			System.out.print("=");
		}
		System.out.println();
		System.out.println("Jumlah yang harus dibayar");
		for(int i=0; i<=45; i++) {
			System.out.print("=");
		}
		System.out.println();
		System.out.println("No." + "\tMakanan\t" + "\tQuantity");
		for(int k=0; k<indexVariabel; k++) {
			System.out.println(k+1 + ". " + "\t" + this.nama_produk[k] + "\t" + this.quantity[k]);
		}
		System.out.println();
		for(int i=0; i<=45; i++) {
			System.out.print("=");
		}
		System.out.println();
		System.out.println("Total Pembayaran : Rp. " + harga);
	}
	
	
}
