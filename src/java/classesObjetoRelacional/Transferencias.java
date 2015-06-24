package classesObjetoRelacional;

public class Transferencias {
    private Cliente favorecido;
    float valor;
    
    public Transferencias(Cliente favorecido,float valor){
        this.valor = valor;
        this.favorecido = favorecido;
    }

    public Cliente getFavorecido() {
        return favorecido;
    }

    public void setFavorecido(Cliente favorecido) {
        this.favorecido = favorecido;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
}
