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
	public String dimeDatosGenerales()
	{
		return "El largo de la moto, de color "+color+", es de "+largo+" centimetros, con un ancho de "+ancho+" centimetros, cuenta con "+ruedas+" ruedas y pesa un total de "+pesoTotal+" kilogramos";
	}
	
	public String dimeRetrovisores()
	{
		if(retrovisores==true)
		{
			return "La moto tiene retrovisores";
		}else
		{
			return "La moto no tiene retrovisores";
		}
	}
	
	public String dimeEscape()
	{
		if(escapeSilencioso==true)
		{
			return "La moto tiene escape silencioso";
		}else
		{
			return "La moto no tiene escape silencioso";
		}
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
