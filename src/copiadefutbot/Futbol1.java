package copiadefutbot;

public class Futbol1 {
    private int cedula;
    private String nombre;
    private int camisa;

    public Futbol1(int cedula,String nombre,int camisa)
    {
        this.cedula=cedula;
        this.nombre=nombre;
        this.camisa=camisa;
    }
    private void mostrarinformacion(){
        System.out.println("Cedula: "+cedula+" Nombre: "+nombre+" Camisa: "+camisa);
    }
    public  void ayuda(){
        mostrarinformacion();
    }
}

