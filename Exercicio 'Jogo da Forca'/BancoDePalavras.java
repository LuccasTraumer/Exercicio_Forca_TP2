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
        boolean igual = true;
        if(this == obj)
        	return igual;
        if(obj == null)
        	igual = false;
        if(this.getClass() != obj.getClass())
        	igual = false;
        BancoDePalavras aux = (BancoDePalavras)obj;
        if(this.banco.length != aux.banco.length)
        	igual = false;
        else
        {
			for(int i =0; i < aux.banco.length; i++)
			{
			if(this.banco[i] != aux.banco[i])
				igual = false;
			}
		}
        return igual;
    }

    public int hashCode ()
    {
		// calcular e retornar o hashcode de this
		int ret = 666;
		ret = ret*7 + banco.hashCode();

        return ret;

    }
}