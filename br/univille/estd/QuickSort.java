package br.univille.estd;

public class QuickSort<T> {

    private  T[] objeto;
    private Comparar<T> comparar;

    public QuickSort(T[] objeto, Comparar<T> comparar){
        this.objeto = objeto;
        this.comparar = comparar;
    }


    public void ordenar(int item1, int item2){
        if(item1 < item2){
            int aux = auxiliar(item1, item2);
            ordenar(item1, aux - 1);;
            ordenar(aux + 1, item2);
        }
    }


    private int auxiliar(int item1, int item2){
        T aux2 = this.objeto[item2];
        int i = item1 - 1;
        for(int j = item1; j <= item2 - 1; j++){
            if(comparar.compareTo(this.objeto[j], aux2) <= 0){
                i = i + 1;
                T aux3 = this.objeto[i];
                this.objeto[i] = this.objeto[j];
                this.objeto[j] = aux3;
            }
        }

        T aux4 = this.objeto[i + 1];
        this.objeto[i + 1] = this.objeto[item2];
        this.objeto[item2] = aux4;
        return i + 1;
    }


    public void imprimir(boolean exibe){   	
    	long d1 = System.currentTimeMillis();
    	System.out.println("Quick Sort:");
        ordenar(0, this.objeto.length - 1);
        if (exibe) {
	        for (int i = 0; i < this.objeto.length; i++){
	            System.out.println(this.objeto[i]);
	        }
        }
        System.out.println("Tempo: "+ ((System.currentTimeMillis() - d1)/1000.0000) + " segundos.");
    }

}
