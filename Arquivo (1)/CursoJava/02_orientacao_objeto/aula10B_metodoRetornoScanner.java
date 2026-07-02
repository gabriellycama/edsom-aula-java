

import java.util.Scanner;

public class aula10B_metodoRetornoScanner {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        contaScanner minhaConta = new contaScanner();
        System.out.println("saldo inicial: R$"+ minhaConta.verificarSaldo());

        System.out.println("digite o valor que deseja sacar:R$");
        double valorSaque =  teclado.nextDouble();


        minhaConta.sacar(valorSaque);

        System.out.println("saldo atualizado: R$ "+ minhaConta.verificarSaldo());
    }
}