package MAQUINA_HELADOS;

import iceExceptions.*;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exec {

    public static void main(String[] args) throws NotValidPositionException, QuantityExceededException, NotEnoughMoneyException {
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner sc = new Scanner(System.in);
        MaquinaHelados mh = new MaquinaHelados();
        Helado pedido;
        String opcion;
        String posicion;
        do {
            opcion = menu(sc);
            if (opcion.equals("1")) {
                mostrar(mh, df);
            } else if (opcion.equals("2")) {
                introDinero(mh, sc);
            } else if (opcion.equals("3")) {
                System.out.println("------------Pedir Helado---------");
                System.out.print("Introduzca la posición: ");
                posicion = sc.nextLine();

                try {
                    pedido = mh.pedirHelado(posicion);
                    System.out.println("Aquí tiene su " + pedido.getNombre() + " de tipo " + pedido.getTipo());
                    System.out.println("No olovide su cambio: " + mh.getMonedero() + "€");
                    mh.setIngresos(mh.getIngresos() - mh.getMonedero());
                    mh.setMonedero(0);
                } catch (NotValidPositionException e) {
                    System.out.println(e.getMessage());
                } catch (QuantityExceededException e) {
                    System.out.println(e.getMessage());
                } catch (NotEnoughMoneyException e) {
                    System.out.println(e.getMessage());
                }
            } else if (opcion.equals("4")) {
                salir(mh);
            }
        } while (!opcion.equals("4"));
    }

    public static void introDinero(MaquinaHelados mh, Scanner sc) {
        String respuesta;
        do {
            System.out.println("Que moneda quieres meter? ");
            System.out.println("A: 10 céntimos");
            System.out.println("B: 20 céntimos");
            System.out.println("C: 50 céntimos");
            System.out.println("D: 1 euros");
            System.out.println("E: 2 euros");
            System.out.println("F: Fin");
            respuesta = sc.nextLine();
            switch (respuesta) {
                case "A", "a" -> {
                    mh.setMonedero(mh.getMonedero() + 0.1d);
                    mh.setIngresos(mh.getIngresos() + 0.1d);
                }
                case "B", "b" -> {
                    mh.setMonedero(mh.getMonedero() + 0.2d);
                    mh.setIngresos(mh.getIngresos() + 0.2d);
                }
                case "C", "c" -> {
                    mh.setMonedero(mh.getMonedero() + 0.5d);
                    mh.setIngresos(mh.getIngresos() + 0.5d);
                }
                case "D", "d" -> {
                    mh.setMonedero(mh.getMonedero() + 1.0d);
                    mh.setIngresos(mh.getIngresos() + 1.0d);
                }
                case "E", "e" -> {
                    mh.setMonedero(mh.getMonedero() + 2.0d);
                    mh.setIngresos(mh.getIngresos() + 2.0d);
                }
                case "F", "f" -> {
                    break;
                }
                default -> {
                    System.out.println("Introduce un número válido.");
                }
            }
        } while (!respuesta.equalsIgnoreCase("F"));
    }

    public static void mostrar(MaquinaHelados mh, DecimalFormat df) {
        System.out.println("Posición\tNombre \t\tPrecio \tTipo \t\tCantidad");

        for (Helado helado : mh.getHelados().values()) {
            System.out.print(helado.getPosicion());
            System.out.println(helado.toString());
        }
        System.out.println("Tu saldo es de: " + df.format(mh.getMonedero()) + "€");
    }

    public static String menu(Scanner sc) {
        System.out.println("-----------------Elija una opción --------------");
        System.out.println("(1) Mostrar helados");
        System.out.println("(2) Introducir monedas");
        System.out.println("(3) Pedir helado");
        System.out.println("(4) Apagar máquina");
        return sc.nextLine();
    }

    public static void salir(MaquinaHelados mh) {
        System.out.println(mh.toString());
    }
}
