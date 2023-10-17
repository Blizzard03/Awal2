/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package awal.Kendaran_class;

/**
 *
 * @author mariq
 */
public class Kendaraan {

    private String namaKendaraan;
    private int tahunPembuatan;
    private double kecepatanMaks;
    private String warna;
    private double harga;

    public Kendaraan(String namaKendaraan, int tahunPembuatan, double kecepatanMaks, String warna, double harga) {
        this.namaKendaraan = namaKendaraan;
        this.tahunPembuatan = tahunPembuatan;
        this.kecepatanMaks = kecepatanMaks;
        this.warna = warna;
        this.harga = harga;
    }

    public String getNamaKendaraan() {
        return namaKendaraan;
    }

    public int getTahunPembuatan() {
        return tahunPembuatan;
    }

    public double getKecepatanMaks() {
        return kecepatanMaks;
    }

    public String getWarna() {
        return warna;
    }

    public double getHarga() {
        return harga;
    }

    
}
