/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mh.biz;

import com.mh.pojo.Helado;
import com.mh.exceptions.*;
import com.mh.implementations.HeladoDAOImpl;
import com.mh.implementations.VentaDAOImpl;
import com.mh.pojo.Venta;
import com.mh.utils.Utils;
import java.util.List;

/**
 *
 * @author enriquenogal
 */
public class MaquinaHelados {

    private double monedero = 0;
    private double ingresos = 0;

    public Helado pedirHelado(String posicion) throws Exception {

        try (HeladoDAOImpl hdi = new HeladoDAOImpl(); VentaDAOImpl vdi = new VentaDAOImpl();) {
            Helado h = hdi.getHeladoByPosicion(posicion);
            if (h == null || posicion == null || posicion == "") {
                throw new NotValidPositionException();
            } else if (h.getCantidad() <= 0) {
                throw new QuantityExceededException();
            } else if (h.getPrecio() > monedero) {
                throw new NotEnoughMoneyException();
            } else {
                h.setCantidad(h.getCantidad() - 1);
                hdi.updateHelado(h);
                this.setMonedero(this.getMonedero() - h.getPrecio());
                this.setIngresos(this.getIngresos() + h.getPrecio());
                vdi.insertVenta(new Venta(h.getPosicion(), h.getNombre(), h.getPrecio(), h.getTipo(), h.getCantidad()));
                return h;
            }
        } catch (Exception e) {
            throw e;
        }
       
    }

    public List<Helado> showIceCream() throws Exception {

        try (HeladoDAOImpl hdi = new HeladoDAOImpl();) {
            return hdi.getHelados();
        } catch (Exception ex) {
            throw ex;
        }
    }

    
    @Override
    public String toString() {
        String s = "";
        try (HeladoDAOImpl hdi = new HeladoDAOImpl();) {
            for (Helado helado : hdi.getHelados()) {
                s = s + helado.toString() + "\n";
            }
        } catch (Exception ex) {

        }
        return s;
    }

    public double getMonedero() {
        return monedero;
    }

    public double getIngresos() {
        return ingresos;
    }

    public void setMonedero(double monedero) {
        this.monedero = Utils.redondeoDosDecimales(monedero);
    }

    public void setIngresos(double ingresos) {
        this.ingresos = Utils.redondeoDosDecimales(ingresos);
    }
    public List<Venta> getVentas() throws Exception{
        try (VentaDAOImpl vdi = new VentaDAOImpl();) {
            return vdi.getVentas();
        } catch (Exception ex) {
            throw ex;
        }
    }
}
