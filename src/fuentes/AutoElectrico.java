package fuentes;

public class AutoElectrico implements Vehiculo {
	private int rendimiento;
	private String tipocombustible = "Electricidad";
	private final String unidadrendimiento = "Km/kWh";

	@Override
	public String getRendimiento() {
		return Integer.toString(this.rendimiento) + ' ' + unidadrendimiento;
	}

	@Override
	public String getCombustible() {
		return tipocombustible;
	}


	@Override
	public void setRendimiento(int rendimiento) {
		this.rendimiento = rendimiento;
	}

	@Override
	public void setCombustible(String tipocombustible) {
		this.tipocombustible =	tipocombustible;	
	}

}
