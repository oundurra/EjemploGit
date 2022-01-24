package fuentes;

public class AutoDiesel implements Vehiculo {
	private int rendimiento;
	private String tipocombustible = "Diesel";
	private final String unidadrendimiento = "Km/L";
	
	@Override
	public String getRendimiento() {
		return Integer.toString(this.rendimiento) + ' ' + unidadrendimiento;
	}

	@Override
	public void setRendimiento(int rendimiento) {
		this.rendimiento = rendimiento;
	}

	@Override
	public String getCombustible() {
		return tipocombustible;
	}

	@Override
	public void setCombustible(String tipocombustible) {
		this.tipocombustible =	tipocombustible;	

	}

}
