import java.util.Scanner;

public class aula11b_metodoParametroScanner {
     
    public static void main(String[] args) {
        Scanner teclado =  new Scanner(System.in);
        calculadoSimples cal = new  calculadoSimples();


        System.out.println("===== sistema  de soma ======");

        System.out.println("digite o primeiro numero inteiro:" );

        int n1 =teclado.nextInt();



        System.out.println("===== sistema  de soma ======");

        System.out.println("digite o primeiro numero inteiro:" );

        int n2 =teclado.nextInt();

        cal.somarDoisNumeros(n1, n2);
        teclado.close();

    }
}
