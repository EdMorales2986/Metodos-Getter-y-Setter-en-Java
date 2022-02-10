package Vehiculos;

public class usoVehiculo 
{
	public static void main (String [] args) 
	{

		Coche Mitsubishi = new Coche();
		Moto Yamaha = new Moto();
		Camioneta Ford = new Camioneta();
		
		Mitsubishi.estableceColor("Gris");
		Mitsubishi.estableceAsiento(false);
		Mitsubishi.estableceClimatizador(true);
		
		System.out.println(Mitsubishi.dimeLargo());
		System.out.println(Mitsubishi.dimeAncho());
		System.out.println(Mitsubishi.dimeRuedas());
		System.out.println(Mitsubishi.dimeColor());
		System.out.println(Mitsubishi.dimeAsiento());
		System.out.println(Mitsubishi.dimeClimatizador());
		System.out.println(Mitsubishi.dimePesoTotal());

		Yamaha.estableceColor("Rojo");
		Yamaha.estableceRetrovisores(false);
		Yamaha.estableceEscapeSilencioso(false);
		
		System.out.println("\n"+Yamaha.dimeLargo());
		System.out.println(Yamaha.dimeAncho());
		System.out.println(Yamaha.dimeRuedas());
		System.out.println(Yamaha.dimeColor());
		System.out.println(Yamaha.dimeAsiento());
		System.out.println(Yamaha.dimeClimatizador());
		System.out.println(Yamaha.dimePesoTotal());
		Ford.estableceColor("Amarillo");
		Ford.estableceTipoRuedas(true);
		Ford.estableceClimatizador(true);
		
		System.out.println("\n"+Ford.dimeLargo());
		System.out.println(Ford.dimeAncho());
		System.out.println(Ford.dimeRuedas());
		System.out.println(Ford.dimeColor());
		System.out.println(Ford.dimeClimatizador());
		System.out.println(Ford.dimeTipoRuedas());
		System.out.println(Ford.dimePesoTotal());
		
	}

}
