package veiculos;

public class Carro implements Veiculo{
    private String modelo;
    private int ano, numPortas;
    
    public Carro(String modelo, int ano, int numPortas) {
        this.modelo = modelo;
        this.ano = ano;
        this.numPortas = numPortas;
    }

    @Override
    public String acelerar() {
        return "Carro esta acelerando!";
    }

    @Override
    public String desligar() {
        return "Carro esta desligado!";
    }

    @Override
    public String frear() {
        return "Carro esta freando!";
    }

    @Override
    public String ligar() {
        return "Carro esta ligado!";
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }

    @Override
    public String toString() {
        return "Carro [modelo=" + modelo + ", ano=" + ano + ", numPortas=" + numPortas + "]";
    }

    
}
