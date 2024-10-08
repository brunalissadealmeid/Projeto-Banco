public class ContaCorrente extends ContaBancaria {
    public ContaCorrente(String titular) {
        super(titular);
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Deposit: R$" + valor);
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Sacado: R$" + valor);
        } else {
            System.out.println("Saldo insuficiente ou valor inválido!");
        }
    }

    @Override
    public void exibirSaldo() {
        System.out.println("Saldo atual: R$" + saldo);
    }

    public void transferir(ContaBancaria contaDestino, double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            contaDestino.saldo += valor;
            extrato.add("Transferência para " + contaDestino.titular + ": R$" + valor);
            contaDestino.extrato.add("Transferência recebida de " + this.titular + ": R$" + valor);
            System.out.println("Transferência de R$" + valor + " para " + contaDestino.titular + " realizada com sucesso!");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido para transferência.");
        }
    }
}
