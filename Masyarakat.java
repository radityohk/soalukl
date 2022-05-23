/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukl.pkg2;

import java.util.ArrayList;

/**
 *
 * @author Radityo
 */
public class Masyarakat implements UserMasyarakat{
    String nama = "Radityo";

    private ArrayList<String> namaMasyarakat = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();

    public Masyarakat() {
        this.namaMasyarakat.add("Felix");
        this.alamat.add("Asrikaton");
        this.telepon.add("08198778878");
       
        this.namaMasyarakat.add("Radit");
        this.alamat.add("Cemorokandang");
        this.telepon.add("081222233344");
        
        this.namaMasyarakat.add("Ahrasya");
        this.alamat.add("Mergosono");
        this.telepon.add("081659175357");
    }

    public int getJmlMasyarakat() {
        return this.namaMasyarakat.size();
    }
    @Override
    public void setNama(String namaMasyarakat) {
        this.namaMasyarakat.add(namaMasyarakat);
    }
    
    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }
    
    @Override
    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }

    @Override
    public String getNama(int idMasyarakat){
        return this.namaMasyarakat.get(idMasyarakat);
    }
    
    @Override
    public String getAlamat(int idMasyarakat) {
        return this.alamat.get(idMasyarakat);
    }
    
    @Override
    public String getTelepon(int idMasyarakat) {
        return this.telepon.get(idMasyarakat);
    }
}