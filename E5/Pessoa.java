public class Pessoa
{
	private String nome;
	private String dataNascimento;
	
	// encapsulamento
	public String setNome()
	{
		return this.nome;
	}
	public String setDataNascimento()
	{
		return this.dataNascimento;
	}
	public void getNome(String nome)
	{
		this.nome = nome;
	}
	public void getDataNascimento()
	{
		this.DataNascimento = dataNascimento;
	}

	//metodo
	public String toString()
	{
		return ( "nome: " +setNome()+ "\nData de Nascimento: " +setDataNascimento() + "\n");
	}
	
	// Construtor
	public Pessoa(String nome, String dataNascimento)
	{
		getNome(nome);
		setDataNascimento(dataNascimento);
	}	
}