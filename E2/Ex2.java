import java.io.*;
class ArgsExcessoException extends Exception
{
	public ArgsExcessoException ( String mensagem )
	{
		super(mensagem);
	}
}
public class Ex2
{
	public static void main (String[] args) throws Exception
	{
		try{
			 if ( args.length!= 1 ) throw new ArgsExcessoException ("Numero de argumentos excessivo.");
			 else
			 {
				 BufferedReader inData;
				 inData = new BufferedReader(new InputStreamReader(System.in));
				 String aux = args[0];
				 while ( aux != "\n"){
					 double a = Math.toRadians(Double.parseDouble(aux));
					 System.out.printf("%s%.2f\n","Seno: ",Angulo.funcaoSeno(a));
					 System.out.printf("%s%.2f\n","Cosseno: ",Angulo.funcaoCoseno(a));
					 System.out.printf("%s%1.2f\n","Tangente: ",Angulo.funcaoTangente(a));
					 System.out.printf("%s%.2f\n","Cotangente: ",Angulo.funcaoCotangente(a));

					 System.out.println("\nDigite uma medida em graus do angulo:");
					 aux = inData.readLine();
				
					}
			 }
		}
		catch ( ArgsExcessoException e )
		{
			System.out.println(e);
		}
		catch ( NumberFormatException e)
		{
			System.out.println( "argumento nao eh valido.");
		}
	}
}