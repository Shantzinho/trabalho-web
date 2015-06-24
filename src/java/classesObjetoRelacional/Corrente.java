package classesObjetoRelacional;

public class Corrente {
    private String conta;
    private Saldo saldo;
    
    public Corrente(String conta, Saldo saldo){
        this.conta = conta;
        this.saldo = saldo;
    }
    
    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public Saldo getSaldo() {
        return saldo;
    }

    public void setSaldo(Saldo saldo) {
        this.saldo = saldo;
    }
    
    
}
