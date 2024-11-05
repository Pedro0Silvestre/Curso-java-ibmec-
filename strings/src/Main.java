//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String str1 = teclado.nextLine();
        String str2 = teclado.nextLine();
        String strSemVogal ="";
        String strSemRepeticao = "";
        int numVogais = 0;

        //identificar quantas vogais


        for (int i = 0; i < str1.length();i++){
            if (str1.indexOf(str1.charAt(i)) == str1.lastIndexOf(str1.charAt(i))) {
                strSemRepeticao = strSemRepeticao + str1.charAt(i);
            }


            if (str1.charAt(i) == 'a' || str1.charAt(i) == 'e' || str1.charAt(i) =='i' || str1.charAt(i) == 'o' || str1.charAt(i) == 'u') {
                numVogais++;
            }
            else {
                strSemVogal = strSemVogal + str1.charAt(i);
            }

        }
        System.out.printf("Número de vogais %d \n",numVogais);
        System.out.println("Palavra sem vogal = " + strSemVogal);
        System.out.println("\nPalavra sem repetições = " + strSemRepeticao);


    }
}