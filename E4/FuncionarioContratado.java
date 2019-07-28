public class FuncionarioContratado extends funcionario
{
	private int dependentes;
	private float sFamilia;
	private float VALOR_POR_DEP = 9.58;
	private float ELIQUOTA_IR = 15/100;

	// construtor
	public FuncionarioContratado ( String nome, String codigo, float salario, int dependentes )
	{
		super ( nome, codigo, salario,0);
		this.dependentes = dependentes;
	}
	
	// metodos
	public void calculaSalario ()
	{
		super.calculaSalario (ELIQUOTA_IR);
	}
	
	public void calculaSalario( int numeroDependentes )
	{
		sFamilia  = numeroDependentes*VALOR_POR_DEP;
		calculaSalario();
	}
	
	public String toString()
	{
		return ("\n nome: " + getNome() + "\ncodigo:" + getCodigo() + "\nsalario-base:" + getSalario() );
	}

	// encapsulamentos
	public float getSFamilia ()
	{
		return this.sFamilia;
	}
}