public class Futbol {
    public int cedula;
    public String nombre;
    public int camisa;

    public  Futbol(int cedula,String nombre,int camisa)
    {
        this.cedula=cedula;
        this.nombre=nombre;
        this.camisa=camisa;
    }
    public void mostrarinformacion(){
        System.out.println("Cedula: "+cedula+" Nombre: "+nombre+" Camisa: "+camisa);
    }
}
class Defensa extends Futbol {
    public int posicion;
    public String tarjetas;
    public int goles;
    public int faltas;

    public Defensa(int cedula, String nombre, int camisa,int posicion,String tarjetas,int goles,int faltas) {
        super(cedula, nombre, camisa);
        this.posicion = posicion;
        this.tarjetas=tarjetas;
        this.goles=goles;
        this.faltas=faltas;
    }
    public void mostrainformacion2(){
        System.out.println("Cedula: "+cedula+" Nombre: "+nombre+" Camisa: "+camisa+" Posicion:"+posicion+" Tarjetas: "+tarjetas+" Goles: "+goles+" Faltas: "+faltas);
    }
}
