package br.univille.estd;

public class BubbleSort<T> {

    private T[] objeto;
    private Comparar<T> comparar;

    public BubbleSort(T[] objeto, Comparar<T> comparar){
        this.objeto = objeto;
        this.comparar = comparar;
    }

    public T[] ordenar(){
        for (int i = this.objeto.length - 1; i >=0; i--){
            for (int j = 0; j < i; j++){
                if (comparar.compareTo(this.objeto[j], this.objeto[j + 1]) > 0){
                    T aux = this.objeto[j];
                    this.objeto[j] = this.objeto[j + 1];
                    this.objeto[j + 1] = aux;
                }
            }
        }

        return  this.objeto;

    }



    public void imprimir(boolean exibe){
    	long d1 = System.currentTimeMillis();
    	if(exibe) {
	        for (int i = 0; i < ordenar().length; i++){
	            System.out.print(ordenar()[i]);
	        }
    	} else {
    		ordenar();
    	}
    	System.out.println("Tempo: "+ ((System.currentTimeMillis() - d1)/1000.0000) + " segundos.");
    }

}
