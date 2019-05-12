package com.example.ketemu;

public class Barang {
    private String namaPenemu;
    private String lokasi;
    private String Judul;
    private int gambarBarang;


    public Barang(String namaPenemu, String lokasi, String judul, int gambarBarang) {
        this.namaPenemu = namaPenemu;
        this.lokasi = lokasi;
        Judul = judul;
        this.gambarBarang = gambarBarang;
    }

    public int getGambarBarang() {
        return gambarBarang;
    }

    public void setGambarBarang(int gambarBarang) {
        this.gambarBarang = gambarBarang;
    }

    public String getNamaPenemu() {
        return namaPenemu;
    }

    public void setNamaPenemu(String namaPenemu) {
        this.namaPenemu = namaPenemu;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public String getJudul() {
        return Judul;
    }

    public void setJudul(String judul) {
        Judul = judul;
    }


}
