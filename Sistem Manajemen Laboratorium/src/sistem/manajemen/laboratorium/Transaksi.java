/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistem.manajemen.laboratorium;

/**
 *
 * @author Asus
 */
public class Transaksi {
    
    private String IDLaboran;
    private String NIM;
    private String Tanggal_Peminjaman;
    private String Tanggal_Pengembalian;
    private Float Denda;
    
    public String getIDLaboran(){
        return IDLaboran;
    }
    
    public String getNIM(){
        return NIM;
    }
    
    public String getTanggal_Peminjaman(){
        return Tanggal_Peminjaman;
    }
    
    public void setTanggal_Peminjaman(String Tanggal_Peminjaman){
        this.Tanggal_Peminjaman = Tanggal_Peminjaman;
    }
    
    public String getTanggal_Pengembalian(){
        return Tanggal_Pengembalian;
    }
    
    public void setTanggal_Pengembalian(String Tanggal_Pengembalian){
        this.Tanggal_Pengembalian = Tanggal_Pengembalian;
    }
    
    public void setDenda(Float Denda){
        this.Denda = Denda;
    }
    
}
