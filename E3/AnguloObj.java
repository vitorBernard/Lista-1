public class AnguloObj
{
	private double arcoRad;
	
	// metodos de instancia
	public double converteAngulo(double graus)
	{
		return Math.toRadians(graus);
	}
	public double funcaoSeno(double graus)
	{
		return Math.sin(graus);
	}
	public double funcaoCoseno(double graus)
	{
		return Math.cos(graus);
	}
	public double funcaoTangente(double graus)
	{
		return Math.tan(graus);
	}
	public double funcaoCotangente(double graus)
	{
		return 1/Math.tan(graus);
	}

	//encapsulamento
	public void setArcoRad(double arcoRad)
	{
		this.arcoRad = arcoRad;
	}
	public double getArcoRad()
	{
		return arcoRad;
	}
	
	// construtor
	public AnguloObj ( double graus )
	{
		setArcoRad (converteAngulo(graus));
	}
	
	// toString
	public String toString ()
	{
		return String.format("\nArco:%2.2fRad\nCosseno:%2.2f\nTangente:%2.2f\nCotangente:%2.2f\n",getArcoRad(),funcaoCoseno(getArcoRad()),funcaoTangente(getArcoRad()),funcaoCotangente(getArcoRad()));
	}
}	