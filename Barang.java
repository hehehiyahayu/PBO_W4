package StudiKasus4_1;

public class Barang {
	private String kode_barang;
	private String nama_barang;
	private int stok;

	public Barang(String kode, String nama, int stk) {
		this.kode_barang = kode;
		this.nama_barang = nama;
		this.stok = stk;
	}

	public String getKode_barang() {
		return kode_barang;
	}

	public void setKode_barang(String kode_barang) {
		this.kode_barang = kode_barang;
	}

	public String getNama_barang() {
		return nama_barang;
	}

	public void setNama_barang(String nama_barang) {
		this.nama_barang = nama_barang;
	}

	public int getStok() {
		return stok;
	}

	public void setStok(int stok) {
		this.stok = stok;
	}
	
	public void addStok(int stok) {
		this.stok += stok;
	}

}
