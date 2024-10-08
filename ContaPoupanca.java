public class ContaPoupanca extends ContaBancaria {
    private double taxadeJuros;

    public ContaPoupanca (String titular, double taxadeJuros) {
        super(titular);
        this.taxadeJuros =taxadeJuros;
    }
    public void aplicarRendimento() {
        saldo += saldo * taxadeJuros;
        System.out.println("Rendimento aplicado! Novo saldo: R$" + saldo);
    }
    @Override
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depositado: R$" + valor);
    }
    @Override
    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Sacado: R$" + valor);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
    @Override
    public void exibirSaldo() {
        System.out.println("Saldo da poupança: R$" + saldo);
    }
}
