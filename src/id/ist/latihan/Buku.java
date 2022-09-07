package id.ist.latihan;

public class Buku {
	String judul;
	int harga;
	int halaman;
	
	public void setBuku(String judul,int harga,int halaman)
	{
		this.judul=judul;
		this.harga=harga;
		this.halaman=halaman;
	}
	public void tampil()
	{
		System.out.println("Judul Buku :"+judul);
		System.out.println("Harga Buku : "+harga);
		System.out.println("Jumlah Halaman : "+halaman);
	}
}
