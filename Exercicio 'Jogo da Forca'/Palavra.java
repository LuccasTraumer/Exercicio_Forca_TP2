class Palavra implements Comparable<Palavra>
{
    private String texto;

    public Palavra (String txt) throws Exception
    {
        if (txt == null || txt.equals(""))
            throw new Exception ("Tentativa de criar palavra a partir do nada");

        this.texto = txt;
    }

    public int getQuantidadeDaLetra (char ltr)
    {
		int contador = 0;
		for(int i = 0; i < this.texto.length();i++)
		{
			if(texto.charAt(i)== (ltr))
				contador++;
		}
		return contador;
        // percorre o String this.texto, conta e retorna
        // quantas letras iguais a ltr existem nele
    }

    public int getPosicaoDeOcorrenciaDaLetra (int ord, char ltr) throws Exception
    {
        // se ord==0, retorna a posicao em que ocorre
        // a primeira aparicao de ltr em this.texto;
        // se ord==1, retorna a posicao em que ocorre
        // a segunda aparicao de ltr em this.texto.
        // se ord==2, retorna a posicao em que ocorre
        // a terceira aparicao de ltr em this.texto;
        // e assim por diante.
        // lançar excecao caso nao encontre
        // a ltr procurada ou caso ord seja negativo.
		int posicao[];
		int contadorPosi = 0;
		int tama = this.texto.length();
		posicao = new int[tama];
        for(int i=0; i < tama ;i++)
        {
			if(texto.charAt(i) == ltr)
			{
				posicao[contadorPosi] = i;
				contadorPosi++;
			}
			if(contadorPosi < 0 )
				throw new Exception("Letra não contida na Palavra!");
		}
		return posicao[ord];
    }

    public int getTamanho ()
    {
        return this.texto.length();
    }

    public String toString ()
    {
        return this.texto;
    }

    public boolean equals (Object obj)
    {
		if(this == obj)
			return true;

		if(obj == null)
			return false;

		if(this.getClass() != obj.getClass())
			return false;

		Palavra aux = (Palavra)obj;
		if(this.texto != aux.texto)
			return false;

		return true;
        // verificar se this e obj possuem o mesmo conteúdo, retornando
        // true no caso afirmativo ou false no caso negativo
    }

    public int hashCode ()
    {
		int ret = 666;
		if(this.texto != null)
			ret = ret*7 + this.texto.hashCode();

		if(ret < 0)
			ret =- ret;

		return ret;
        // calcular e retornar o hashcode de this
    }

    public int compareTo (Palavra p)
    {
        return this.texto.compareTo (p.texto);
    }
}