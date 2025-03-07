import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 *  Clase con test unitarios para los m�todos de la clase Numero
 *  En un m�todo se comprueban que se cumplen todas las propiedades
 *  	Debe tener 4 cifras
 *  	Debe ser divisible entre 2 y 3
 *  	Debe contener un 0
 *  Existe un m�todo de test para cada uno de los errores que se puedan producir
 *  @version 	1.1
 * 	@since   	2022-05-18
 *  @see		Numero 
 *  @author		JL
 */
public class TestNumero {
	
	private Numero miNumero;

	/**
	 * Crea un objeto de la clase Numero del que se van a probar los m�todos
	 * @throws Exception Excepci�n que se genera si hay problemas en el setUp (no tratada directamente)
	 */
	@Before
	public void setUp() throws Exception {
		miNumero = new Numero();
	}

	/**
	 *  Test con el n�mero 1230. Cumple las 4 propiedades
	 *  	Debe tener 4 cifras
	 *   	Debe ser divisible entre 2 y 3
	 *		Debe contener un 0
	 */
	@Test
	public void testCorrecta() {
		assertEquals("1230 cumple las 4 propeidades", true, miNumero.hayuncero(1230));
		assertEquals("1230 cumple las 4 propeidades", true, miNumero.validaTam(1230));
		assertEquals("1230 cumple las 4 propeidades", true, miNumero.validaDiv2(1230));
		assertEquals("1230 cumple las 4 propeidades", true, miNumero.validaDiv3(1230));
	}
	
	/**
	 *  Test con el n�mero 330. 
	 *  	Tiene menos de 4 cifras
	 */
	@Test
	public void test3digitos() {
		assertEquals("330 tiene menos de 4 d�gitos", false, miNumero.validaTam(330));
	}
	
	/**
	 *  Test con el n�mero 33330. 
	 *  	Tiene m�s de 4 cifras
	 */	
	@Test
	public void test5digitos() {
		assertEquals("33330 tiene m�s de 4 d�gitos", false, miNumero.validaTam(33330));
	}
	
	/**
	 *  Test con el n�mero 6666. 
	 *  	No tiene ning�n 0
	 */
	@Test
	public void testNingunCero() {
		assertEquals("6666 no tiene ceros", false, miNumero.hayuncero(6666));
	}
	
	/**
	 *  Test con el n�mero 6600. 
	 *  	Tiene m�s de un 0
	 */
	@Test
	public void testMasDeUnCero() {
		assertEquals("6600 tiene m�s de un 0", false, miNumero.hayuncero(6600));
	}
	
	/**
	 *  Test con el n�mero 1203. 
	 *  	No es par
	 */	
	@Test
	public void testImpar() {
		assertEquals("1203 no es par", false, miNumero.validaDiv2(1203));
	}
	
	/**
	 *  Test con el n�mero 2230. 
	 *  	No es divisible entre 3
	 */
	@Test
	public void testNoDivisible3() {
		assertEquals("2230 no es divisible entre 3", false, miNumero.validaDiv3(2230));
	}
	
}
