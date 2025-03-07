
public class Triangulo {

	private int ladoA;
	private int ladoB;
	private int ladoC;
	
	//Constructores
	public Triangulo(int ladoA, int ladoB, int ladoC) {
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		this.ladoC = ladoC;
	}
	public Triangulo() {
		this.ladoA = 1;
		this.ladoB = 1;
		this.ladoC = 1;
	}
	
	//Getters
	public int getLadoA() {
		return this.ladoA;
	}
	public int getLadoB() {
		return this.ladoB;
	}
	public int getLadoC() {
		return this.ladoC;
	}
	
	//Setters
	public void setLadoA(int ladoA) {
		this.ladoA = ladoA;
	}
	public void setLadoB(int ladoB) {
		this.ladoB = ladoB;
	}
	public void setLadoC(int ladoC) {
		this.ladoC = ladoC;
	}
	
	//toString
	@Override
	public String toString() {
		return "Triangulo de lado A:" + this.ladoA +
				", ladoB: " + this.ladoB + ", ladoC: " + this.ladoC;
	}
	
	//Otros métodos
	public String tipoTriangulo(){
		if(this.ladoA == this.ladoB && this.ladoB == this.ladoC) {
			return "Equilatero";
		}else if(this.ladoA == this.ladoB && this.ladoB != this.ladoC) {
			return "Isosceles";
		}else if(this.ladoA != this.ladoB && this.ladoB != this.ladoC && this.ladoA != this.ladoC){
			return "Escaleno";
		}else {
			return "Error no corresponde con el formato";
		}
		
		
	}
	
	public String tipoTrianguloMejorado() {
		if(this.ladoA == this.ladoB && this.ladoB == this.ladoC) {
			return "Equilatero";
		}else if(this.ladoA == this.ladoB && this.ladoB != this.ladoC ||
				this.ladoA == this.ladoC && this.ladoB != this.ladoC ||
				this.ladoB == this.ladoC && this.ladoA != this.ladoC){
			return "Isosceles";
		}else if(this.ladoA != this.ladoB && this.ladoB != this.ladoC && this.ladoA != this.ladoC){
			return "Escaleno";
		}else {
			return "Error no corresponde con el formato";
		}
		
		
	}
		
}
