package classesObjetoRelacional;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Cliente extends Conecta{
    private String nome;
    private String cartao;
    private String cpf;
    private String senha;
    private Corrente corrente;
    private Depositos depositos;
    private Poupanca poupanca;
    private Saques saques;
    private Transferencias transferencias;
    
    public Cliente(String nome, String cpf, String senha, String cartao, Corrente corrente, Depositos depositos, Saques saques, Transferencias transferencias){
        
        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha;
        this.cartao = cartao;
        this.corrente = corrente;
        this.depositos = depositos;
        this.saques = saques;
        this.transferencias = transferencias;
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCartao() {
        return cartao;
    }

    public void setCartao(String cartao) {
        this.cartao = cartao;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Corrente getCorrente() {
        return corrente;
    }

    public void setCorrente(Corrente corrente) {
        this.corrente = corrente;
    }

    public Depositos getDepositos() {
        return depositos;
    }

    public void setDepositos(Depositos depositos) {
        this.depositos = depositos;
    }

    public Poupanca getPoupanca() {
        return poupanca;
    }

    public void setPoupanca(Poupanca poupanca) {
        this.poupanca = poupanca;
    }

    public Saques getSaques() {
        return saques;
    }

    public void setSaques(Saques saques) {
        this.saques = saques;
    }

    public Transferencias getTransferencias() {
        return transferencias;
    }

    public void setTransferencias(Transferencias transferencias) {
        this.transferencias = transferencias;
    }
    
}
