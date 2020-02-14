package model;

public class FToCConverter {
	private int fahrenheit;
	private int convertedCelsius;
	
	public FToCConverter() {
		super();
	}
	
	public FToCConverter(int fahrenheit) {
		super();
		this.fahrenheit = fahrenheit;
		setCelsius(fahrenheit);
	}

	public int getFahrenheit() {
		return fahrenheit;
	}

	public void setFahrenheit(int fahrenheit) {
		this.fahrenheit = fahrenheit;
	}

	public int getConvertedCelsius() {
		return convertedCelsius;
	}

	public void setConvertedCelsius(int convertedCelsius) {
		this.convertedCelsius = convertedCelsius;
	}
	
	public void setCelsius(int f) {
		setConvertedCelsius((f - 32) * 5/9);
	}

	@Override
	public String toString() {
		return "FToCConverter [fahrenheit=" + fahrenheit + ", convertedCelsius=" + convertedCelsius + "]";
	}
	
}
