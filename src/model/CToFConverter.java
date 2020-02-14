package model;

public class CToFConverter {
	private int celsius;
	private int convertedFahrenheit;
	
	public CToFConverter() {
		super();
	}
	
	public CToFConverter(int celsius) {
		super();
		this.celsius = celsius;
		setFahrenheit(celsius);
	}

	public int getCelsius() {
		return celsius;
	}

	public void setCelsius(int celsius) {
		this.celsius = celsius;
	}

	public int getConvertedFahrenheit() {
		return convertedFahrenheit;
	}

	public void setConvertedFahrenheit(int convertedFahrenheit) {
		this.convertedFahrenheit = convertedFahrenheit;
	}
	
	public void setFahrenheit(int c) {
		setConvertedFahrenheit((c * 9/5) + 32);
	}

	@Override
	public String toString() {
		return "FToCConverter [celsius=" + celsius + ", convertedFahrenheit=" + convertedFahrenheit + "]";
	}
	
}