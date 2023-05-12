package veiculos;

public class Barco implements Veiculo{
    
    private String modelo, cor, tipo;

    public Barco(String modelo, String cor, String tipo) {
        this.modelo = modelo;
        this.cor = cor;
        this.tipo = tipo;
    }

    @Override
    public String acelerar() {
        return "Barco esta acelerando!";
    }

    @Override
    public String desligar() {
        return "Barco esta desligado!";
    }

    @Override
    public String frear() {
        return "Barco esta freando!";
    }

    @Override
    public String ligar() {
        return "Barco esta ligado!";
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Barco [modelo=" + modelo + ", cor=" + cor + ", tipo=" + tipo + "]";
    }

    

}
