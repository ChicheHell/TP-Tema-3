public class Main {
    public static void main(String[] args) {
        Coche miCoche = new Coche();
        int resultado = suma(10, 20, 30);
        miCoche.puertaSuma();

        System.out.println(resultado);
        System.out.println(miCoche.puertas);
    }

    public static int suma(int a, int b, int c) {
        return a + b + c;
    }
}

class Coche {
    int puertas = 0;
    public void puertaSuma() {
        this.puertas++;
    }
}