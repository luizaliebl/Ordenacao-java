package br.univille.estd;

public class CompararStringDesc implements Comparar<String> {

    @Override
    public int compareTo(String string1, String string2) {
        return string2.compareTo(string1);
    }

}
