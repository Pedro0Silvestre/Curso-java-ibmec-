import java.util.Scanner;

// Criando dois potnos pelas coordenadas e após criando um novo ponto

public class Main2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float x1 = teclado.nextFloat();
        float x2 = teclado.nextFloat();
        float y1 = teclado.nextFloat();
        float y2 = teclado.nextFloat();

        Ponto ponto1 = new Ponto(x1,y1);
        Ponto ponto2 = new Ponto(x2,y2);
        SegmentoReta segemento = new SegmentoReta(ponto1,ponto2);

        System.out.println(segemento);

    }

}
