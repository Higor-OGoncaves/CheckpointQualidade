package triangulos;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestClassTriangulo {

	Triangulo triagulo = new Triangulo();
	@Test
	public void TesteEscaleno() {
		int lado1 = 3;
		int lado2 = 6;
		int lado3 = 9;
		String resultado = triagulo.calc(lado1,lado2,lado3);
		
		assertEquals("escaleno", resultado);

	}
	Triangulo triangulo = new Triangulo();
	@Test
	public void TesteEquilatero() {
		
		int lado1 = 3;
		int lado2 = 3;
		int lado3 = 3; 
		
		String resultado = triangulo.calc1(lado1,lado2,lado3);
		
		assertEquals("equilatero", resultado);
	}
	Triangulo triangulo2 = new Triangulo();
	@Test
	public void TesteIsosceles() {
		int lado1 = 3;
		int lado2 = 6;
		int lado3 = 6;
		String resultado = triangulo.calc2(lado1, lado2, lado3);
		assertEquals("isosceles", resultado);
	}
}