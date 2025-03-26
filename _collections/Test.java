package _collections;


public class Test {
    public static void main(String[] args) {
        
        
        Parking p1 = new Parking("Mi primer Parking", 10);
        
        
        Coche c1 = new Coche(Color.RO, Marca.SE);
        Coche c2 = new Coche(Color.RO, Marca.SE);
        Coche c3 = new Coche(Color.RO, Marca.SE);

        
        p1.entraCoche(c1);
        p1.entraCoche(c2);
        p1.entraCoche(c3);
               
        p1.reportCompleto();
        
        System.out.printf("%nSale coche: %s%n", p1.saleCoche(c2));
        
        p1.reportCompleto();
        
        p1.saleCoche(c2);
        
        p1.reportCompleto();
        
        p1.vaciaParking();
        
        p1.reportCompleto();
        
     Parking p2 = new Parking("Mi segundo parking", 10);
        
        Coche c4 = new Coche(Color.AZ, Marca.BM);
        Coche c5 = new Coche(Color.AZ, Marca.BM);
        Coche c6 = new Coche(Color.AZ, Marca.BM);
        
        p2.entraCoche(c4);
        p2.entraCoche(c5);
        p2.entraCoche(c6);
        
        p2.reportCompleto();
       
        p2.saleCoche(c4);
        p2.saleCoche(c5);
        p2.saleCoche(c6);
        
        p2.reportCompleto();
        
        Parking p3 = new Parking("Mi TERCER parking", 10);
        
        Coche c7 = new Coche(Color.VI, Marca.ME);
        Coche c8 = new Coche(Color.VI, Marca.ME);
        Coche c9 = new Coche(Color.VI, Marca.ME);
        
        p3.entraCoche(c7);
        p3.entraCoche(c8);
        p3.entraCoche(c9);
        
        p3.reportCompleto();
        
        Coche c0 = p3.saleCocheAleatorio();
        
        p3.saleCocheAleatorio();
        
        p3.reportCompleto();
        
       System.out.printf("%n entra coche aleatorio: %s%n", p3.entraCoche(c0)); 
       
       	Parking p4 = new Parking("Mi cuarto parking", 10);
       	
       	p4.vaciaParking();
       	p4.saleCocheAleatorio();
       	p4.saleCoche(c1);
       	
       	p4.reportCompleto();
       	
        Parking p5 = new Parking("Mi quinto parking", 10);
        
        for (int i = 0; i < 10; i++) {
			Coche c10 = new Coche(Color.NA, Marca.WV);
			p5.entraCoche(c10);
		}
        
        p5.reportCompleto();
        

        for (int i = 0; i < 20; i++) {
			Coche c10 = new Coche(Color.NA, Marca.WV);
			p5.entraCoche(c10);
		}
        
        p5.reportCompleto();
        
        
    }
}
