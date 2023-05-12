package veiculos;

public class Moto implements Veiculo{
    
    private String modelo;
    private int ano, cilindradas;
    
    public Moto(String modelo, int ano, int cilindradas) {
        this.modelo = modelo;
        this.ano = ano;
        this.cilindradas = cilindradas;
    }
    
    @Override
    public String acelerar() {
        return "Moto esta acelerando!";
    }

    @Override
    public String desligar() {
        return "Moto esta desligado!";
    }

    @Override
    public String frear() {
        return "Moto esta freando!";
    }

    @Override
    public String ligar() {
        return "Moto esta ligado!";
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

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    @Override
    public String toString() {
        return "Moto [modelo=" + modelo + ", ano=" + ano + ", cilindradas=" + cilindradas + "]";
    }

    

}
