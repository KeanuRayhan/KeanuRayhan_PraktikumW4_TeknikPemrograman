
public class Menu {
	//Deklarasi variabel menggunakan private
	private String nama_makanan;
	private double harga_makanan;
	private int stok;
	
	public Menu(String nama, double harga, int stok) {
		this.nama_makanan = nama;
		this.harga_makanan = harga;
		this.stok = stok;
	}
	
	// Tidak semua method menggunakan setter dan getter
	
	public String getNamaMakanan() {
		return this.nama_makanan;
	}
	
	public double getHargaMakanan() {
		return this.harga_makanan;
	}
	
	public int getStok() {
		return this.stok;
	}
	
	public void setStok(int stok) {
		this.stok = stok;
	}
	
	
}
