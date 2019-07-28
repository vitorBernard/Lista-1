import java.io.*;
public class Ex3
{
	public static void main ( String[] args) throws Exception
	{
		BufferedReader inData;
		inData = new BufferedReader(new InputStreamReader(System.in));
		String aux;
		try{
			System.out.println("Digite o numero de angulos:");
			aux = inData.readLine();
			int a = Integer.parseInt(aux);
			
			AnguloObj [] lista = new AnguloObj[a];
			
			
			for (int i =0; i<lista.length; i++)
			{
				System.out.println("\nDigite a medida em graus do angulo "+ (i+1) +":");
				aux = inData.readLine();
				lista[i] = new AnguloObj((Double.parseDouble(aux)));
			}
			
			System.out.println("\nResultado =====================");
			
			
			for (int i=0; i<lista.length; i++)
			{
				System.out.println(lista[i]);
			}				
		}
			catch ( NumberFormatException e)
			{
			System.out.println( "argumento nao eh valido.");
			}
	}
}