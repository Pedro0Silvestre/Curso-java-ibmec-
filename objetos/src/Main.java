//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            Motor m11 = new Motor(1.1F); //indica q é float
            Motor m12 = new Motor(1.8F);

            Carro carro1 = new Carro("modelo 1",m11);
            Carro carro2 = new Carro("modelo 2",m12);

        System.out.println(carro1.velocidadeMaxima());
        System.out.println(carro2.velocidadeMaxima());
        }
    }
