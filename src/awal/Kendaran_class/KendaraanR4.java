/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package awal.Kendaran_class;

/**
 *
 * @author mariq
 */
public class KendaraanR4 extends Kendaraan {

    private int Horse_Power;

    public KendaraanR4(int Horse_Power, String Name, int Manufactured_Years, double Max_Velocity, String warna, double harga) {
        super(Name, Manufactured_Years, Max_Velocity, warna, harga);
        this.Horse_Power = Horse_Power;
    }

    @Override
    public void tampilkan() {
        System.out.printf(
                "Data Mobil: \n");
        System.out.printf("%s %d %f %s %f %d \n",
                getNamaKendaraan(),
                getTahunPembuatan(),
                getKecepatanMaks(),
                getWarna(),
                getHarga(),
                Horse_Power
        );
    }

    public int getHorse_Power() {
        return Horse_Power;
    }

}
