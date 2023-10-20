/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package awal.Kendaran_class.Sub;

import awal.Kendaran_class.Master.Kendaraan;

/**
 *
 * @author mariq
 */
public class KendaraanR2 extends Kendaraan {

    private int CC,weight;

    public int getCC() {
        return CC;
    }

    public int getWeight() {
        return weight;
    }
    

    @Override
    public void tampilkan() {
        // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println(
                "Data Motor:");
        System.out.printf("%s %d %f %s %f %d",
                getNamaKendaraan(),
                getTahunPembuatan(),
                getKecepatanMaks(),
                getWarna(),
                getHarga(),
                CC,
                weight);

    }

    public KendaraanR2(int CC, int weight, String Name, int Manufactured_Years, double Max_Velocity, String warna, double harga) {
        super(Name, Manufactured_Years, Max_Velocity, warna, harga);
        this.CC = CC;
        this.weight = weight;
    }

   

}
