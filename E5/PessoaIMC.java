public class PessoaIMC extends Pessoa
{
	private double altura;
	private double peso;
	
	//encapsulamento
	public void setAltura(double altura)
	{
		this.altura = altura;
	}
	public void setPeso(double peso)
	{
		this.peso = peso;
	}
	public double getPeso()
	{
		return this.peso;
	}
	public double getAltura()
	{
		return this.altura;
	}
	
	// metodo
	public double calculaIMC (double altura, double peso);
	{
		return altura/peso*peso;
	}
	public String toString()
	{
		return ("\nNome: " + super.getNome() + "\nData de Nascimento: " +super.getDataNascimento()+ "\nPeso: " +
		getPeso() + "\nAltura: " + getAltura() +"\n");
	}
	public abstract String resultIMC();
		
	// construtor
	public PessoaIMC (String nome, String dataNascimento, double peso, double altura)
	{
		super.setNome(nome);
		super.setDataNascimento(dataNascimento);
		this.setAltura(altura);
		this.setPeso(peso);
	}
}