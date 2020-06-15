/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package method.dataalat;

/**
 *
 * @author ASUS
 */
public class DataAlat {

public String kode_alat, nama_alat, satuan;
public int jumlah_stok, denda;

public String getKdalat(){
    return kode_alat;
}

public void setKdalat(String kode_alat){
    this.kode_alat = kode_alat;
}

public String getNmalat(){
    return nama_alat;
}

public void setNmalat(String nama_alat){
    this.nama_alat = nama_alat;
}

public String getSatuan(){
    return satuan;
}

public void setSatuan(String satuan){
    this.satuan = satuan;
}

public int getJmlstok(){
    return jumlah_stok;
}

public void setJmlstok(int jumlah_stok){
    this.jumlah_stok = jumlah_stok;
}

public int getDenda(){
    return denda;
}

public void setDenda(int denda){
    this.denda = denda;
}

}
