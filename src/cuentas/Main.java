/**
 * 
 */
package cuentas;

/**
 * @author ruben.asenjo
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CCuenta cuenta1;
        double saldoActual;

        operativa_cuenta(5000);
        
        System.out.println("Cambio de prueba para commitear");
	}

	/**
	 * @param cantidad TODO
	 * 
	 */
	private static void operativa_cuenta(float cantidad) {
		CCuenta cuenta1;
		double saldoActual;
		cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        try {
            cuenta1.retirar(2300);
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
