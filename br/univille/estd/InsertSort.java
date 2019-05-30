package br.univille.estd;

public class InsertSort<T> {

    private T[] objeto;
    private Comparar<T> comparar;

    public InsertSort(T[] objeto, Comparar<T> comparar){
        this.objeto = objeto;
        this.comparar = comparar;
    }

    public T[] ordenar(){
        for (int i = 0; i < this.objeto.length; i++){
            T aux = this.objeto[i];
            int j = i - 1;

            while (j >= 0 && comparar.compareTo(aux, this.objeto[j]) < 0){
                this.objeto[j + 1] = this.objeto[j];
                j = j - 1;
            }

            this.objeto[j + 1] = aux;

        }

        return this.objeto;

    }


    public void imprimir(boolean exibe){
    	long d1 = System.currentTimeMillis();
        System.out.println("Insert Sort:");
        if (exibe){
	        for (int i = 0; i < ordenar().length; i++){
	            System.out.println(ordenar()[i]);
	        }
        } else {
        	ordenar();
        }
        System.out.println("Tempo: "+ ((System.currentTimeMillis() - d1)/1000.0000) + " segundos.");
    }

}
