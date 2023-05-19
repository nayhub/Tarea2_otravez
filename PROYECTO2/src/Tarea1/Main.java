package Tarea1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Expendedor exp = new Expendedor(5, 300);
        Comprador c = null;
        Moneda m;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Elige una opción:");
        System.out.println("1. Bebida con moneda de 100");
        System.out.println("2. Bebida con moneda de 500");
        System.out.println("3. Dulce con moneda de 1000");
        System.out.println("4. Dulce con moneda de 1000");

        int opcion = scanner.nextInt();

        try {
            switch (opcion) {
                case 1:
                    m = new Moneda100();
                    c = new Comprador(m, 1, exp);
                    System.out.println("Bebida " + c.ComisteBebiste() + " tu vuelto es de " + c.Vuelto());
                    break;
                case 2:
                    m = new Moneda500();
                    c = new Comprador(m, 2, exp);
                    System.out.println("Bebida " + c.ComisteBebiste() + " tu vuelto es de " + c.Vuelto());
                    break;
                case 3:
                    m = new Moneda1000();
                    c = new Comprador(m, 3, exp);
                    System.out.println("Dulce " + c.ComisteBebiste() + " tu vuelto es de " + c.Vuelto());
                    break;
                case 4:
                    m = new Moneda1000();
                    c = new Comprador(m, 4, exp);
                    System.out.println("Dulce " + c.ComisteBebiste() + " tu vuelto es de " + c.Vuelto());
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } catch (PagoInsuficienteException INS) {
            System.out.println("No le alcanza, tenga su devolucion: " + c.Vuelto());
        } catch (NoHayProductoExcption noHay) {
            System.out.println("No queda el dulce o bebida elegido, devolucion: " + c.Vuelto());
        } catch (PagoIncorrectoException ErrorEnPago) {
            System.out.println("Error en su pago, intente nuevamente");
        }
    }
}
