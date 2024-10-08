import java.util.ArrayList;
import java.util.List;

public abstract class ContaBancaria {
    protected String titular;
    protected double saldo;
    protected List<String> extrato;

    public ContaBancaria (String titular) {
        this.titular = titular;
        this.saldo = 0.0;
        this.extrato = new ArrayList<>();
    }

    public abstract void depositar(double valor);
    public abstract void sacar(double valor);

    public void exibirExtrato() {
        System.out.println("Extrato da conta de " + titular);
        for (String transacao : extrato) {
            System.out.println(transacao);
        }
    }
    public abstract void exibirSaldo();
}
