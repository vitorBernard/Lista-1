public class Homem extends PessoaIMC
{
	public String resultIMC()
	{
		double imc = calculaIMC(super.getAltura,super.getPeso);
		if(imc < 20.7)
		{
			return String.format("IMC: %2.2f. Abaixo do peso ideal.",imc);
		}
		else if ( imc >= 20.7 && imc <= 26.4 )
		{
			return String.format("IMC: %2.2f. Peso ideal.",imc);
		}
		else
		{
		return String.format("IMC: %2.2f. Acima do peso ideal.",imc);
		}
	}
}