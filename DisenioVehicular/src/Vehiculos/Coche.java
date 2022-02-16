package Vehiculos;

public class Coche 
{
	private int ruedas;
	private int largo;
	private int ancho;
	private int pesoPlataforma;
	private int pesoMotor;
	
	private String color;
	private boolean asientoCuero, climatizador;
	private int pesoTotal;
	
	// Metodo Constructor ()
	public Coche()
	{
		ruedas = 4;
		largo = 4;		//Metros
		ancho = 2;		//Metros
		pesoPlataforma = 630;		//kilogramos
		pesoMotor = 450;		//kilogramos
		pesoTotal = pesoPlataforma + pesoMotor;
	}
	
	// Getters
	public String dimeDatosGenerales()
	{
		return "El largo del coche, de color "+color+", es de "+largo+" metros, con un ancho de "+ancho+" metros, cuenta con "+ruedas+" ruedas y pesa un total de "+pesoTotal+" kilogrmaos";
	}
	
	public String dimeAsiento()
	{
		if(asientoCuero==true)
		{
			return "El coche tiene asientos de cuero";
		}else
		{
			return "El coche no tiene asientos de cuero";
		}
	}
	
	public String dimeClimatizador()
	{
		if(climatizador==true)
		{
			return "El coche tiene climatizador";
		}else
		{
			return "El coche no tiene climatizador";
		}
	}
	
	// Setters
	public void estableceColor(String colorCoche)
	{
		color = colorCoche;
	}
	
	public void estableceAsiento(boolean Cuero)
	{
		asientoCuero = Cuero;
		if (asientoCuero == true)
		{
			pesoTotal += 6;
		}
	}
	
	public void estableceClimatizador(boolean AC)
	{
		climatizador = AC;
		if (climatizador == true)
		{
			pesoTotal += 8;
		}
	}
}
