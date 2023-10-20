/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package awal.Kendaran_class;

/**
 *
 * @author mariq
 */
public class KendaraanR2 extends Kendaraan {

    private int CC;

    public int getCC() {
        return CC;
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
                CC);

    }

    public KendaraanR2(int CC, String Name, int Manufactured_Years, double Max_Velocity, String warna, double harga) {
        super(Name, Manufactured_Years, Max_Velocity, warna, harga);
        this.CC = CC;
    }

}
