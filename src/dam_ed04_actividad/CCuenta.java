/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dam_ed04_actividad;

/** Clase CCuenta: Alberga todo lo relativo a la creacion y manipulacion de objetos de tipo cuenta corriente bancaria
 * @version 1.0
 * @author paseg
 */
public class CCuenta {

    /** Metodo Getter (String)
     * @return Devuelve el nombre del propietario del objeto "CCuenta"
     */
    public String getNombre() {
        return nombre;
    }

    /** Metodo Setter - Permite cambiar el nombre del propietario del objeto "CCuenta"
     * @param nombre String - Nuevo nombre del propietario
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /** Metodo Getter (String)
     * @return Devuelve el numero de cuenta del objeto "CCuenta"
     */
    public String getCuenta() {
        return cuenta;
    }

    /** Metodo Setter - Permite cambiar el numero de cuenta del objeto "CCuenta"
     * @param cuenta String - Nuevo numero de cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /** Metodo Getter (double)
     * @return Devuelve el saldo de la cuenta del objeto "CCuenta"
     */
    public double getSaldo() {
        return saldo;
    }

    /** Metodo Setter - Permite cambiar el saldo de la cuenta del objeto "CCuenta"
     * @param saldo double - Nuevo saldo disponible en la cuenta
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /** Metodo Getter (double)
     * @return Devuelve el tipo de interes de la cuenta del objeto "CCuenta"
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /** Metodo Setter - Permite cambiar el tipo de interes de la cuenta del objeto "CCuenta"
     * @param tipoInterés double - Nuevo tipo de interes aplicable a la cuenta del objeto "CCuenta"
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /** Constructor por defecto de objetos tipo CCuenta.
     * No recibe parametros.
     */
    public CCuenta()
    {}

    /** Constructor de objetos tipo CCuenta.
     * Recibe 4 parametros.
     * @param nom String - Nombre del propietario de la cuenta
     * @param cue String - Numero de la cuenta bancaria
     * @param sal double - Saldo de la cuenta banciaria
     * @param tipo double - tipo de interes aplicable a la cuenta
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /** Metodo para realizar ingresos de saldo.
     * Comprueba el saldo en la cuenta y la cantidad a ingresar para verificar que la transaccion es posible.
     * @param cantidad double - Cantidad en euros a ingresar en la cuenta
     * @throws Exception - Se lanza excepcion si se intenta ingresar una cantidad inferior a 0 euros
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /** Metodo para realizar retiradas de saldo.
     * Comprueba el saldo en la cuenta y la cantidad a ingresar para verificar que la transaccion es posible.
     * @param cantidad double - Cantidad en euros a retirar de la cuenta
     * @throws Exception - Se lanza excepcion si se intenta retirar una cantidad mayor al saldo de la cuenta, o si la cantidad es inferior o igual a cero
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (getSaldo()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

}
