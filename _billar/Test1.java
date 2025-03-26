package _billar;

public class Test1 {
public static void main(String[] args) {
	MesaBillar1 mesa = new MesaBillar1("Mesa de Billar", 10);
    
    Bola1 b1 = new Bola1(ColorBola1.Am, TipoBola1.Li);
    Bola1 b2 = new Bola1(ColorBola1.Az, TipoBola1.Ra);
    Bola1 b3 = new Bola1(ColorBola1.Ne, TipoBola1.Ne);
    
    mesa.colocarBola(b1);
    mesa.colocarBola(b2);
    mesa.colocarBola(b3);
    
    Bola1 b4 = new Bola1(ColorBola1.Am, TipoBola1.Li);
    
    mesa.colocarBola(b4);
    mesa.mostrarInforme();
    
    mesa.sacarBola(b2);
    mesa.mostrarInforme();
    
    Bola1 bolaSacada = mesa.sacarBolaAleatoria();
    System.out.println("Bola sacada aleatoriamente: " + bolaSacada);
    mesa.mostrarInforme();
    
    mesa.vaciarMesa();
    mesa.mostrarInforme();
}
}
