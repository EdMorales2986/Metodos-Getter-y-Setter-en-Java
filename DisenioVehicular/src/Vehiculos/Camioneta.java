package Vehiculos;

public class Camioneta 
{
	private int ruedas;
	private int largo;
	private int ancho;
	private int pesoPlataforma;
	private int pesoMotor;
	
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
	}
	
	// Getters
	public String dimeLargo()
	{
		return "El largo de la camioneta es de: "+largo+" metros";
	}
	
	public String dimeAncho()
	{
		return "El ancho de la camioneta es de: "+ancho+" metros";
	}
	
	public String dimeRuedas()
	{
		return "El numero de ruedas es: "+ruedas;
	}
	
	public String dimeColor()
	{
		return "El color de la camioneta es: "+color;
	}
	
	public String dimeClimatizador()
	{
		return "La camioneta cuenta con climatizador: "+climatizador;
	}
	
	public String dimeTipoRuedas()
	{
		return "La camioneta cuenta con ruedas 4x4: "+ruedas4x4;
	}
	
	public String dimePesoTotal()
	{
		return "El peso total de la camioneta es: "+pesoTotal+" kilogramos";
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
