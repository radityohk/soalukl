/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukl.pkg2;

import java.util.Scanner;

/**
 *
 * @author Radityo
 */
public class MainMenu {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Masyarakat masyarakat2 = new Masyarakat();
        Petugas petugas2 = new Petugas();
        Lelang lelang2 = new Lelang();
        Laporan laporan2 = new Laporan();
        
        laporan2.laporan(petugas2);
        
        System.out.println("\n==========SILAHKAN LELANG BARANG ANDA!==========");
        System.out.print("Masukkan ID Petugas                : ");
        int idPetugas = scan.nextInt();
        System.out.println("Selamat datang " + petugas2.getNama(idPetugas) + "!\n");
        
        Barang barang2 = new Barang();
        laporan2.laporan(barang2);
        laporan2.laporan(masyarakat2);
        lelang2.prosesLelang(masyarakat2, lelang2, barang2);
    }

}
