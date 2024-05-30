package banco;

public class cobros {
    public static void main(String[] args) {
        CuentaBancaria cliente1 = new CuentaBancaria(1878594, "Richard", 200);
        cliente1.mostrarCuenta();
        Ahorros cliente2 =new Ahorros(178959,"Gustavo",200,50,75);
        cliente2.retiro();
        cliente2.depositar();
    }
}
