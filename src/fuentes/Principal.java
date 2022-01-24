package fuentes;

public class Principal {
	public static void main(String[] args) {
		Vehiculo autoelectrico = new AutoElectrico();
		Vehiculo autodiesel = new AutoDiesel();
		
		autoelectrico.setRendimiento(32);
		autodiesel.setRendimiento(20);
		
		System.out.println("El rendimiento del auto electrico es: " + autoelectrico.getRendimiento());
		System.out.println("El rendimiento del auto diesel es: " + autodiesel.getRendimiento());
		
	}
}
