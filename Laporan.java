/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukl.pkg2;

/**
 *
 * @author Radityo
 */
public class Laporan {

    public void laporan(Barang barang) {
        int x = barang.getJmlBarang();

        System.out.println();
        System.out.println("=====TABEL BARANG YANG DILELANG=====");
        System.out.println("ID \tNama Barang \tHarga Awal \tStatus");
        for (int i = 0; i < x; i++) {
            System.out.println(i + ".\t" + barang.getNamaBarang(i) + "\t\t" + "Rp." + barang.getHargaAwal(i) + "\t" + barang.getStatus(i));
        }
    }

    public void laporan(Petugas petugas) {
        int x = petugas.getJmlPetugas();
        System.out.println("===========TABEL PETUGAS============");
        System.out.println("   Nama \tAlamat \t\tTelepon");
        for (int i = 0; i < x; i++) {
            System.out.println("0. " + petugas.getNama(i) + "\t"
                    + petugas.getAlamat(i) + "\t" + petugas.getTelepon(i) + "\t");
        }
    }

    public void laporan(Masyarakat masyarakat) {
        int x = masyarakat.getJmlMasyarakat();
        System.out.println("\n==========TABEL MASYARAKAT==========");
        System.out.println("ID \tNama \tAlamat \t\tTelepon");
        for (int i = 0; i < x; i++) {
            System.out.println(i + ".\t" + masyarakat.getNama(i) + "\t" + masyarakat.getAlamat(i) + "\t" + masyarakat.getTelepon(i));
        }
    }

}
