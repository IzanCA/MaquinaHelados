/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mh.interfaces;

import com.mh.pojo.Venta;
import java.util.List;

/**
 *
 * @author dev
 */
public interface VentaDAO {
    public Venta insertVenta(Venta v) throws Exception;
    public List<Venta> getVentas() throws Exception;
    
}
