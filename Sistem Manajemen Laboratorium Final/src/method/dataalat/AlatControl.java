/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package method.dataalat;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class AlatControl {
Connection con = null;
Statement st = null;
ResultSet rs = null;
String sql = null;

public AlatControl(){
    try {
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dblaboratorium", "root", "");
        st = con.createStatement();
    } catch (Exception e){
        JOptionPane.showMessageDialog(null, "Koneksi database gagal, Terjadi kesalahan pada : \n" + e);
    }
}

public List tampil(){
    List LogAlat = new ArrayList();
    sql = "select kode_alat, nama_alat, satuan, jumlah_stok, denda from tbdataalat order by idalat asc";
    
    try{
        rs = st.executeQuery(sql);
        while (rs.next()){
            DataAlat Do = new DataAlat();
            Do.setKdalat(rs.getString("kode_alat"));
            Do.setNmalat(rs.getString("nama_alat"));
            Do.setSatuan(rs.getString("satuan"));
            Do.setJmlstok(rs.getInt("jumlah_stok"));
            Do.setDenda(rs.getInt("denda"));
            LogAlat.add(Do);
        }
    } catch (Exception e){
        JOptionPane.showMessageDialog(null, "Terjadi kesalahan pada: \n" + e);
    }
    return LogAlat;
}

public int tambahalat(DataAlat e){
    sql = "insert into tbdataalat (kode_alat, nama_alat, satuan, jumlah_stok, denda) values ('"+e.getKdalat()+"', "
            + "'"+e.getNmalat()+"', '"+e.getSatuan()+"', '"+e.getJmlstok()+"', '"+e.getDenda()+"')";
    int hasil = 0;
    
    try{
        hasil = st.executeUpdate(sql);
    } catch (Exception a){
        JOptionPane.showMessageDialog(null, "Terjadi kesalahan pada: \n" + a);
    }
    return hasil;
}

public int editAlat(DataAlat e){
    sql =  "update tbdataalat set nama_alat = '"+e.getNmalat()+"', satuan = '"+e.getSatuan()+"',"
            + " jumlah_stok = '"+e.getJmlstok()+"', denda = '"+e.getDenda()+"' where kode_alat = '"+e.getKdalat()+"'";
    int hasil = 0;
    try {
        hasil = st.executeUpdate(sql);
    } catch (Exception a){
        JOptionPane.showMessageDialog(null, "Terjadi kesalahan pada: \n" + a);
    }
    return hasil;
}

public List cariAlat(String cari){
    List logAlat = new ArrayList();
    sql = "select kode_alat, nama_alat, satuan, jumlah_stok, denda from tbdataalat where satuan "
            +" like '%"+cari+"%' or nama_alat like '%"+cari+"%'";
    
    try {
        rs = st.executeQuery(sql);
        while (rs.next()){
            DataAlat Do = new DataAlat();
            Do.setKdalat(rs.getString("kode_alat"));
            Do.setNmalat(rs.getString("nama_alat"));
            Do.setSatuan(rs.getString("satuan"));
            Do.setJmlstok(rs.getInt("jumlah_stok"));
            Do.setDenda(rs.getInt("denda"));
            logAlat.add(Do);
            
         }
        
    } catch (Exception a){
        JOptionPane.showMessageDialog(null, "Terjadi kesalahan pada: \n" + a);
    }
    return logAlat;
}

public int deleteAlat(DataAlat e){
    sql = "delete from tbdataalat where kode_alat = '"+e.getKdalat()+"'";
    int hasil = 0;
    
    try {
        hasil = st.executeUpdate(sql);
    } catch (Exception a){
        JOptionPane.showMessageDialog(null, "Terjadi kesalahan pada: \n" + a);
    }
    return hasil;
}

public int getJumlahalat() throws SQLException{
    sql = "select count(*) as jumlah_alat " + " from tbdataalat ";
    rs = st.executeQuery(sql);
    int jumlah;
    while (rs.next()){
        jumlah = rs.getInt("jumlah_alat");
        return jumlah;
    }
    return 0;
}

}
