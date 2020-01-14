package Controler;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import DB.DBConnection;

import Model.Buku;

public class BukuDAO {

    static Connection conn;
    static PreparedStatement ps;
    static ResultSet rs;
    static String sql;

    public static int save(Buku b) {
        int status = 0;
        try {
            conn = new DBConnection().setConnection();
            ps = conn.prepareStatement("insert into buku(jenisbuku,judul,harga) values(?,?,?)");
            ps.setString(1, b.getJenisbuku());
            ps.setString(2, b.getJudul());
            ps.setInt(3, b.getHarga());
            status = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }
    
    public static int update(Buku b) {
        int status = 0;
        try {
            conn = new DBConnection().setConnection();
            ps = conn.prepareStatement("update buku set jenisbuku=?,judul=?,harga=? where id_buku=?");
            ps.setString(1, b.getJenisbuku());
            ps.setString(2, b.getJudul());
            ps.setInt(3, b.getHarga());
            ps.setInt(4, b.getId_buku());
            status = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }

    public static int delete(Buku b) {
        int status = 0;
        try {
            conn = new DBConnection().setConnection();
            ps = conn.prepareStatement("delete from buku where id_buku=?");
            ps.setInt(1, b.getId_buku());
            status = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }

        return status;
    }

    public static List<Buku> getAllRecords() {
        List<Buku> list = new ArrayList<Buku>();

        try {
            conn = new DBConnection().setConnection();
            ps = conn.prepareStatement("select * from buku");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Buku u = new Buku();
                u.setId_buku(rs.getInt("id_buku"));
                u.setJenisbuku(rs.getString("jenisbuku"));
                u.setJudul(rs.getString("judul"));
                u.setHarga(rs.getInt("harga"));
                list.add(u);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }

    public static Buku getRecordById(int id) {
        Buku u = null;
        try {
            conn = new DBConnection().setConnection();
            ps = conn.prepareStatement("select * from buku where id_buku=?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                u = new Buku();
                u.setId_buku(rs.getInt("id_buku"));
                u.setJenisbuku(rs.getString("jenisbuku"));
                u.setJudul(rs.getString("judul"));
                u.setHarga(rs.getInt("harga"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return u;
    }
}