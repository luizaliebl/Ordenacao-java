package br.univille.estd;

public class CompararNumeroAsc implements Comparar<Double>{

    @Override
    public int compareTo(Double numero1, Double numero2){
        return (int)(numero1 - numero2);
    }

}
