public class Mulher
{
	public String resultIMC()
	{
		double imc = calculaIMC(super.getAltura,super.getPeso);
		if(imc < 19)
		{
			return String.format("IMC: %2.2f. Abaixo do peso ideal.",imc);
		}
		else if ( imc >= 19 && imc <= 25.8 )
		{
			return String.format("IMC: %2.2f. Peso ideal.",imc);
		}
		else
		{
		return String.format("IMC: %2.2f. Acima do peso ideal.",imc);
		}
	}