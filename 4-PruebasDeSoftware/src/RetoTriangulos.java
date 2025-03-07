
public class RetoTriangulos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangulo t1 = new Triangulo(3,3,3);
		Triangulo t2 = new Triangulo(3,3,5);
		Triangulo t3 = new Triangulo(3,4,5);
		Triangulo t4 = new Triangulo(3,5,3);
		
		System.out.println(t1.tipoTriangulo());
		System.out.println(t2.tipoTriangulo());
		System.out.println(t3.tipoTriangulo());
		
		System.out.println(t4.tipoTriangulo());
		System.out.println(t4.tipoTrianguloMejorado());
	}

}
