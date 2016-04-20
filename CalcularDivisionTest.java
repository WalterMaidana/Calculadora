package ar.edu.tw1tm;

/*import static org.junit.Assert.*;*/

import org.junit.Assert;
import org.junit.Test;

public class CalcularDivisionTest
{

	@Test
	public void test()
	{
		Calculadora miDivision=new Calculadora();
		Double resultadoEsperado=15.105;  
		
		miDivision.CalcularDivision(50.3,3.33);
		Double resultadoObtenido=miDivision.ultimoResultado();
			
	    Assert.assertEquals(resultadoEsperado,resultadoObtenido,0.001);
		/*System.out.print(resultadoObtenido);*/
		miDivision=null;
	}

}
