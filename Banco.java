public class Banco {
    public static void main (String[] args){
        ContaBancaria ContaCorrente = new ContaCorrente("Guilherme");
        ContaPoupanca ContaPoupanca = new ContaPoupanca("Sienna", 7.6);

        ContaCorrente.depositar(2900);
        ContaCorrente.sacar(350);
        ContaCorrente.exibirSaldo();

        ContaPoupanca.depositar(7500);
        ContaPoupanca.exibirSaldo();
        ContaPoupanca.aplicarRendimento();
    }
}
