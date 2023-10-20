/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package awal2.Main_Class;

import java.text.NumberFormat;
import java.util.*;

import awal.Kendaran_class.Master.Kendaraan;
import awal.Kendaran_class.Sub.KendaraanR2;
import awal.Kendaran_class.Sub.KendaraanR4;

/**
 *
 * @author mariq
 */
public class Awal2 {

        ;

        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) {
                // TODO code application logic here

                // Curency Formatter
                Locale Indonesia = new Locale("in", "ID");
                NumberFormat formater = NumberFormat.getCurrencyInstance(Indonesia);

                // Items 1 - Full Constructors
                final Kendaraan kendaraan1 = new Kendaraan(
                                "Mobil Sedan",
                                2020,
                                180.5,
                                "Merah",
                                250000000.0);

                final Kendaraan kendaraan2 = new Kendaraan(
                                "Sepeda Motor",
                                2022,
                                120.0, "Hitam",
                                35000000.0);

                final Kendaraan kendaraan3 = new Kendaraan(
                                "Truk",
                                2019,
                                100.0,
                                "Biru", 500000000.0);

                // Item 2 - Name and Years Only
                final Kendaraan kendaraan4 = new Kendaraan(
                                "Toyota Corona",
                                1981);
                final Kendaraan kendaraan5 = new Kendaraan(
                                "Honda Beat",
                                2019);
                final Kendaraan kendaraan6 = new Kendaraan(
                                "Suzuki Carry Pick Up",
                                2018);

                // Item 3 - Name and Price Only
                final Kendaraan kendaraan7 = new Kendaraan(
                                "Toyora Starlet Starko GT Turbo",
                                2500000.0);
                final Kendaraan kendaraan8 = new Kendaraan(
                                "Suzuki Smash",
                                850000.0);
                final Kendaraan kendaraan9 = new Kendaraan(
                                "Hino Dutro Cargo 110 SDR",
                                300000000.0);

                // Item 4 - Blank Constructors
                final Kendaraan Kendaraan_10 = new Kendaraan();
                Kendaraan_10.namaKendaraan = "Mitsubitsi Lancer Evo X";
                Kendaraan_10.tahunPembuatan = 2016;
                Kendaraan_10.kecepatanMaks = 274;
                Kendaraan_10.warna = "Black";
                Kendaraan_10.harga = 750000000.0;

                final Kendaraan Kendaraan_11 = new Kendaraan();
                Kendaraan_11.namaKendaraan = "Honda Supra X 125";
                Kendaraan_11.tahunPembuatan = 2022;
                Kendaraan_11.kecepatanMaks = 118;
                Kendaraan_11.warna = "Golden Matte Black";
                Kendaraan_11.harga = 20000000.0;

                final Kendaraan Kendaraan_12 = new Kendaraan();
                Kendaraan_12.namaKendaraan = "Mitsubitshi Fuso FM 517 HL";
                Kendaraan_12.tahunPembuatan = 2023;
                Kendaraan_12.kecepatanMaks = 118;
                Kendaraan_12.warna = "Blue White";
                Kendaraan_12.harga = 830000000.0;

                // Item 5 - Only Name
                final Kendaraan Kendaraan_13 = new Kendaraan(
                                "Suzuki Karimun Wagon");
                final Kendaraan Kendaraan_14 = new Kendaraan(
                                "Honda Vario");
                final Kendaraan Kendaraan_15 = new Kendaraan(
                                "Nissan UD CKE");

                // Item 6 - Name, Year and Velocity
                final Kendaraan Kendaraan_16 = new Kendaraan(
                                "BMW M4",
                                2014,
                                307.4);
                final Kendaraan Kendaraan_17 = new Kendaraan(
                                "Yahama RX King Cobra",
                                1982,
                                140);
                final Kendaraan Kendaraan_18 = new Kendaraan(
                                "Isuzu ELF NMR L",
                                2023,
                                107);

                // Item 7
                final KendaraanR4 mobil;
            mobil = new KendaraanR4(450,120, "BMW M3", 2020, 345, "Silver", 15000000000.0);
                final KendaraanR2 motor = new KendaraanR2(125,125, "Honda CBR 125", 2012, 180, "Red", 28000000);
                /*
                 * Items Printer
                 */
                System.out.println("**************************************");
                System.out.println("Item 1 - Full Constructors");
                System.out.println("**************************************");

                System.out.println("Kendaraan 1:");
                System.out.println("Nama: " + kendaraan1.getNamaKendaraan());
                System.out.println("Tahun Pembuatan: " + kendaraan1.getTahunPembuatan());
                System.out.println("Kecepatan Maksimum: " + kendaraan1.getKecepatanMaks() + " " + "Km/h");
                System.out.println("Warna: " + kendaraan1.getWarna());
                System.out.println("Harga: " + formater.format(kendaraan1.getHarga()));
                System.out.println("**************************************");

                System.out.println("Kendaraan 2:");
                System.out.println("Nama: " + kendaraan2.getNamaKendaraan());
                System.out.println("Tahun Pembuatan: " + kendaraan2.getTahunPembuatan());
                System.out.println("Kecepatan Maksimum: " + kendaraan2.getKecepatanMaks() + " " + "Km/h");
                System.out.println("Warna: " + kendaraan2.getWarna());
                System.out.println("Harga: " + formater.format(kendaraan2.getHarga()));
                System.out.println("**************************************");

                System.out.println("Kendaraan 3:");
                System.out.println("Nama: " + kendaraan3.getNamaKendaraan());
                System.out.println("Tahun Pembuatan: " + kendaraan3.getTahunPembuatan());
                System.out.println("Kecepatan Maksimum: " + kendaraan3.getKecepatanMaks() + " " + "Km/h");
                System.out.println("Warna: " + kendaraan3.getWarna());
                System.out.println("Harga: " + formater.format(kendaraan3.getHarga()));
                System.out.println("**************************************" + "\n");

                System.out.println("**************************************");
                System.out.println("Item 2 - Name and Years Only");
                System.out.println("**************************************");

                System.out.println("Kendaraan 4:");
                System.out.println("Nama: " + kendaraan4.getNamaKendaraan());
                System.out.println("Tahun Pembuatan: " + kendaraan4.getTahunPembuatan());
                System.out.println("**************************************");

                System.out.println("Kendaraan 5:");
                System.out.println("Nama: " + kendaraan5.getNamaKendaraan());
                System.out.println("Tahun Pembuatan: " + kendaraan5.getTahunPembuatan());
                System.out.println("**************************************");
                System.out.println("Kendaraan 6:");
                System.out.println("Nama: " + kendaraan6.getNamaKendaraan());
                System.out.println("Tahun Pembuatan: " + kendaraan6.getTahunPembuatan());
                System.out.println("**************************************" + "\n");

                System.out.println("**************************************");
                System.out.println("Item 3 - Name and Price Only");
                System.out.println("**************************************");

                System.out.println("Kendaraan 7:");
                System.out.println("Nama: " + kendaraan7.getNamaKendaraan());
                System.out.println("Harga: " + formater.format(kendaraan7.getHarga()));
                System.out.println("**************************************");
                System.out.println("Kendaraan 8:");
                System.out.println("Nama: " + kendaraan8.getNamaKendaraan());
                System.out.println("Harga: " + formater.format(kendaraan8.getHarga()));
                System.out.println("**************************************");
                System.out.println("Kendaraan 9:");
                System.out.println("Nama: " + kendaraan9.getNamaKendaraan());
                System.out.println("Harga: " + formater.format(kendaraan9.getHarga()));
                System.out.println("**************************************" + "\n");

                System.out.println("**************************************");
                System.out.println("Item 4 - Blank Constuctors");
                System.out.println("**************************************");

                System.out.println("Kendaraan 10:");
                System.out.println("Nama: " + Kendaraan_10.getNamaKendaraan());
                System.out.println("Tahun Pembuatan: " + Kendaraan_10.getTahunPembuatan());
                System.out.println("Kecepatan Maksimum: " + Kendaraan_10.getKecepatanMaks() + " " + "Km/h");
                System.out.println("Warna: " + Kendaraan_10.getWarna());
                System.out.println("Harga: " + formater.format(Kendaraan_10.getHarga()));
                System.out.println("**************************************");

                System.out.println("Kendaraan 11:");
                System.out.println("Nama: " + Kendaraan_11.getNamaKendaraan());
                System.out.println("Tahun Pembuatan: " + Kendaraan_11.getTahunPembuatan());
                System.out.println("Kecepatan Maksimum: " + Kendaraan_11.getKecepatanMaks() + " " + "Km/h");
                System.out.println("Warna: " + Kendaraan_11.getWarna());
                System.out.println("Harga: " + formater.format(Kendaraan_11.getHarga()));
                System.out.println("**************************************");
                System.out.println("Kendaraan 12:");
                System.out.println("Nama: " + Kendaraan_12.getNamaKendaraan());
                System.out.println("Tahun Pembuatan: " + Kendaraan_12.getTahunPembuatan());
                System.out.println("Kecepatan Maksimum: " + Kendaraan_12.getKecepatanMaks() + " " + "Km/h");
                System.out.println("Warna: " + Kendaraan_12.getWarna());
                System.out.println("Harga: " + formater.format(Kendaraan_12.getHarga()));
                System.out.println("**************************************" + "\n");

                System.out.println("**************************************");
                System.out.println("Item 5 - Name Only");
                System.out.println("**************************************");

                System.out.println("Kendaraan 13:");
                System.out.println("Nama: " + Kendaraan_13.getNamaKendaraan());
                System.out.println("**************************************");
                System.out.println("Kendaraan 14:");
                System.out.println("Nama: " + Kendaraan_14.getNamaKendaraan());
                System.out.println("**************************************");
                System.out.println("Kendaraan 15:");
                System.out.println("Nama: " + Kendaraan_15.getNamaKendaraan());
                System.out.println("**************************************" + "\n");

                System.out.println("**************************************");
                System.out.println("Item 6 - Name Year and Velocity Only");
                System.out.println("**************************************");

                System.out.println("Kendaraan 16:");
                System.out.println("Nama: " + Kendaraan_16.getNamaKendaraan());
                System.out.println("Tahun Pembuatan: " + Kendaraan_16.getTahunPembuatan());
                System.out.println("Kecepatan Maksimum: " + Kendaraan_16.getKecepatanMaks() + " " + "Km/h");

                System.out.println("Kendaraan 17:");
                System.out.println("Nama: " + Kendaraan_17.getNamaKendaraan());
                System.out.println("Tahun Pembuatan: " + Kendaraan_17.getTahunPembuatan());
                System.out.println("Kecepatan Maksimum: " + Kendaraan_17.getKecepatanMaks() + " " + "Km/h");

                System.out.println("Kendaraan 18:");
                System.out.println("Nama: " + Kendaraan_18.getNamaKendaraan());
                System.out.println("Tahun Pembuatan: " + Kendaraan_18.getTahunPembuatan());
                System.out.println("Kecepatan Maksimum: " + Kendaraan_18.getKecepatanMaks() + " " + "Km/h");
                System.out.println("**************************************\n");
                System.out.println("Kendaraan 19:");
                mobil.tampilkan();
                 System.out.println("Kendaraan 20:");
                 motor.tampilkan();

                int[] max_v = {
                                (int) kendaraan1.getHarga(),
                                (int) kendaraan2.getHarga(),
                                (int) kendaraan3.getHarga(),
                                (int) kendaraan7.getHarga(),
                                (int) kendaraan8.getHarga(),
                                (int) kendaraan9.getHarga(),
                                (int) Kendaraan_10.getHarga(),
                                (int) Kendaraan_11.getHarga(),
                                (int) Kendaraan_12.getHarga(),
                                (int) mobil.getHarga(),
                                (int) motor.getHarga(),
                };
                int max = max_v[0];
                for (int i = 0; i < max_v.length; i++) {
                        if (max_v[i] > max) {
                                max = max_v[i];

                        }
                }

                System.out.println("Harga Tertinggi" + " " + formater.format(Kendaraan.Hitung_Harga_Penjualan(max)));
                System.out.println("Programs End");
                System.out.println("**************************************");
                System.out.println("**************************************");
                System.out.println("This Progam Maked by WPA TEAM");
                System.out.println("**************************************");
                mobil.tampilkan();
                motor.tampilkan();

        }
}
