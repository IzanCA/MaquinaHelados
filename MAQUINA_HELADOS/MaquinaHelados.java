package MAQUINA_HELADOS;

import java.text.DecimalFormat;
import java.util.TreeMap;
import iceExceptions.*;

public class MaquinaHelados {

    private double monedero;
    private double ingresos;
    TreeMap<String, Helado> helados = new TreeMap<String, Helado>();

    public TreeMap<String, Helado> getHelados() {
        return helados;
    }

    public MaquinaHelados() {
//        helados[0][0] = new Helado("ChocoBomba", 1.1, "tarrina");
//        helados[0][1] = new Helado("FresaGuapi", 1.8, "palo");
//        helados[0][2] = new Helado("LimónCanela", 1.5, "cucurucho");
//        helados[1][0] = new Helado("FrigLemon", 1.8, "tarrina");
//        helados[1][1] = new Helado("PiñaHelada", 1.0, "palo");
//        helados[1][2] = new Helado("Moraguay", 1.2, "cucurucho");
//        helados[2][0] = new Helado("ChocoLoco", 1.8, "tarrina");
//        helados[2][1] = new Helado("TuttiFrutti", 1.3, "palo");
//        helados[2][2] = new Helado("Mentazul", 1.2, "cucurucho");

        this.helados.put("00", new Helado("ChocoBomba", 1.1, "tarrina", "00"));
        this.helados.put("01", new Helado("FresaGuapi", 1.8, "palo", "01"));
        this.helados.put("02", new Helado("LimónCanela", 1.5, "cucurucho", "02"));
        this.helados.put("10", new Helado("FrigLemon", 1.8, "tarrina", "10"));
        this.helados.put("11", new Helado("PiñaHelada", 1.0, "palo", "11"));
        this.helados.put("12", new Helado("Moraguay", 1.2, "cucurucho", "12"));
        this.helados.put("20", new Helado("ChocoLoco", 1.8, "tarrina", "20"));
        this.helados.put("21", new Helado("TuttiFrutti", 1.3, "palo", "21"));
        this.helados.put("22", new Helado("Mentazul", 1.2, "cucurucho", "22"));
    }

    public Helado pedirHelado(String posicion) throws iceExceptions.NotValidPositionException, QuantityExceededException, NotEnoughMoneyException {
        //Existe o no la posicion del helado
        if (!this.helados.containsKey(posicion)) {
            throw new iceExceptions.NotValidPositionException("La posición indicada no existe.");
        } else if (this.helados.get(posicion).getCantidad() <= 0) {
            throw new QuantityExceededException("No quedan helados del tipo solicitado");
        } else if (this.getMonedero() < this.helados.get(posicion).getPrecio()) {
            throw new iceExceptions.NotEnoughMoneyException("Saldo insuficiente");
        } else {
            this.helados.get(posicion).setCantidad(this.helados.get(posicion).getCantidad() - 1);
            this.setMonedero(this.getMonedero() - this.helados.get(posicion).getPrecio());
            return this.helados.get(posicion);
        }

//        if (this.getMonedero() >= this.helados.get(posicion).getPrecio() && this.helados.get(posicion).getCantidad() > 0) {
//            this.helados.get(posicion).setCantidad(this.helados.get(posicion).getCantidad() - 1);
//            this.setMonedero(this.getMonedero() - this.helados.get(posicion).getPrecio());
//            return this.helados.get(posicion);
//        } else {
//            return null;
//        }
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        return "Los ingresos de la máquina son de: " + df.format(this.getIngresos()) + "€";
    }

    public double getMonedero() {
        return monedero;
    }

    public void setMonedero(double monedero) {
        this.monedero = monedero;
    }

    public double getIngresos() {
        return ingresos;
    }

    public void setIngresos(double ingresos) {
        this.ingresos = ingresos;
    }
}
