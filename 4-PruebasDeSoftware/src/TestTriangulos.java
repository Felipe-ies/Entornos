import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestTriangulos {

	@Test
	void test() {
		Triangulo t1 = new Triangulo(3,3,5);
		Triangulo t2 = new Triangulo(3,5,3);
		
		assertEquals("Isosceles",t1.tipoTriangulo(),"Result");
		//assertEquals("Isosceles",t2.tipoTriangulo(),"Result");
		assertEquals("Isosceles",t2.tipoTrianguloMejorado(),"Result");
	}

}
