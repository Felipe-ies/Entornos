/**
 * Clase auxiliar con varios metodos que comprueban diversas carcteristicas que
 * puede tener un numero
 * 
 * @version 2.0
 * @since 2022-05-18
 * @author JL
 */
public class Numero {

	/**
	 * Indica si un numero tiene exactamente un digito igual a 0
	 * 
	 * @param numero numero de entrada
	 * @return true si el numero tiene exactamente un digito 0. False en caso
	 *         contrario
	 * @see hayXDigito
	 * @author JL
	 */
	public static boolean hayuncero(int numero) {

		return hayXDigito(numero, 0, 1);

	}

	/**
	 * Indica si un numero esta formado por x apariciones de un digito
	 * 
	 * @param numero numero de entrada
	 * @param digito digito a comprobar
	 * @param veces  numero de veces que tiene que aparecer
	 * @return true si se cumplen las condiciones false en caso contrario
	 * @author JL
	 */
	public static boolean hayXDigito(int numero, int digito, int veces) {

		boolean valida;
		int contador = 0;
		String cadena = Integer.toString(numero);

		int i = 0;

		while (i < cadena.length()) {

			char c = cadena.charAt(i);
			String passValue = String.valueOf(c);

			if (passValue.matches(String.valueOf(digito))) {
				contador++;
			}

			i++;
		}

		if (contador == veces) {
			valida = true;
		} else {
			valida = false;
		}

		return valida;

	}

	/**
	 * Indica si un numero es divisor de otro
	 * 
	 * @param dividendo numero de entrada
	 * @param divisor   posible divisor
	 * @return true si el segundo parametro es divisor del primero
	 * @author JL
	 */
	public static boolean validaDivN(int dividendo, int divisor) {

		return (dividendo % divisor == 0);

	}

	/**
	 * Indica si un numero es divisible entre dos
	 * 
	 * @param numero numero de entrada
	 * @return true si el numero es par
	 * @see validaDivN (metodo auxiliar)
	 * @author JL
	 */
	public static boolean validaDiv2(int numero) {

		return validaDivN(numero, 2);

	}

	/**
	 * Indica si un numero es divisible entre tres
	 * 
	 * @param numero numero de entrada
	 * @return true si el numero es divisible entre 3
	 * @see validaDivN (metodo auxiliar)
	 * @author JL
	 */
	public static boolean validaDiv3(int numero) {

		return validaDivN(numero, 3);

	}

	/**
	 * Indica si un numero es divisible entre cinco
	 * 
	 * @param numero numero de entrada
	 * @return true si el numero es divisible entre 5
	 * @see validaDivN (metodo auxiliar)
	 * @author JL
	 */
	public static boolean validaDiv5(int numero) {

		return validaDivN(numero, 5);

	}

	/**
	 * Indica si un numero tiene exactamente 4 cifras
	 * 
	 * @param numero numero de entrada
	 * @return true si el numero esta comprendido entre 999 y 10000
	 * @see validaDivN (metodo auxiliar)
	 * @author JL
	 */
	public static boolean validaTam(int numero) {
		System.out.print(numero);
		return ((numero > 999) && (numero < 10000));

	}

}
