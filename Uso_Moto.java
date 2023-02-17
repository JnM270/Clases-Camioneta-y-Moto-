
public class Uso_Moto {

public static void main(String[] args) {
			
Moto Yamaha= new Moto();
Moto Suzuki= new Moto();
Moto Yamaha_Touring= new Moto();
			
Yamaha.setColor("Naranja");
Yamaha.ConfOff_road("Si");
				
System.out.println("\t\t Moto Yamaha \n");
System.out.println(Yamaha.DimeDatosMoto());
System.out.println(Yamaha.getColor());
System.out.println(Yamaha.DimeOff_road());
System.out.println("La moto tiene un precio de: "+ Yamaha.precio_moto());
			
Suzuki.setColor("Morado");
Suzuki.ConfSports("No");
			
System.out.println("\n\t\t Moto Suzuki \n");
System.out.println(Suzuki.DimeDatosMoto3());
System.out.println(Suzuki.getColor());
System.out.println(Suzuki.DimeSports());
System.out.println("La moto tiene un precio de: "+ Suzuki.precio_moto());
			
Yamaha_Touring.setColor("Celeste");
Yamaha_Touring.ConfTouring("Si");
			
System.out.println("\n\t\t Moto Touring \n");
System.out.println(Yamaha_Touring.DimeDatosMoto2());
System.out.println(Yamaha_Touring.getColor());
System.out.println(Yamaha_Touring.DimeOff_road());
System.out.println("El precio de la moto es: "+ Yamaha_Touring.precio_moto());
		
}
}