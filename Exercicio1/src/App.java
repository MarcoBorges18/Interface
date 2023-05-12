import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import veiculos.Barco;
import veiculos.Carro;
import veiculos.Moto;
import veiculos.Veiculo;

public class App {
    public static void main(String[] args) throws Exception {
        
        Barco barco = new Barco("Canoa", "Branca", "Navegante");
        Carro carro = new Carro("Ferrari", 2019, 2);
        Moto moto = new Moto("Kawasaki", 2020, 600);

        List<Veiculo> veiculos = new ArrayList<Veiculo>();

        veiculos.addAll(Arrays.asList(barco, carro, moto));

        for (Veiculo v : veiculos) {
            System.out.println(v.ligar());
            System.out.println(v.acelerar());
            System.out.println(v.frear());
            System.out.println(v.desligar());
            System.out.println("\n---------------------------\n");
        }
        
    }
}
