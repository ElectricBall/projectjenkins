package Controler;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import DB.DBConnection;

import Model.Register;

public class RegisterDAO {

    static Connection conn;
    static PreparedStatement ps;
    static ResultSet rs;
    static String sql;

    public static int save(Register b) {
        int status = 0;
        try {
            conn = new DBConnection().setConnection();
            ps = conn.prepareStatement("insert into register(username,password,address) values(?,?,?)");
            ps.setString(1, b.getUsername());
            ps.setString(2, b.getPassword());
            ps.setString(3, b.getAddress());
            
            status = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }

    public static int update(Register b) {
        int status = 0;
        try {
            conn = new DBConnection().setConnection();
            ps = conn.prepareStatement("update register set username=?,password=?,address=? where id_user=?");
            ps.setString(1, b.getUsername());
            ps.setString(2, b.getPassword());
            ps.setString(3, b.getAddress());
            ps.setInt(5, b.getId_user());
            status = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }

    public static int delete(Register b) {
        int status = 0;
        try {
            conn = new DBConnection().setConnection();
            ps = conn.prepareStatement("delete from register where id_user=?");
            ps.setInt(1, b.getId_user());
            status = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }

        return status;
    }

    public static List<Register> getAllRecords() {
        List<Register> list = new ArrayList<Register>();

        try {
            conn = new DBConnection().setConnection();
            ps = conn.prepareStatement("select * from register");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Register u = new Register();
                u.setId_user(rs.getInt("id_user"));
                u.setUsername(rs.getString("username"));
                u.setPassword(rs.getString("password"));
                u.setAddress(rs.getString("address"));
                list.add(u);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }

    public static Register getRecordById(int id) {
        Register u = null;
        try {
            conn = new DBConnection().setConnection();
            ps = conn.prepareStatement("select * from register where id_user=?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                u = new Register();
                u.setId_user(rs.getInt("id_user"));
                u.setUsername(rs.getString("username"));
                u.setPassword(rs.getString("password"));
                u.setAddress(rs.getString("address"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return u;
    }
}