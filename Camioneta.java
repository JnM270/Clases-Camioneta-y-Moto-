
public class Camioneta {
	
private int pesocarroceria = 650;
private float largo;
private int ancho;
private int ruedas;
private int peso_total;
private int preciofinal;
private int peso;
private String color;
private int motor;
private boolean asiento_cuero, asC;
private String Tamaño_caucho;
	
public Camioneta() {

motor=2500;
ruedas=4;
largo=3200;
ancho=2900;
peso=2700;
}
	
public String DimeDatosCamioneta() {
		
return "La Camioneta tiene " +ruedas+" ruedas\n La camioneta mide: "+largo/1000+" metros\n ancho: "
+ancho+"cm"+"\nTiene un motor de: "+motor+"\nTiene un peso de:"+peso +" Kg";
}

public String getColor() {
return "La camioneta es de color: "+color;
}

public void setColor(String color) {
this.color = color;
}
	
public String getTamaño_caucho() {
return "Los cauchos tiene: "+Tamaño_caucho;
}

public void setTamaño_caucho(String Tamaño_caucho) {
this.Tamaño_caucho = Tamaño_caucho;
}
	
public void ConfAsientos(String asiento_cuero) {
		
if(asiento_cuero.equalsIgnoreCase("Si")) {			
this.asiento_cuero=true;
	
}else{
			
this.asiento_cuero = false;
}
}
	
public String dimeAsientos() {
		
if(asiento_cuero==true) {
			
return "La camioneta tiene asientos de cuero";
			
}else {
			
return "La camioneta tiene asientos de serie";
			
}
}

public void setasC(String  asC) {
if(asC.equalsIgnoreCase("Si")) {

this.asC=true;
			
}else
			
this.asC=false;
}

public String getasC() {
if(asC==true) {
			
return "La camioneta tiene aire acondicionado";
			
}else {
			
return "La camioneta tiene climatizador";
}
}
	
public String DimePesoCamioneta() {
		
peso_total= peso + pesocarroceria;
if(asiento_cuero==true) {
			
peso_total+=40;
			
}
if(asC==true) {
			
peso_total+=80;
}
		
return "La camioneta tiene un peso total de: "+peso_total;
}
	
public String precioCamioneta() {
		
preciofinal=12500;
if(asiento_cuero) {
			
preciofinal+=400;	
}
if(asC) {
			
preciofinal+=100;
}
		
return "El Precio Final es: "+preciofinal;

}
}