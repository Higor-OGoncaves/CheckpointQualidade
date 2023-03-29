package triangulos;

public class Triangulo {

	public String calc(int lado1, int lado2, int lado3) {
		if (lado1 != lado2 && lado2 != lado3 && lado1 != lado3) {
			return "escaleno";
		} else {
			return "nada";
		}
	}
	public String calc1(int ladoE1, int ladoE2, int ladoE3) {
		if (ladoE1 == ladoE2 && ladoE2 == ladoE1 &&  ladoE1 == ladoE3) {
			return "equilatero";
		} else {
			return "nada";
		}
	}
	public String calc2(int ladoI1, int ladoI2, int ladoI3) {
		if (ladoI1 != ladoI2 && ladoI2 == ladoI3) {
			return "isosceles";
		} else {
			return "nada";
		}
	}
}