
public class Restaurant {
	//deklarasi variabel harus menggunakan private
	private Menu[] makanan;
	private static byte id=0;
	
	public Restaurant() {
		//Restaurant.Menu();
		makanan = new Menu[10];
		
	}
	
	public void tambahMenuMakanan(String nama, double harga, int stok) {
		makanan[id] = new Menu(nama, harga, stok);
		this.nextId();
	}
	
	public void tampilMenuMakanan() {
		for(int i=0; i<id; i++) {
			if(!isOutOfStock(i)) {
				System.out.println(makanan[i].getNamaMakanan() + "("+ makanan[i].getStok() + ")" + "\tRp. " + makanan[i].getHargaMakanan());
			}
		}
	}
	
	public boolean isOutOfStock(int id) {
		if(makanan[id].getStok() == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public void nextId() {
		id++;
	}
	
	public void pemesanan(String nama, int jumlah) {
		for(int i=0; i<id; i++) {
			if(nama == makanan[i].getNamaMakanan()) {
				int sisaStok = makanan[i].getStok() - jumlah;
				makanan[i].setStok(sisaStok);
				printPesanan(sisaStok);
			}
		}
		
	}
	
	public void printPesanan(int sisaStok) {
		System.out.println();
		if(sisaStok < 0) {
			System.out.println("Stok tidak mencukupi");
		} else {
			System.out.println("Pesanan Berhasil");
		}
		System.out.println();
	}
	
}
