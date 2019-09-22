public class BancoDePalavras
{
    private String[] banco  = {"JAVA",
                               "CLASSE",
                               "OBJETO",
                               "INSTANCIA",
                               "PUBLICO",
                               "PRIVATIVO",
                               "METODO",
                               "CONSTRUTOR",
                               "SETTER",
                               "GETTER",
                               "LUZ",
                               "PRAZER"};

    public Palavra getPalavraSorteada ()
    {
        Palavra palavra = null;

        try
        {
            palavra = new Palavra (this.banco [(int)(Math.random() * this.banco.length)]);
        }
        catch (Exception e)
        {}

        return palavra;
    }

    public String toString ()
    {
		// resultar um String contendo as palavras do banco
		String ret = banco[0];
		for(int i=1; i < banco.length;i++)
		{
			ret = ret + ", "+ banco[i];
		}
		return ret;

    }

    public boolean equals (Object obj)
    {
        // verificar se this e obj possuem o mesmo conteúdo, retornando
        // true no caso afirmativo ou false no caso negativo
        if(this == obj)
        	return true;
        if(obj == null)
        	return false;
        if(this.getClass() != obj.getClass())
        	return false;
        BancoDePalavras aux = (BancoDePalavras)obj;
        if(this.banco != aux.banco)
        	return false;

        return true;
    }

    public int hashCode ()
    {
		// calcular e retornar o hashcode de this
		int ret = 666;
		ret = ret*7 + banco.hashCode();

        return ret;

    }
}