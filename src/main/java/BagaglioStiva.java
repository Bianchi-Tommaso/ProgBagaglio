public class BagaglioStiva extends Bagaglio 
{
    public BagaglioStiva(double peso, String nome)
    {
          super(peso, nome);
    }
    
    public boolean CalcoloTariffa()
    {
        int pesomassimo = 25;
        boolean controllo = false;
                
        if(peso > pesomassimo)
        {
            controllo = true;
        }
        
        return controllo;
    }
}
