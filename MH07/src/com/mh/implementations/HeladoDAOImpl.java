/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mh.implementations;

import com.mh.interfaces.HeladoDAO;
import com.mh.pojo.Helado;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dev
 */
public class HeladoDAOImpl implements HeladoDAO, AutoCloseable {
    
    

    static {
        try {
            Class.forName(com.mh.utils.Configuration.DRIVER);
        } catch (Exception e) {

            System.exit(1);
        }
    }
    
    Connection con = null;
    
    public HeladoDAOImpl() throws Exception{
        con = DriverManager.getConnection(com.mh.utils.Configuration.URL);
    }

    @Override
    public Helado getHeladoByPosicion(String pos) throws Exception {
        Helado h = null;
        String sql = "select posicion, nombre, tipo, precio, cantidad from helado where posicion = ?";
        try (PreparedStatement pstm = con.prepareStatement(sql);) {
            pstm.setString(1, pos);
            try (ResultSet rs = pstm.executeQuery();) {
                if (rs.next()) {
                    h = new Helado(rs.getString("posicion"), rs.getString("nombre"), rs.getDouble("precio"), rs.getString("tipo"), rs.getInt("cantidad"));
                }
            } catch (Exception e) {
                throw e;
            }

        } catch (Exception e) {
            throw e;
        }
        return h;
    }

    @Override
    public int updateHelado(Helado h) throws Exception {
        int v=0;
        String sql = "Update helado set cantidad = ?, nombre = ?, precio = ?, tipo = ? where posicion = ?";
        try (PreparedStatement pstm = con.prepareStatement(sql);) {
            pstm.setInt(1, h.getCantidad());
            pstm.setString(2, h.getNombre());
            pstm.setDouble(3, h.getPrecio());
            pstm.setString(4, h.getTipo());
            pstm.setString(5, h.getPosicion());
            
            v = pstm.executeUpdate();
        } catch (Exception e) {
            throw e;
        }

       return v;
    }

    @Override
    public List<Helado> getHelados() throws Exception {
        Helado h = null;
        ArrayList<Helado> l = new ArrayList<>();
        
        String sql = "select posicion, nombre, tipo, precio, cantidad from helado";
        try (PreparedStatement pstm = con.prepareStatement(sql); ResultSet rs = pstm.executeQuery();) {
            while (rs.next()) {
                h = new Helado(rs.getString("posicion"), rs.getString("nombre"), rs.getDouble("precio"), rs.getString("tipo"), rs.getInt("cantidad"));
                l.add(h);
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
