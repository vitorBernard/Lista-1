public class Angulo
{
	public static double converteAngulo(double graus)
	{
		return Math.toRadians(graus);
	}
	public static double funcaoSeno(double graus)
	{
		return Math.sin(graus);
	}
	public static double funcaoCoseno(double graus)
	{
		return Math.cos(graus);
	}
	public static double funcaoTangente(double graus)
	{
		return Math.tan(graus);
	}
	public static double funcaoCotangente(double graus)
	{
		return 1/Math.tan(graus);
	}
}
