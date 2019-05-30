package br.univille.estd;

public class CompararNumeroDesc implements Comparar<Double> {

    @Override
    public int compareTo(Double numero1, Double numero2){
        return (int) (numero2 - numero1);
    }
}
