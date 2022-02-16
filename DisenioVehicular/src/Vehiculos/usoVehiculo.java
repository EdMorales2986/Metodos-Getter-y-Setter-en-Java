package Vehiculos;

import javax.swing.JOptionPane;

public class usoVehiculo 
{
	public static void main (String [] args) 
	{

		Coche Mitsubishi = new Coche();
		Moto Yamaha = new Moto();
		Camioneta Ford = new Camioneta();
		
		Mitsubishi.estableceColor(JOptionPane.showInputDialog("Introduzca el color del coche"));
		Mitsubishi.estableceAsiento(false);
		Mitsubishi.estableceClimatizador(true);
		
		System.out.println(Mitsubishi.dimeDatosGenerales());
		System.out.println(Mitsubishi.dimeAsiento());
		System.out.println(Mitsubishi.dimeClimatizador());

		Yamaha.estableceColor(JOptionPane.showInputDialog("Introduzca el color de la moto"));
		Yamaha.estableceRetrovisores(true);
		Yamaha.estableceEscapeSilencioso(false);
		
		System.out.println("\n"+Yamaha.dimeDatosGenerales());
		System.out.println(Yamaha.dimeRetrovisores());
		System.out.println(Yamaha.dimeEscape());
		Ford.estableceColor(JOptionPane.showInputDialog("Introduzca el color de la camioneta"));
		Ford.estableceTipoRuedas(true);
		Ford.estableceClimatizador(false);
		
		System.out.println("\n"+Ford.dimeDatosGenerales());

		System.out.println(Ford.dimeClimatizador());
		System.out.println(Ford.dimeTipoRuedas());
		
	}

}
