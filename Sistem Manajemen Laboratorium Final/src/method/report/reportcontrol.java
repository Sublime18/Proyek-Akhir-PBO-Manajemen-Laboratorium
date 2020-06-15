/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package method.report;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author ASUS
 */
public class reportcontrol {
    Connection con = null;
    Statement st = null;
    ResultSet rs = null;
    String sql = null;
    
public reportcontrol(){
    try{
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dblaboratorium", "root", "");
        st = con.createStatement();
    } catch (Exception e){
        JOptionPane.showMessageDialog(null, "Koneksi Database Gagal, Terjadi Kesalahan Pada : \n" + e);
    }
}    

public void cetakSeluruhAlat(){
    try{
        String sumber;
        String tujuan;
        sumber = "src/Report/LaporanAlat.jrxml";
        tujuan = "stc/Report/LaporanAlat.html";
        Map parms = new HashMap();
        JasperReport jr = JasperCompileManager.compileReport(sumber);
        JasperPrint jp = JasperFillManager.fillReport(jr, parms, con);
        JasperExportManager.exportReportToHtmlFile(jp, tujuan);
        JasperViewer.viewReport(jp, false);
    } catch (Exception xe){
        JOptionPane.showMessageDialog(null, "Koneksi Database Gagal, Terjadi Kesalahan Pada : \n" + xe);
    }
}


}
