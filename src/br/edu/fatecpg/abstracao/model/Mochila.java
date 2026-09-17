package abstracao.model;

import java.util.ArrayList;
import java.util.Scanner;

public class Mochila {
    public Integer compartimentos;
    public Integer alças;
    public ArrayList<String> armazenamento;

    public Mochila(Integer compart, Integer alc){
        this.compartimentos = compart;
        this.alças = alc;
        this.armazenamento = new ArrayList<>();
    }

    public void armazenar(Scanner batata){
        System.out.println("Escreva um item que você deseja armazenar:");
        String item = batata.next();
        this.armazenamento.add(item);
        System.out.println("Item adicionado!");
    }

    public void remover(Scanner batata){
        System.out.println("Escreva um item que você deseja remover:");
        String item = batata.next();
        if(this.armazenamento.remove(item)){
            System.out.println("Item removido!");
        }
        else{
            System.out.println("Item não existe dentro da mochila.");
        }
        
    }
}
