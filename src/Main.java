public class Main {
    public static void main(String[] args) {
        int param1 = 4;
        int param2 = 56;
        int param3 = 12;

        var valor = operator(param1, param2, param3);

        Coche miCoche = new Coche();
        miCoche.PonerPuertas();
        miCoche.PonerPuertas();
        miCoche.PonerPuertas();
        System.out.println(valor);
        System.out.println(miCoche.puertas);
        System.out.println(miCoche.Color);
        System.out.println(miCoche.Modelo);
    }
    public static int operator(int a, int b, int c) {
        return a + b + c;
    }
}

class Coche {
    String Color = "Rojo";
    String Modelo = "Ferrari";

    public int puertas = 0;

    public void PonerPuertas() {
        this.puertas++;
    }
}