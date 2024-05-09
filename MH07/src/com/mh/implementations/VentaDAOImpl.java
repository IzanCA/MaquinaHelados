/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mh.implementations;

import com.mh.interfaces.VentaDAO;
import com.mh.pojo.Venta;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author dev
 */
public class VentaDAOImpl implements VentaDAO, AutoCloseable{

    static {
        try {
            Class.forName(com.mh.utils.Configuration.DRIVER);
        } catch (Exception e) {

            System.exit(1);
        }
    }
    
    Connection con = null;
    
    public VentaDAOImpl() throws Exception{
        con = DriverManager.getConnection(com.mh.utils.Configuration.URL);
    }
    
    @Override
    public Venta insertVenta(Venta v) throws Exception {

        String sql = "INSERT INTO venta VALUES(datetime('now'),?,?,?,?,?)";
        
        try (PreparedStatement pstm = con.prepareStatement(sql);) {
            pstm.setString(1, v.getPosicion());
            pstm.setString(2, v.getNombre());
            pstm.setDouble(3, v.getPrecio());
            pstm.setString(4, v.getTipo());
            pstm.setInt(5, v.getCantidad());
            pstm.executeUpdate();
        } catch (Exception e) {
            throw e;
        }
        return v;
    }

    @Override
    public List<Venta> getVentas() throws Exception  {
        Venta v = null;
        ArrayList<Venta> l = new ArrayList<>();
        
        String sql = "select fecha_hora, posicion, nombre, tipo, precio, cantidad from venta";
        try (PreparedStatement pstm = con.prepareStatement(sql); ResultSet rs = pstm.executeQuery();) {
            while (rs.next()) {
                v = new Venta(rs.getString("fecha_hora"), rs.getString("posicion"), rs.getString("nombre"), rs.getDouble("precio"), rs.getString("tipo"), rs.getInt("cantidad"));
                l.add(v);
            }
        } catch (Exception e) {
            throw e;
        }
        return l;
    }

    
    

    
    @Override
    public void close() throws Exception {
        con.close();
    }
    
}
