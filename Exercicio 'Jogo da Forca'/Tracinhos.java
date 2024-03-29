class Tracinhos implements Cloneable
{
    private char texto [];

    public Tracinhos (int qtd) throws Exception
    {
        if (qtd<=0)
            throw new Exception ("Tentativa de criar palavra com quantidade de letras invalida!");

        this.texto = new char [qtd];

        for (int i=0; i<qtd; i++)
            this.texto[i] = '_';
    }

    public void desvele (int pos, char ltr) throws Exception
    {
        if (pos<0 || pos>=texto.length)
            throw new Exception ("Tentativa de substituir letra em posicao inexistente!");

        this.texto[pos] = ltr;
    }

    public boolean isComTracinhosAinda ()
    {
        // percorrer o vetor de char this.texto e verificar
        // se o mesmo ainda contem algum underline ou se ja
        // foram todos substituidos por letras; retornar true
        // caso ainda reste algum underline, ou false caso
        // contrario
		int tama = this.texto.length;

		for(int i = 0; i < tama ;i++)
		{
			if(texto[i] == '_')
				return true;
		}

		return false;
    }

    public String toString ()
    {
        String saida = "";
        int i;

        for (i=0; i<this.texto.length-1; i++)
            saida = saida + this.texto[i] + ' ';

        saida = saida + this.texto[i];

        return saida;
    }

    public boolean equals (Object obj)
    {
        // verificar se this e obj possuem o mesmo conte�do, retornando
        // true no caso afirmativo ou false no caso negativo
        if(this == obj)
        	return true;
        if(obj == null)
        	return false;

        if(this.getClass() != obj.getClass())
        	return false;
        Tracinhos aux = (Tracinhos)obj;
        if(this.texto.length != aux.texto.length)
        	return false;

        else{
			for(int i=0; i < this.texto.length; i++)
				if(this.texto[i] != aux.texto[i])
					return false;
			}


        return true;
    }

    public int hashCode ()
    {
		// calcular e retornar o hashcode de this
		int ret = 666;
		for(int i=0; i < this.texto.length; i++)
			ret = ret*7 + this.texto[i].hashCode();

		if(ret < 0)
			ret =- ret;


		return ret;

    }

    public Tracinhos (Tracinhos t) throws Exception // construtor de c�pia
    {
        // intanciar this.texto um vetor com o mesmo tamanho de t.texto
        // e copilar o conte�do de t.texto para this.texto
		if(t == null)
			throw new Exception("Objeto Invalido!");

		this.texto = t.texto;
    }

    public Object clone ()
    {
        // retornar uma copia de this
        Tracinhos ret = null;
        try{
			ret = new Tracinhos(this);
		}
		catch(Exception erro){}

		return ret;
    }
}