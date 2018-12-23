package Model;

import java.sql.Blob;


public class Anggota {
    
    String id;
    String namaAnggota;
    String jenisKelamin;
    String tanggalLahir;
    String agama;
    Petugas petugas = new Petugas();
    Blob fotoAnggota;

    public Anggota() {
    }

    public Anggota(String id, String namaAnggota, String jenisKelamin, String tanggalLahir, String agama, Petugas petugas, Blob fotoAnggota) {
        this.id = id;
        this.namaAnggota = namaAnggota;
        this.jenisKelamin = jenisKelamin;
        this.tanggalLahir = tanggalLahir;
        this.agama = agama;
        this.petugas = petugas;
        this.fotoAnggota = fotoAnggota;
    }
    
    public Anggota(String id, String namaAnggota, String jenisKelamin, String tanggalLahir, String agama, int idPetugas , String namaPetugas , Blob fotoAnggota) {
        this.id = id;
        this.namaAnggota = namaAnggota;
        this.jenisKelamin = jenisKelamin;
        this.tanggalLahir = tanggalLahir;
        this.agama = agama;
        petugas.setId(idPetugas);
        petugas.setNamaPetugas(namaPetugas);
        this.petugas = petugas;
        this.fotoAnggota = fotoAnggota;
    }


      
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNamaAnggota() {
        return namaAnggota;
    }

    public void setNamaAnggota(String namaAnggota) {
        this.namaAnggota = namaAnggota;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public String getAgama() {
        return agama;
    }

    public void setAgama(String agama) {
        this.agama = agama;
    }

    public Petugas getPetugas() {
        return petugas;
    }

    public void setPetugas(Petugas petugas) {
        this.petugas = petugas;
    }

    public Blob getFotoAnggota() {
        return fotoAnggota;
    }

    public void setFotoAnggota(Blob fotoAnggota) {
        this.fotoAnggota = fotoAnggota;
    }
    
    
    
}
