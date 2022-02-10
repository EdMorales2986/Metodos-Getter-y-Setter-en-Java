package Vehiculos;

public class Moto 
{
	private int ruedas;
	private int largo;
	private int ancho;
	private int pesoPlataforma;
	private int pesoMotor;
	
	private String color;
	private boolean retrovisores, escapeSilencioso;
	private int pesoTotal;
	
	// Metodo Constructor ()
	public Moto()
	{
		ruedas = 2;
		largo = 200;		//Centimetros
		ancho = 75;		//Centimetros
		pesoPlataforma = 70;		//kilogramos
		pesoMotor = 80;		//kilogramos
		pesoTotal = pesoPlataforma + pesoMotor;
	}
	
	// Getters
	public String dimeLargo()
	{
		return "El largo de la moto es de: "+largo+" centimetros";
	}
	
	public String dimeAncho()
	{
		return "El ancho de la moto es de: "+ancho+" centimetros";
	}
	
	public String dimeRuedas()
	{
		return "El numero de ruedas es: "+ruedas;
	}
	
	public String dimeColor()
	{
		return "El color la moto es: "+color;
	}
	
	public String dimeAsiento()
	{
		return "La moto cuenta con retrovisores: "+retrovisores;
	}
	
	public String dimeClimatizador()
	{
		return "La moto cuenta con escape silencioso: "+escapeSilencioso;
	}
	
	public String dimePesoTotal()
	{
		return "El peso total de la moto es: "+pesoTotal+" kilogramos";
	}
	
	// Setters
	public void estableceColor(String colorMoto)
	{
		color = colorMoto;
	}
	
	public void estableceRetrovisores(boolean Retrov)
	{
		retrovisores = Retrov;
		if (retrovisores == true)
		{
			pesoTotal += 3;
		}
	}
	
	public void estableceEscapeSilencioso(boolean EscSil)
	{
		escapeSilencioso = EscSil;
		if (escapeSilencioso == true)
		{
			pesoTotal += 4;
		}
	}
}
