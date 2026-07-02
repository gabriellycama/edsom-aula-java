public class  aula10_metodoRetorno{

    public static void main(String[] args) {
        conta10 minhaConta = new conta10();
        double valorAtual = minhaConta.verificarSaldo();
        System.out.println("--------------------");
        System.out.println("saldo atual"  + valorAtual);
        System.out.println("--------------------");
    }
    
}