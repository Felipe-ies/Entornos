import java.util.Scanner;

/**
 *  Programa que comprueba si un n�mero cuenta con una serie de propiedades
 *  	Debe tener 4 cifras
 *  	Debe ser divisible entre 2 y 3
 *  	Debe contener un 0
 *  @version 	1.1
 * 	@since   	2022-05-18
 *  @see		Numero 
 *  @author		JL
 */
public class Principal {

	/**
	 *  M�todo main
	 *  Bucle en el que va pidiendo n�meros al usuario para comprobar si se cumplen las 4 propiedades
	 *  Debe escribir "salir" para terminar
	 *  @param args 	No utilizado ya que se piden por teclado los n�meros
	 */
	public static void main(String[] args) {

		Numero miP = new Numero();
		Scanner sc = new Scanner(System.in);
		boolean salir = false;
		String palabra;
		
		System.out.println("Comprobador de n�meros => el n�mero tiene que ser de 4 cifras (sin ceros a la izquierda), contenener un 0 y ser divisible entre 2 y entre 3");
		
		while(!salir) {
			
			System.out.println("Escribe el n�mero que quieres comprobar ('salir' para terminar)");
			palabra = sc.nextLine();
			
			if(palabra.equalsIgnoreCase("salir")) {
				salir = true;
				System.out.println("HASTA LA PROXIMA!!!");
				break;
			} 
			
			try {
				int numero = Integer.valueOf(palabra);
				
				if(miP.validaTam(numero) && miP.hayuncero(numero) &&  miP.validaDiv2(numero) &&  miP.validaDiv3(numero)){
					System.out.println("El numero " + palabra + " cumple las propiedades: tiene 4 cifras, un 0 y es divisible entre 2 y 3");
				}else {
					System.out.println("El numero " + palabra + " no cumple las propiedades");
				}
				
			}catch(Exception e) {
				System.out.println("No se ha escrito un n�mero v�lido");
			}

			

			
		}
		

	}
}

