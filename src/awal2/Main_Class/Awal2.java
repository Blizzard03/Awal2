/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package awal2.Main_Class;

import awal.Kendaran_class.Kendaraan;

/**
 *
 * @author mariq
 */
public class Awal2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kendaraan kendaraan1 = new Kendaraan("Mobil Sedan", 2020, 180.5, "Merah", 250000000.0);
        Kendaraan kendaraan2 = new Kendaraan("Sepeda Motor", 2022, 120.0, "Hitam", 35000000.0);
        Kendaraan kendaraan3 = new Kendaraan("Truk", 2019, 100.0, "Biru", 500000000.0);

        System.out.println("Kendaraan 1:");
        System.out.println("Nama: " + kendaraan1.getNamaKendaraan());
        System.out.println("Tahun Pembuatan: " + kendaraan1.getTahunPembuatan());
        System.out.println("Kecepatan Maksimum: " + kendaraan1.getKecepatanMaks());
        System.out.println("Warna: " + kendaraan1.getWarna());
        System.out.println("Harga: " + kendaraan1.getHarga());

        System.out.println("\nKendaraan 2:");
        System.out.println("Nama: " + kendaraan2.getNamaKendaraan());
        System.out.println("Tahun Pembuatan: " + kendaraan2.getTahunPembuatan());
        System.out.println("Kecepatan Maksimum: " + kendaraan2.getKecepatanMaks());
        System.out.println("Warna: " + kendaraan2.getWarna());
        System.out.println("Harga: " + kendaraan2.getHarga());

        System.out.println("\nKendaraan 3:");
        System.out.println("Nama: " + kendaraan3.getNamaKendaraan());
        System.out.println("Tahun Pembuatan: " + kendaraan3.getTahunPembuatan());
        System.out.println("Kecepatan Maksimum: " + kendaraan3.getKecepatanMaks());
        System.out.println("Warna: " + kendaraan3.getWarna());
        System.out.println("Harga: " + kendaraan3.getHarga());
    }

}
