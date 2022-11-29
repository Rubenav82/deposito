/**
 * 
 */
package cuentas;

/**
 * Clase CCuenta
 * Clase que implementa los atributos y comportamientos de una cuenta bancaria
 * @author ruben.asenjo
 * @version 0.1, 2022-11-29
 */
public class CCuenta {
	/**
	 * Método retorna el nombre de la cuenta
	 * @return the nombre (String)
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Método que establece el nombre de la cuenta
	 * @param nombre the nombre to set (String)
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Método retorna el número de la cuenta
	 * @return the cuenta (String)
	 */
	public String getCuenta() {
		return cuenta;
	}

	/**
	 * Método que establece el número de la cuenta
	 * @param cuenta the cuenta to set (String)
	 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * Método retorna el saldo de la cuenta
	 * @return the saldo (double)
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * Método que establece el saldo de la cuenta
	 * @param saldo the saldo to set (double)
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * Método retorna el interés de la cuenta
	 * @return the tipoInterés (double)
	 */
	public double getTipoInterés() {
		return tipoInterés;
	}

	/**
	 * Método que establece el tipo de interés de la cuenta
	 * @param tipoInterés the tipoInterés to set (double)
	 */
	public void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}

	private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Constructor por defecto de la clase. Vacío.
     */
    public CCuenta()
    {
    }

    /**
     * Constructor sobre cargado que inicializa una cuenta.
     * @param nom - Nombre de la cuenta (String)
     * @param cue - Número de la cuenta (String)
     * @param sal - Saldo de la cuenta (double)
     * @param tipo - Tipo de interés de la cuenta (double)
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * Método que devuelve el saldo de la cuenta.
     * @return saldo (double).
     */
    public double estado()
    {
        return saldo;
    }

    /**
     * Método que suma una cantidad de dinero pasada por parámetro al saldo de la cuenta.
     * @param cantidad - Cantidad a ingresar (double)
     * @throws Exception - Excepción que se lanza en caso de que la cantidad a ingresar sea negativa.
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * Método que resta una cantidad de dinero pasada por parámetro al saldo de la cuenta.
     * @param cantidad - Cantidad a retirar (double)
     * @throws Exception - Excepción que se lanza en caso de que la cantidad a retirar sea negativa o el
     * saldo de la cuenta sea inferior a la cantidad a retirar.
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}
