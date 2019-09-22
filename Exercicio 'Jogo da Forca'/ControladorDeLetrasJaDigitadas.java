class ControladorDeLetrasJaDigitadas implements Cloneable
{
    private String jaForam;

    public ControladorDeLetrasJaDigitadas ()
    {
        this.jaForam="";
    }

    public boolean isJaDigitada (char ltr)
    {
        // percorrer o String jaForam e verificar se o mesmo
        // possui a letra ltr, retornando true em caso afirmativo
        // ou false em caso negativo
		int taman = jaForam.length();
		boolean ret = false;
		for(int i = 0; i < taman;i++)
		{
			if(jaForam.charAt(i) == ltr)
				ret = true;
		}
		return ret;
    }

    public void registreUmaLetra (char ltr) throws Exception
    {
        if (this.isJaDigitada (ltr))
            throw new Exception ("Tentativa de registra letra ja registrada!");

        this.jaForam = this.jaForam+ltr;
    }

    public String toString ()
    {
        if (this.jaForam.compareTo ("") == 0)
            return "";

        String saida = "";
        int i;

        for (i=0; i<this.jaForam.length()-1; i++)
            saida = saida + this.jaForam.charAt (i) + ", ";

        saida = saida + this.jaForam.charAt (i);

        return saida;
    }

    public boolean equals (Object obj)
    {
        // verificar se this e obj são iguais
        if(this == obj)
        	return true;

        if(obj == null)
        	return false;

        if(this.getClass() != obj.getClass())
        	return false;

        ControladorDeLetrasJaDigitadas aux = (ControladorDeLetrasJaDigitadas)obj;
        if(this.jaForam != aux.jaForam)
        	return false;

        return true;
    }

    public int hashCode ()
    {
        // calcular e retornar o hashcode de this
        int ret = 666;
        ret = ret*7+ jaForam.hashCode();

		if(ret < 0)
			ret =-ret;


       	return ret;
    }

    public ControladorDeLetrasJaDigitadas (ControladorDeLetrasJaDigitadas c) throws Exception // construtor de cópia
    {
        // copiar c.jaForam em this.jaForam
        if(c == null)
        	throw new Exception("Objeto Invalido!");

        this.jaForam = c.jaForam;

    }

    public Object clone ()
    {
        // retornar uma copia de this
        ControladorDeLetrasJaDigitadas ret = null;
        try{
			ret = new ControladorDeLetrasJaDigitadas(this);
			}catch(Exception erro){}

		return ret;
    }
}