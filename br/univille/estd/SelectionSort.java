package br.univille.estd;

public class SelectionSort<T> {

    private T[] objeto;
    private  Comparar<T> comparar;

    public SelectionSort(T[] objeto, Comparar<T> comparar){
        this.objeto = objeto;
        this.comparar = comparar;
    }


    public T[] ordenar(){
        for(int i = 0; i < this.objeto.length; i++){
            int menor = i;

            for(int j = i + 1; j < this.objeto.length; j++){
                if(comparar.compareTo(this.objeto[j], this.objeto[menor]) < 0){
                    menor = j;
                }
            }

            T aux = this.objeto[i];
            this.objeto[i] = this.objeto[menor];
            this.objeto[menor] = aux;

        }

        return this.objeto;

    }


    public void imprimir(boolean existe){
    	long d1 = System.currentTimeMillis();
        System.out.println("Selection Sort:");
        if (existe) {
        	for (int i = 0; i < ordenar().length; i++){
                System.out.print(i > 0 ? ", ": "");
                System.out.print(ordenar()[i]);
            }
        } else {
        	ordenar();
        }
        System.out.println("Tempo: "+ ((System.currentTimeMillis() - d1)/1000.0000) + " segundos.");
    }

}
