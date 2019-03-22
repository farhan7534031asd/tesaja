public class AkunAparatur{
	private int nip,jumlahGaji,usia;
	private String nama,divisi,alamat,jenisKelamin,namaInstansi,alamatEmail,noTelepon;

	public AkunAparatur(int nip,int jumlahGaji,String noTelepon,int usia,String nama,String divisi,String alamat,String jenisKelamin,String namaInstansi,String alamatEmail){
		this.nip = nip;
		this.jumlahGaji = jumlahGaji;
		this.noTelepon = noTelepon;
		this.usia = usia;
		this.nama = nama;
		this.divisi = divisi;
		this.alamat = alamat;
		this.jenisKelamin = jenisKelamin;
		this.namaInstansi = namaInstansi;
		this.alamatEmail = alamatEmail;
	}

	public int Nip(){
		return nip;
	}

	public int JumlahGaji(){
		return jumlahGaji;
	}
		
	public String NoTelepon(){
		return noTelepon;
	}

	public int Usia(){
		return usia;
	}

	public String Nama(){
		return nama;
	}

	public String Divisi(){
		return divisi;
	}

	public String Alamat(){
		return alamat;
	}

	public String JenisKelamin(){
		return jenisKelamin;
	}

	public String NamaInstansi(){
		return namaInstansi;
	}

	public String AlamatEmail(){
		return alamatEmail;
	}
}