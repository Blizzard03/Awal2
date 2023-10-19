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

    public String namaKendaraan;
    public int tahunPembuatan;
    public double kecepatanMaks;
    public String warna;
    public double harga;

    // Blank Constuctor
    public Kendaraan() {
        this.namaKendaraan = "Unknow";
        this.tahunPembuatan = 0;
        this.kecepatanMaks = 0.0;
        this.warna = "Unknow";
        this.harga = 0.0;
    }

    // Full Constructor
    public Kendaraan(String Name, int Manufactured_Years, double Max_Velocity, String warna, double harga) {
        this.namaKendaraan = Name;
        this.tahunPembuatan = Manufactured_Years;
        this.kecepatanMaks = Max_Velocity;
        this.warna = warna;
        this.harga = harga;
    }

    // Only Name
    public Kendaraan(String namaKendaraan) {
        this.namaKendaraan = namaKendaraan;
    }

    // Only Name and Manufactured Year
    public Kendaraan(String namaKendaraan, int tahunPembuatan) {
        this.namaKendaraan = namaKendaraan;
        this.tahunPembuatan = tahunPembuatan;
    }

    // Only Name and Price
    public Kendaraan(String Name, double Price) {
        this.namaKendaraan = Name;
        this.harga = Price;

    }

    // Only Name, ManufacturedYears, and Max_Velocity
    public Kendaraan(String Name, int Manufactured_Years, double Max_Velocity) {
        this.namaKendaraan = Name;
        this.tahunPembuatan = Manufactured_Years;
        this.kecepatanMaks = Max_Velocity;
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
