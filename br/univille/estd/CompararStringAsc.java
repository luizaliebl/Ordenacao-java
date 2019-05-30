package br.univille.estd;

public class CompararStringAsc implements Comparar<String> {

    @Override
    public int compareTo(String string1, String string2) {
        return string1.compareTo(string2);
    }

}
