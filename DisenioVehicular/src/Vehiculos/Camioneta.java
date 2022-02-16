package Vehiculos;

public class Camioneta 
{
	private int ruedas;
	private int largo;
	private int ancho;
	private int pesoPlataforma;
	private int pesoMotor;
	private int capaCarga;
	
	private String color;
	private boolean  climatizador, ruedas4x4;
	private int pesoTotal;
	
	// Metodo Constructor ()
	public Camioneta()
	{
		ruedas = 4;
		largo = 4;		//Metros
		ancho = 3;		//Metros
		pesoPlataforma = 825;		//kilogramos
		pesoMotor = 560;		//kilogramos
		pesoTotal = pesoPlataforma + pesoMotor;
		capaCarga = 900;
	}
	
	// Getters
	public String dimeDatosGenerales()
	{
		return "El largo de la camioneta, de color "+color+", es de "+largo+" metros, con un ancho de "+ancho+" metros, cuenta con "+ruedas+" ruedas y pesa un total de "+pesoTotal+" kilogramos y tiene una capacidad de carga de "+capaCarga+" kilogramos";
	}
	
	public String dimeClimatizador()
	{
		if(climatizador==true)
		{
			return "La Camioneta tiene climatizador";
		}else
		{
			return "La Camioneta no tiene climatizador";
		}
	}
	
	public String dimeTipoRuedas()
	{
		if(ruedas4x4==true)
		{
			return "La Camioneta tiene ruedas 4x4";
		}else
		{
			return "La Camioneta no tiene ruedas 4x4";
		}
	}
	
	
	// Setters
	public void estableceColor(String colorCoche)
	{
		color = colorCoche;
	}
	
	public void estableceClimatizador(boolean AC)
	{
		climatizador = AC;
		if (climatizador == true)
		{
			pesoTotal += 8;
		}
	}
	public void estableceTipoRuedas(boolean R4X4)
	{
		ruedas4x4 = R4X4;
		if (ruedas4x4 == true)
		{
			pesoTotal += 16;
		}
	}
}
