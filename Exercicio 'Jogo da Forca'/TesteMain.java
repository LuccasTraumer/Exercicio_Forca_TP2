public class TesteMain
{
	public static void main(String[] args)
	{

		try{
			BancoDePalavras no = new BancoDePalavras();
			BancoDePalavras va = new BancoDePalavras();
			//va.incluirPalavra("lucas");
			System.out.println("S�o Iguais?: "+ no.equals(va));
		}catch(Exception erro){}

	}
}