
public class Uso_Camioneta {

public static void main(String[] args) {
		
Camioneta Camioneta1 = new Camioneta();
		
Camioneta1.setColor("Negro");
Camioneta1.ConfAsientos("Si");
Camioneta1.setasC("No");
Camioneta1.setTamaño_caucho("30");
		
System.out.println(Camioneta1.getColor());
System.out.println(Camioneta1.DimeDatosCamioneta());
System.out.println(Camioneta1.getTamaño_caucho());
System.out.println(Camioneta1.getasC());
System.out.println(Camioneta1.dimeAsientos());
System.out.println(Camioneta1.precioCamioneta());		
}
}