package calculadora;


public class CalculadoraPoo {
	public static void main(String[] args) {
		Calculadora c = new Calculadora(5, 2);
		
		// metodo do operador a ser acionado
		c.setOperador();
		// operadores
		c.operadorAdicao();
		c.operadorSubtracao();
		c.operadorMultiplicacao();
		c.operadorDivisao();
	}

}
