import java.io.*;
public class Ex5
{
	public class GeneroException extends Exception
	{
		System.out.println("Genero nao definido.");
	}
	
	public class teste1
	{
		Homem homem = new Homem();
		System.out.println("digite o nome:");
		homem.setNome = inData.readLine();
				
		System.out.println("\ndigite a data de nascimento:");
		homem.setDataNascimento = inData.readLine();
				
		System.out.println("\ndigite o peso:");
		aux = inData.readLine();
		homem.SetPeso = Double.parseDouble(aux);
				
		System.out.println("\ndigite a altura (em metros):");
		aux = inData.readLine();
		homem.setAltura = Double.parseDouble(aux);
	}
	
	public static void main (String[] args ) throws Exception
	{
		BufferedReader inData;
		inData = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Digite o numero de pessoas");
		String aux = inData.readLine();
		int a = Integer.parseInt(aux);
		String nome, dataNascimento;
		double peso, altura;
		
		for ( int i=0; i<a ; i++)
		{
			System.out.println("Inserir homem (h) ou mulher(m)?");
			aux = inData.readLine();
			
			
			
			if ( aux != "h" || aux != "m") throws new GeneroException();
			else if ( aux == "h")
			{
				
				
			}				