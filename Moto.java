
public class Moto {

private float largo;
private int ancho;
private int ruedas;
private int peso_moto;
private int Tamaño_caucho;
private int motor;
private float largo2;
private int ancho2;
private int ruedas2;
private int peso_moto2;
private int Tamaño_caucho2;
private int motor2;
private float largo3;
private int ancho3;
private int ruedas3;
private int pesoMoto3;
private int Tamaño_caucho3;
private int motor3;
private String color;
private boolean cauchoSports;
private boolean cauchoTouring;
private boolean caucho_Offroad;
	
public Moto() {

// Moto Yamaha 
		
ruedas = 2;
largo = 1910;
ancho = 800;
Tamaño_caucho = 20;
peso_moto = 485;
motor= 230;
		
// Moto Sports
		
ruedas2 = 2;
largo2 = 2105;
ancho2 = 803;
Tamaño_caucho2 = 20;
peso_moto2 = 530;
motor2= 210;
		
//Moto Off_road
		
ruedas3 = 2;
largo3 = 1925;
ancho3 = 801;
Tamaño_caucho = 20;
pesoMoto3 = 540;
motor3= 250;
}
	
public String DimeDatosMoto() {
return "La moto tiene: " + ruedas +" ruedas\n La moto mide: "+largo/1000+" metros\n ancho: "+ancho+
" cm\n Tamaño de caucho : "+Tamaño_caucho+"\n La moto tiene un motor de: "+ motor + "cc" +"\nTiene un peso de: "+peso_moto+ " Kg";
}
	
public String DimeDatosMoto2() {
return "La moto tiene: " + ruedas2 +" ruedas\n La moto mide: "+largo2/1000+" metros\n ancho: "+ancho2+
" cm\n Tamaño de caucho : "+Tamaño_caucho2+"\n La moto tiene un motor de: "+ motor + "cc" +"\nTiene un peso de: "+peso_moto2+ " Kg";		
}

public String DimeDatosMoto3() {
return "La moto tiene: " + ruedas3 +" ruedas\n La moto mide: "+largo3/1000+" metros\n ancho: "+ancho3+
" cm\n Tamaño de caucho : "+Tamaño_caucho+"\n La moto tiene un motor de: "+ motor + "cc" +"\nTien un peso de: "+peso_moto+ " Kg";
}

public String getColor() {
return "La moto es de color:"+color; 
}

public void setColor(String color) {
this.color = color;
}

public void ConfSports(String cauchoSports) {
		
if(cauchoSports.equalsIgnoreCase("Si")) {
this.cauchoSports = true;
			
}else {
			
this.cauchoSports = false;
}
}

public void ConfTouring(String cauchoTouring) {
		
if(cauchoTouring.equalsIgnoreCase("Si")) {			
this.cauchoTouring = true;
			
}else {
			
this.cauchoTouring = false;
}
}
public void ConfOff_road(String caucho_Offroad) {
	
if(caucho_Offroad.equalsIgnoreCase("Si")) {
this.caucho_Offroad = true;
		
}else {
		
this.caucho_Offroad = false;		
}
}

public String DimeSports() {
if(cauchoSports == true) {
			
return "La moto tiene cauchos Sports";
}else {
return "La moto tiene cauchos de serie";
}
}

public String DimeTouring() {

if(cauchoTouring == true) {
return "La moto tiene cauchos Touring";
			
}else {
return "La moto tiene cauchos de serie";
			
}
}
	
public String DimeOff_road() {
		
if(caucho_Offroad == true) {
			
return "La moto tiene cauchos Off Road";
			
}else {
			
return "La moto tiene cauchos de serie";
			
}		
}
	
public int precio_moto() {
		
int preciofinal=1650;
if(caucho_Offroad) {

preciofinal+=1700;
}
if(cauchoSports) {
			
preciofinal+=4260;
}
if(cauchoTouring) {
			
preciofinal+=2510;
}
return preciofinal;		
}
}