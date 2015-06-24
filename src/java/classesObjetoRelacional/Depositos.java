package classesObjetoRelacional;

public class Depositos {
   private Cliente favorecido;
   private double valor;
   
   public Depositos(Cliente favorecido, double valor){
       this.favorecido = favorecido;
       this.valor      = valor;
   }

    public Cliente getFavorecido() {
        return favorecido;
    }

    public void setFavorecido(Cliente favorecido) {
        this.favorecido = favorecido;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
   
   
}
