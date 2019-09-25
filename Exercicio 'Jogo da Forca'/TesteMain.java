public class TesteMain
{
	public static void main(String[] args)
	{

		try{
			BancoDePalavras no = new BancoDePalavras();
			BancoDePalavras va = new BancoDePalavras();
			//va.banco[1] = "lucas";
			System.out.println(no.equals(va));
		}catch(Exception erro){}

	}
}