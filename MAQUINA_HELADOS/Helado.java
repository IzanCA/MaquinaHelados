package MAQUINA_HELADOS;

public class Helado {
    private String nombre;
    private double precio;
    private String tipo;
    private int cantidad = 5;
    private String posicion;

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        return "\t\t" + nombre + "\t" + precio + "€\t" + tipo + "     \t" + cantidad;
    }

    public Helado(String nombre, double precio, String tipo, String posicion) {
        this.nombre = nombre;
        this.precio = precio;
        this.tipo = tipo;
        this.posicion = posicion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
