public class ProgBagaglio 
{ 
    public static void main(String[] args) 
    {
       Volo v1 = new Volo();
       BagaglioAMano bm1 = new BagaglioAMano(6, "Zaira Masi");
       BagaglioAMano bm2 = new BagaglioAMano(12, "Tommaso Bianchi");
       BagaglioAMano bm3 = new BagaglioAMano(23, "Jago Chiarusi");
       BagaglioAMano bm4 = new BagaglioAMano(13, "Xabier Caruso");
       BagaglioAMano bm5 = new BagaglioAMano(26, "Carlo Cracco");
       BagaglioAMano bm6 = new BagaglioAMano(45, "Daniele Bedini");
       BagaglioAMano b1 = new BagaglioAMano(8, "Melissa Bianchi");
       BagaglioAMano b2 = new BagaglioAMano(32, "Edward Snowden");
       BagaglioAMano b3 = new BagaglioAMano(3, "Linus Torvalds");
       BagaglioAMano b4 = new BagaglioAMano(18, "Elisa Bianchi");
       BagaglioAMano b5 = new BagaglioAMano(76, "Ricahrd Stallman");
       BagaglioAMano b6 = new BagaglioAMano(87, "Alan Turing"); 
       BagaglioStiva bs7 = new BagaglioStiva(34, "Olivia Ferrari");
       BagaglioStiva bs8 = new BagaglioStiva(56, "Steve Jobs");
       BagaglioStiva bs9 = new BagaglioStiva(66, "Elon Musk");
       BagaglioStiva bs10 = new BagaglioStiva(44, "Nicola Tesla");
       BagaglioStiva bs11 = new BagaglioStiva(35, "Antonio Meucci");
       BagaglioStiva bs12 = new BagaglioStiva(43, "Helios Pellegrini");
       
       v1.AggiungiBagaglio(bm1);
       v1.AggiungiBagaglio(bm2);
       v1.AggiungiBagaglio(bm3);
       v1.AggiungiBagaglio(bm4);
       v1.AggiungiBagaglio(bm5);
       v1.AggiungiBagaglio(bm6);
       v1.AggiungiBagaglio(b1);
       v1.AggiungiBagaglio(b2);
       v1.AggiungiBagaglio(b3);
       v1.AggiungiBagaglio(b4);
       v1.AggiungiBagaglio(b5);
       v1.AggiungiBagaglio(b6);
       v1.AggiungiBagaglio(bs7);
       v1.AggiungiBagaglio(bs8);
       v1.AggiungiBagaglio(bs9);
       v1.AggiungiBagaglio(bs10);
       v1.AggiungiBagaglio(bs11);
       v1.AggiungiBagaglio(bs12);
       
       v1.ImportoTotaleTariffe();
       v1.ElencoSoloBagagliMano();
       v1.CalcoloTotalePesoEccedente();
       v1.ElencoSoloBagagliStiva();      
    }   
}
