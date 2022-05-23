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
public class LiveCoding extends Masyarakat{
    String nama,alamat;
    
    public LiveCoding(){
        this.nama="Slamet";
        this.alamat="Sawoajajar";
        System.out.println(super.nama);
    }
    
    public void live(Barang barang){
        System.out.println("Ini adalah Motor");
    }
    public void live(Petugas petugas){
        System.out.println("Petugas nya bernama Slamet");
    }
    @Override
    public void setNama(String nama){
        this.nama=nama;
    }
    @Override
    public String getNama(int id){
        return this.nama;
    }
    
    
    
}
