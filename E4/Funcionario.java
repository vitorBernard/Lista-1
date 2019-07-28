public class Funcionario
{
	private String nome;
	private String codigo;
	private float salario;
	private float sLiquido;
	
	// construtor
	public Funcionario ( String nome, String codigo, float salario, float sLiquido)
	{
		this.nome = nome;
		this.codigo = codigo;
		this.salario = salario;
		this sLiquido = sLiquido;
	}
	
	// metodos
	public double calculaSalario ( double desconto)
	{
		this.sLiquido = salario - desconto;
		return sLiquido;
	}
	
	public String toString()
	{
		return ("\n nome: " + getNome() + "\ncodigo:" + getCodigo() + "\nsalario-base:" + getSalario() + "\nsalario Liquido:" + getSLiquido() );
	}
	

  // encapsulamento
	public String getNome()
	{
		return this.nome;
	}
	public String getCodigo()
	{
		return this.codigo
	}
	public float getSalario()
	{
		return this.salario;
	}
	public float getSLiquido()
	{
		return this.sLiquido;
	}
}