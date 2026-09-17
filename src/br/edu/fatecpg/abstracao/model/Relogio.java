package abstracao.model;

import java.time.LocalTime;

public class Relogio {
    public Integer ponteiros;
    public String numeros;

    public Relogio(Integer pont, String num){
        this.ponteiros = pont;
        this.numeros = num;
    }

    public void horas(){
        System.out.println("O relógio mostra que agora são" + LocalTime.now());
    }
}
