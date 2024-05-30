package banco;

public class CuentaBancaria {
    private int cedula;
    private String nombre;
    private int monto ;

    public CuentaBancaria(int cedula, String nombre, int monto) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.monto = monto;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public void mostrarCuenta() {
        System.out.println("Cedula: " + cedula + " Nombre: " + nombre + " Monto: " + monto);
    }
}

class Ahorros extends CuentaBancaria {
    int retirar1;
    int depositar1;

    public Ahorros(int cedula, String nombre, int monto, int retirar1,int depositar1) {
        super(cedula, nombre, monto);
        this.retirar1 = retirar1;
        this.depositar1=depositar1;
    }

    public void retiro() {
        int suma = getMonto() - retirar1;
        System.out.println("Cedula: " + getCedula() + " Nombre: " + getNombre() + " Monto anterior: " + getMonto() + " Retiro: " +retirar1+" Saldo de la cuenta: "+suma);
    }
    public void depositar() {
        int suma2 = getMonto() + depositar1;
        System.out.println("Cedula: " + getCedula() + " Nombre: " + getNombre() + " Monto anterior: " + getMonto() + " Deposito: " +depositar1+" Saldo de la cuenta: "+suma2);
    }
}
