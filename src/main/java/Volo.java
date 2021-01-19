import java.util.ArrayList;
import java.util.Collections;

public class Volo 
{
    private int codice_volo;
    private String destinazione;
    private String data;
    private String origine_volo;
    private ArrayList<Bagaglio> bagagli = new ArrayList<Bagaglio>();

    public Volo() 
    {
        codice_volo = 0;
        destinazione = "";
        data = "";
        origine_volo = "";
    }

    public Volo(int codice_volo, String destinazione, String data, String origine_volo) 
    {
        this.codice_volo = codice_volo;
        this.destinazione = destinazione;
        this.data = data;
        this.origine_volo = origine_volo;
    }

    public void AggiungiBagaglio(Bagaglio x) 
    {
        bagagli.add(x);        
    }

    public void RimuoviBagaglio(Bagaglio x) 
    {
        bagagli.remove(x);
    }

    public void ImportoTotaleTariffe() 
    {
        int i = 0;
        double importo = 0;
        BagaglioAMano b = new BagaglioAMano(0, "");
        BagaglioStiva bs = new BagaglioStiva(0, "");

        for (i = 0; i < bagagli.size(); i++) 
        {
            if (bagagli.get(i) instanceof BagaglioAMano) 
            {
                b = (BagaglioAMano) bagagli.get(i);

                if (b.CalcoloTariffa() == true) 
                {
                    importo += b.getPeso() * 8.50;
                }
            }
            else 
            {
                bs = (BagaglioStiva) bagagli.get(i);

                if (bs.CalcoloTariffa() == true)
                {
                    importo += bs.getPeso() * 5;
                }
            }
        }
        System.out.println("L'importo Totale E': " + importo);
    }

    public void ElencoSoloBagagliMano()
    {
       int i = 0;
       int j = 0;
       int controllo = 0;
       BagaglioAMano Elemento = new BagaglioAMano(0, "");
       ArrayList<Bagaglio> bagaglioamano = new ArrayList<Bagaglio>();
       
       bagaglioamano.removeAll(bagaglioamano);
       for(i = 0; i < bagagli.size(); i++)
       {   
           if(bagagli.get(i) instanceof BagaglioAMano)
               bagaglioamano.add(bagagli.get(i));
       }
       
       for(j = 0; j < bagaglioamano.size(); j++)
       {
        for(i = 0; i < bagaglioamano.size() - 1; i++)
        {
            if(bagaglioamano.get(i).getNome().compareTo(bagaglioamano.get(i + 1).getNome()) >= 1)
            {
               Elemento = (BagaglioAMano) bagaglioamano.get(i + 1);
               bagaglioamano.set(i + 1, bagaglioamano.get(i));
               bagaglioamano.set(i, Elemento);
            }
        }
       }
       
       System.out.println("Elenco Nomi Persone Ordinate Alfabeticamente: ");
       
       for(i = 0; i < bagaglioamano.size(); i++)
                System.out.println(bagaglioamano.get(i).getNome());
    }
    
    public void CalcoloTotalePesoEccedente()
    {
        int i = 0; 
        double pesoTotale = 0;
        BagaglioAMano bm = new BagaglioAMano(0, "");
        BagaglioStiva bs = new BagaglioStiva(0, "");
        
        for(i = 0; i < bagagli.size(); i++)
        {
            if(bagagli.get(i) instanceof BagaglioAMano)
            {
                bm = (BagaglioAMano) bagagli.get(i);
                
                if(bm.CalcoloTariffa() == true)
                {
                    pesoTotale += bm.getPeso();
                }         
            }
            else
            {
                bs = (BagaglioStiva) bagagli.get(i);
                
                if(bs.CalcoloTariffa() == true)
                {
                    pesoTotale += bs.getPeso();
                }      
            }
        }
        
        System.out.println("Il Peso Totale Eccedente E' :" + pesoTotale);
    }
    
    public void ElencoSoloBagagliStiva()
    {
       int i = 0;
       int j = 0;
       
       BagaglioStiva Elemento = new BagaglioStiva(0, "");
       ArrayList<Bagaglio> bagagliostiva = new ArrayList<Bagaglio>();
       
       bagagliostiva.removeAll(bagagliostiva);
       for(i = 0; i < bagagli.size(); i++)
       {
           if(bagagli.get(i) instanceof BagaglioStiva)
               bagagliostiva.add(bagagli.get(i));
       }
       
       for(j = 0; j < bagagliostiva.size(); j++)
       {
        for(i = 0; i < bagagliostiva.size() - 1; i++)
        {
            if(bagagliostiva.get(i).getPeso() > bagagliostiva.get(i + 1).getPeso())
            {
               Elemento = (BagaglioStiva) bagagliostiva.get(i + 1);
               bagagliostiva.set(i + 1, bagagliostiva.get(i));
               bagagliostiva.set(i, Elemento);
            }
        }
       }
       
       System.out.println("L'ordine dei Bagagli E' Il Seguente Ordinato Per Peso: ");
       
       for(i = 0; i < bagagliostiva.size(); i++)
                System.out.print("|" + bagagliostiva.get(i).getPeso());
       System.out.println("|");
    }

}
