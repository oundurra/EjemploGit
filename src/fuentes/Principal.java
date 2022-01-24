package fuentes;

import fuentes.Nissan.Leaf;

public class Principal {
	public static void main(String[] args) {
		Vehiculo autoelectrico = new AutoElectrico();
		Vehiculo autodiesel = new AutoDiesel();
		
		autoelectrico.setRendimiento(32);
		autodiesel.setRendimiento(20);
		
		System.out.println("El rendimiento del auto electrico es: " + autoelectrico.getRendimiento());
		System.out.println("El rendimiento del auto diesel es: " + autodiesel.getRendimiento());
		
		Leaf auto1 = new Leaf();
		auto1.setRendimiento(35);
		auto1.setAnio(2022);
		auto1.setModelo("Leaf 62 kWh e+ Acenta - 5-puertas");
		auto1.setPrecio(28400);
		auto1.setPuertas(5);
		auto1.setPotencia(218);
		
		System.out.println("El " + auto1.getModelo() + " tiene un rendimiento de "+  auto1.getRendimiento());

		
	}
}
