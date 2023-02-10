package Kasus2;

public class produk {
	private String nama_produk;
	private double harga;
	private int qty;
	
	public produk(String nama, double harga, int stok) {
		this.nama_produk = nama;
		this.harga = harga;
		this.qty = stok;
	}
	
	public String getNamaMakanan() {
		return this.nama_produk;
	}
	
	public double getHargaMakanan() {
		return this.harga;
	}
	
	public int getStok() {
		return this.qty;
	}
	
	public void setStok(int stok) {
		this.qty = stok;
	}
	
}
