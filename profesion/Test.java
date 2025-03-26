package profesion;

public class Test {
		    public static void main(String[] args) {

		    	Doctor d1 = new Doctor("Fernando", (short)1980, "Medicina General");
		        Doctor d2 = new Doctor("Lola", (short)1975, "Pediatría");
		        Doctor d3 = new Doctor("Edu", (short)1990, "Cardiología");

		        Ingeniero i1 = new Ingeniero("Manuel", (short)1985, "Ingeniería Civil");
		        Ingeniero i2 = new Ingeniero("Alejandro", (short)1992, "Ingeniería de Software");
		        Ingeniero i3 = new Ingeniero("Pablo", (short)1988, "Ingeniería Industrial");

		        Profesor p1 = new Profesor("Javier", (short)1980, "Programación");
		        Profesor p2 = new Profesor("Carolina", (short)1978, "Historia");
		        Profesor p3 = new Profesor("Laura", (short)1985, "Física");

		        Profesion[] profesiones = {d1, d2, d3, i1, i2, i3, p1, p2, p3};

		        for (Profesion profesion : profesiones) {
		            System.out.println(profesion);
		            profesion.trabajar();

		            if (profesion instanceof Doctor) {
		                Doctor d = (Doctor) profesion;
		                d.recetarMedicamento("Paracetamol");
		            } else if (profesion instanceof Ingeniero) {
		                Ingeniero i = (Ingeniero) profesion;
		                i.calcularCostoProyecto(60, 80);
		            } else if (profesion instanceof Profesor) {
		                Profesor p = (Profesor) profesion;
		                p.calificarExamenes(50);
		            }

		            System.out.println();
		        }
		    }
}
		   