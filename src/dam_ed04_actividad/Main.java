/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dam_ed04_actividad;

/**
 * Esta clase alberga el metodo principal de la aplicacion y realiza una retirada y un ingreso en un cuenta bancaria
 * @author paseg
 * @version 1.0
 */
public class Main {

    /**
     * Metodo principal de la aplicacion. Instancia una cuenta y opera con ella.
     * @param args
     */
    public static void main(String[] args) {
                       
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
        saldoActual = cuenta1.getSaldo();
        System.out.println("El saldo actual es " + saldoActual);

        operativa_cuenta(cuenta1, 2300.0F);
    }

    /** Este metodo realiza una retirada de una cantidad recibida por parametro, 
     *  y un ingreso fijo de 695 euros.     
     * @param cuenta1 CCuenta - Objeto tipo CCuenta con el que vamos a realizar las operaciones
     * @param cantidad double - Dinero a retirar de la cuenta
     */
    public static void operativa_cuenta(CCuenta cuenta1, float cantidad) {
        
        try {
            cuenta1.retirar(cantidad);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
