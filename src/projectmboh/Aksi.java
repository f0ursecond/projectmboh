/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectmboh;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author f0ursecond
 */
public class Aksi {

    private String id, transaksi, jenis_transaksi, layanan;
    private Connection aksiKoneksi;
    private PreparedStatement aksiPsmt;
    private Statement aksiStat;
    private ResultSet aksiResult;
    private String aksiQuery;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTransaksi() {
        return transaksi;
    }

    public void setTransaksi(String transaksi) {
        this.transaksi = transaksi;
    }

    public String getJenis_transaksi() {
        return jenis_transaksi;
    }

    public void setJenis_transaksi(String jenis_transaksi) {
        this.jenis_transaksi = jenis_transaksi;
    }

    public String getLayanan() {
        return layanan;
    }

    public void setLayanan(String layanan) {
        this.layanan = layanan;
    }

    public Aksi() {
        try {
            koneksiData koneksi = new koneksiData();
            aksiKoneksi = koneksi.getKoneksi();
        } catch (SQLException se) {
            System.out.println("ya" + se);
        }
    }

    public ResultSet tampilData() {
        aksiQuery = "select * from tb_pokok";
        try {
            aksiStat = aksiKoneksi.createStatement();
            aksiResult = aksiStat.executeQuery(aksiQuery);

        } catch (SQLException se) {

        }
        return aksiResult;
    }

    public void simpanData(String id, String transaksi, String jenis_transaksi, String layanan) {
        aksiQuery = "insert into tb_pokok values (?,?,?,?)";
        try {
            aksiPsmt = aksiKoneksi.prepareStatement(aksiQuery);
            aksiPsmt.setString(1, id);
            aksiPsmt.setString(2, transaksi);
            aksiPsmt.setString(3, jenis_transaksi);
            aksiPsmt.setString(4, layanan);
            aksiPsmt.execute();
            aksiPsmt.close();
        } catch (SQLException se) {

        }
    }

    public void ubahData(String id, String transaksi, String jenis_transaksi, String layanan) {
        aksiQuery = "update tb_pokok set transaksi=?,jenis_transaksi=?,layanan=? where id=?";
        try {
            aksiPsmt = aksiKoneksi.prepareStatement(aksiQuery);
            aksiPsmt.setString(1, transaksi);
            aksiPsmt.setString(2, jenis_transaksi);
            aksiPsmt.setString(3, layanan);
            aksiPsmt.setString(4, id);
            aksiPsmt.executeUpdate();
            aksiPsmt.close();
        } catch (SQLException se) {

        }

    }

    public void hapusData(String id) {
        aksiQuery = "delete from tb_pokok WHERE id = ?";
        try {
            aksiPsmt = aksiKoneksi.prepareStatement(aksiQuery);
            aksiPsmt.setString(1, id);
            aksiPsmt.executeUpdate();
        } catch (SQLException se) {

        }
    }

}
