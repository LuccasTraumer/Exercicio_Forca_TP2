public class TesteMain
{
	public static void main(String[] args)
	{

		try{
			BancoDePalavras no = new BancoDePalavras();
			BancoDePalavras va = new BancoDePalavras();
			//sva.incluirPalavra("lucas");
			System.out.println("Eles s�o iguais?: "+ no.equals(va));
		}catch(Exception erro){}

	}
}