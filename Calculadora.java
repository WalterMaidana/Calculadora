package ar.edu.tw1tm;

public class Calculadora
{
	Double resultado;

		public Double CalcularDivision (Double x,Double z)
		{
			if(z!=0)
			{
				resultado=x/z;
		     return resultado;
			}
			return resultado=0.0;
	    }

		public Double ultimoResultado()
		{
			
			return resultado;
		}
}
