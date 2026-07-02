public class contaScanner {
    double saldo = 500.0;
    double verificarSaldo(){
        return saldo;
    }

    void sacar(double valor){
        if(valor <= saldo){
            saldo -=valor;
            System.out.println("saque de r "+ valor + "realizado");
        }else{ System.out.println("saldo insuficiente  para o saque de r "+valor);}
    }
}
