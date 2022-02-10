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
	public String dimeLargo()
	{
		return "El largo del coche es de: "+largo+" metros";
	}
	
	public String dimeAncho()
	{
		return "El ancho del coche es de: "+ancho+" metros";
	}
	
	public String dimeRuedas()
	{
		return "El numero de ruedas es: "+ruedas;
	}
	
	public String dimeColor()
	{
		return "El color del coche es: "+color;
	}
	
	public String dimeAsiento()
	{
		return "El coche cuenta con asientos de cuero: "+asientoCuero;
	}
	
	public String dimeClimatizador()
	{
		return "El coche cuenta con climatizador: "+climatizador;
	}
	
	public String dimePesoTotal()
	{
		return "El peso total del coche es: "+pesoTotal+" kilogramos";
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
