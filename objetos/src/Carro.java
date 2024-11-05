import javax.print.DocFlavor;

public class Carro {
    private String modelo; // atributos sempre privados
    private int ano;
    private Motor motor;

    public Carro(String modelo, Motor motor) {
        this.modelo = modelo;
        this.motor = motor;
    }

    public float velocidadeMaxima(){
        if (this.motor.getCilindrada() > 2.0) {
            return 260;
        }

        else if (this.motor.getCilindrada() > 1.6) {
            return 220;
        }

        else if (this.motor.getCilindrada() > 1.0){
            return 180;
        }

        else {
            return 140;
        }
    }

    public String toString() {
        return "Carro" + this.modelo + " com motor " + this.motor.getCilindrada();
    }
}
