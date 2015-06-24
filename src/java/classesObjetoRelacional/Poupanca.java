package classesObjetoRelacional;

public class Poupanca {
    private float juros;
    private Saldo saldo;
    private String conta;
    
    public Poupanca(float juros, Saldo saldo, String conta){
        this.juros = juros;
        this.saldo = saldo;
        this.conta = conta;
    }

    public float getJuros() {
        return juros;
    }

    public void setJuros(float juros) {
        this.juros = juros;
    }

    public Saldo getSaldo() {
        return saldo;
    }

    public void setSaldo(Saldo saldo) {
        this.saldo = saldo;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }
}

