package _collections2;

public class Test {
    public static void main(String[] args) {
        // Crear un parking con 10 plazas
        Parking P1 = new Parking("Mi primer parking", 10);
        
        Coche c1 = new Coche(Marca.SE,Color.RO);
        Coche c2 = new Coche(Marca.SE,Color.RO);
        Coche c3 = new Coche(Marca.SE,Color.RO);
        P1.entraCoche(c1);
        P1.entraCoche(c2);
        P1.entraCoche(c3);
        
        // Mostrar informes
        P1.reportCompleto();
        
        P1.saleCoche(c2);
        
        // Mostrar informes
        P1.reportCompleto();
        
        P1.saleCoche(c2);
        
        // Mostrar informes
        P1.reportCompleto();
        
        P1.vaciaParking();
        
     // Mostrar informes
        P1.reportCompleto();
           
           Parking P2 = new Parking("Mi segundo parking", 10);
           
           Coche c4 = new Coche(Marca.BM, Color.AZ);
           Coche c5 = new Coche(Marca.BM, Color.AZ);
           Coche c6 = new Coche(Marca.BM, Color.AZ);
           P2.entraCoche(c4);
           P2.entraCoche(c5);
           P2.entraCoche(c6);
           
        // Mostrar informes
           P2.reportCompleto();
              
           P2.saleCocheAleatorio();
           P2.saleCocheAleatorio();
           P2.saleCocheAleatorio();
           
           
        // Mostrar informes
           P2.reportCompleto();
           
           
           Parking P3 = new Parking("Mi tercer parking", 10);
           
           Coche c7 = new Coche(Marca.ME, Color.IN);
           Coche c8 = new Coche(Marca.ME, Color.IN);
           Coche c9 = new Coche(Marca.ME, Color.IN);
           P3.entraCoche(c7);
           P3.entraCoche(c8);
           P3.entraCoche(c9);
           
        // Mostrar informes
           P3.reportCompleto();
              
           Coche este = P3.saleCocheAleatorio();
           
           
        // Mostrar informes
           P3.reportCompleto();
           
           P3.entraCoche(este);
           
           
        // Mostrar informes
           P3.reportCompleto();
           
           Parking P4 = new Parking("Mi cuarto parking", 10);
           
           P4.vaciaParking();
           
        // Mostrar informes
           P4.reportCompleto();
                  
           P4.saleCocheAleatorio();
           
        // Mostrar informes
           P4.reportCompleto();
           
           P4.saleCoche(c1);
           
        // Mostrar informes
           P4.reportCompleto();
           
           Parking P5 = new Parking("Mi quinto parking", 10);
           
           for (int i = 0; i < 10; i++) {
               
        	   Coche c10 = new Coche(Marca.WV,Color.AM);
                 
              P5.entraCoche(c10);
              }
        // Mostrar informes
           P5.reportCompleto();
           
           for (int i = 0; i < 11; i++) {
               
        	   Coche c10 = new Coche(Marca.WV,Color.AM);
                 
              P5.entraCoche(c10);
              }
        // Mostrar informes
           P5.reportCompleto();
           
           
    }
    
   
}