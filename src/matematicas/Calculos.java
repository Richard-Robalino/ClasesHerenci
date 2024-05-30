package matematicas;

public class Calculos {
    private int valor1;
    private int valor2;
    private int valor3 ;

    public Calculos(int valor1, int valor2, int valor3) {
        this.valor1=valor1;
        this.valor2=valor2;
        this.valor3=valor3;
    }

    public int getValor2() {
        return valor2;
    }

    public int getValor3() {
        return valor3;
    }

    public int getValor1() {
        return valor1;
    }

    public void setValor1(int valor1) {
        this.valor1 = valor1;
    }

    public void setValor2(int valor2) {
        this.valor2 = valor2;
    }

    public void setValor3(int valor3) {
        this.valor3 = valor3;
    }
    private void mostrar1(){
        System.out.println("Los valores son :"+getValor1()+getValor2()+getValor3());
    }
    public void mostrar2(){
        mostrar1();
    }



}
class hija extends Calculos {

    public hija(int valor1, int valor2, int valor3) {
        super(valor1, valor2, valor3);
    }
    public void mostra(){
        int suma =getValor1()+getValor2()+getValor3();
        System.out.println("La suma es:"+suma);
    }

}

