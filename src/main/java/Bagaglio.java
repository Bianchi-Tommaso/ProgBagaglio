public class Bagaglio
{
    protected double peso;
    protected String nome;
    
    public Bagaglio()
    {
        peso = 0;
        nome = " ";
    }
    
    public Bagaglio(double peso, String nome)
    {
        this.peso = peso;
        this.nome = nome;
    }

    public double getPeso() 
    {
        return peso;
    }

    public void setPeso(double peso) 
    {
        this.peso = peso;
    }

    public String getNome() 
    {
        return nome;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }
}
