package br.univille.estd;

import java.io.FileNotFoundException;

public class Main{

    public static void main(String[] args) throws FileNotFoundException {

    	
    	LerArquivo lerArq = new LerArquivo();
    	Double[] lista1 = lerArq.importaDouble("src\\arquivos\\numeros_100000.txt", 100000);
    	Double[] lista2 = lerArq.importaDouble("src\\arquivos\\numeros_1000000.txt", 1000000);
    	String[] lista3 = lerArq.importaString("src\\arquivos\\palavras_100000.txt", 100000);
    	String[] lista4 = lerArq.importaString("src\\arquivos\\palavras_1000000.txt", 1000000);
    	LatitudeLongitude[] lista5 = lerArq.importaArq("src\\arquivos\\objetos_100000.txt", 100000);
    	LatitudeLongitude[] lista6 = lerArq.importaArq("src\\arquivos\\objetos_1000000.txt", 1000000);
    	
    	
    //##BUBBLE SORT CRESCENTE - LISTA 1##    
        //BubbleSort bubbleSortAsc = new BubbleSort<Double>(lista1, new CompararNumeroAsc());
        //bubbleSortAsc.imprimir(false);

    //##BUBBLE SORT DECRESCENTE - LISTA 1##    
        //BubbleSort bubbleSortDesc = new BubbleSort<Double>(lista1, new CompararNumeroDesc());
        //bubbleSortDesc.imprimir(false);

    //##BUBBLE SORT CRESCENTE - LISTA 2##    
        //BubbleSort bubbleSortAsc = new BubbleSort<Double>(lista2, new CompararNumeroAsc());
        //bubbleSortAsc.imprimir(false);

    //##BUBBLE SORT DECRESCENTE - LISTA 2##    
        //BubbleSort bubbleSortDesc = new BubbleSort<Double>(lista2, new CompararNumeroDesc());
        //bubbleSortDesc.imprimir(false);
    	
    //##BUBBLE SORT CRESCENTE - LISTA 3##    
        //BubbleSort bubbleSortAsc = new BubbleSort<Double>(lista3, new CompararStringAsc());
        //bubbleSortAsc.imprimir(false);

    //##BUBBLE SORT DECRESCENTE - LISTA 3##    
        //BubbleSort bubbleSortDesc = new BubbleSort<Double>(lista3, new CompararStringDesc());
        //bubbleSortDesc.imprimir(false);
    	
    //##BUBBLE SORT CRESCENTE - LISTA 4##    
        //BubbleSort bubbleSortAsc = new BubbleSort<Double>(lista4, new CompararStringAsc());
        //bubbleSortAsc.imprimir(false);

    //##BUBBLE SORT DECRESCENTE - LISTA 4##    
        //BubbleSort bubbleSortDesc = new BubbleSort<Double>(lista4, new CompararStringDesc());
        //bubbleSortDesc.imprimir(false);
    	
    //##BUBBLE SORT CRESCENTE - LISTA 5##    
        //BubbleSort bubbleSortAsc = new BubbleSort<Double>(lista5, new CompararObjetoAsc());
        //bubbleSortAsc.imprimir(false);

    //##BUBBLE SORT DECRESCENTE - LISTA 5##    
        //BubbleSort bubbleSortDesc = new BubbleSort<Double>(lista5, new CompararObjetoDesc());
        //bubbleSortDesc.imprimir(false);
    	
    	//##BUBBLE SORT CRESCENTE - LISTA 6##    
        //BubbleSort bubbleSortAsc = new BubbleSort<Double>(lista6, new CompararObjetoAsc());
        //bubbleSortAsc.imprimir(false);

    //##BUBBLE SORT DECRESCENTE - LISTA 6##    
        //BubbleSort bubbleSortDesc = new BubbleSort<Double>(lista6, new CompararObjetoDesc());
        //bubbleSortDesc.imprimir(false);
    	
    	/*

    //##QUICK SORT CRESCENTE - LISTA 1##   
    	lista1 = lerArq.importaDouble("src\\arquivos\\numeros_100000.txt", 100000);
        QuickSort quickSortAsc = new QuickSort(lista1, new CompararNumeroAsc());
        quickSortAsc.imprimir(false);

    //##QUICK SORT DECRESCENTE - LISTA 1##
        lista1 = lerArq.importaDouble("src\\arquivos\\numeros_100000.txt", 100000);
        QuickSort quickSortDesc = new QuickSort(lista1, new CompararNumeroDesc());
        quickSortDesc.imprimir(false);
               
    //##QUICK SORT CRESCENTE - LISTA 2##  
        lista2 = lerArq.importaDouble("src\\arquivos\\numeros_1000000.txt", 1000000);
        quickSortAsc = new QuickSort(lista2, new CompararNumeroAsc());
        quickSortAsc.imprimir(false);

    //##QUICK SORT DECRESCENTE - LISTA 2##
        lista2 = lerArq.importaDouble("src\\arquivos\\numeros_1000000.txt", 1000000);
        quickSortDesc = new QuickSort(lista2, new CompararNumeroDesc());
        quickSortDesc.imprimir(false);
    	    	
    //##QUICK SORT CRESCENTE - LISTA 3##
       lista3 = lerArq.importaString("src\\arquivos\\palavras_100000.txt", 100000);
       quickSortAsc = new QuickSort(lista3, new CompararStringAsc());
       quickSortAsc.imprimir(false);
    	
    //##QUICK SORT DECRESCENTE - LISTA 3##
    	lista3 = lerArq.importaString("src\\arquivos\\palavras_100000.txt", 100000);
    	quickSortDesc = new QuickSort(lista3, new CompararStringDesc());
    	quickSortDesc.imprimir(false);
    	
    //##QUICK SORT CRESCENTE - LISTA 4##
    	lista4 = lerArq.importaString("src\\arquivos\\palavras_1000000.txt", 1000000);
    	quickSortAsc = new QuickSort(lista4, new CompararStringAsc());
    	quickSortAsc.imprimir(false);
    	
    //##QUICK SORT DECRESCENTE - LISTA 4##
    	lista4 = lerArq.importaString("src\\arquivos\\palavras_1000000.txt", 1000000);
    	quickSortDesc = new QuickSort(lista4, new CompararStringDesc());
    	quickSortDesc.imprimir(false);
    	
    //##QUICK SORT CRESCENTE - LISTA 5##
    	lista5 = lerArq.importaArq("src\\arquivos\\objetos_100000.txt", 100000);
    	quickSortAsc = new QuickSort(lista5, new CompararObjetoAsc());
    	quickSortAsc.imprimir(false);
    	
    //##QUICK SORT DECRESCENTE - LISTA 5##
    	lista5 = lerArq.importaArq("src\\arquivos\\objetos_100000.txt", 100000);
    	quickSortDesc = new QuickSort(lista5, new CompararObjetoDesc());
    	quickSortDesc.imprimir(false);
    	
    //##QUICK SORT CRESCENTE - LISTA 6##
    	lista6 = lerArq.importaArq("src\\arquivos\\objetos_1000000.txt", 1000000);
    	quickSortAsc = new QuickSort(lista6, new CompararObjetoAsc());
    	quickSortAsc.imprimir(false);
    	
    //##QUICK SORT DECRESCENTE - LISTA 6##
    	lista6 = lerArq.importaArq("src\\arquivos\\objetos_1000000.txt", 1000000);
    	quickSortDesc = new QuickSort(lista6, new CompararObjetoDesc());
    	quickSortDesc.imprimir(false);	
    	
    	
    	*/
    	
    	
    	
    	
    	
    	
    	

    	
    //##INSERT SORT CRESCENTE - LISTA 1##
    	//InsertSort insertSortAsc = new InsertSort(lista1, new CompararNumeroAsc());
        //insertSortAsc.imprimir(false);

    //##INSERT SORT DECRESCENTE - LISTA 1##
    	//InsertSort insertSortDesc = new InsertSort(lista1, new CompararNumeroDesc());
        //insertSortDesc.imprimir(false);
    
    //##INSERT SORT CRESCENTE - LISTA 2##
    	//InsertSort insertSortAsc = new InsertSort(lista2, new CompararNumeroAsc());
        //insertSortAsc.imprimir(false);

    //##INSERT SORT DECRESCENTE - LISTA 2##
    	//InsertSort insertSortDesc = new InsertSort(lista2, new CompararNumeroDesc());
        //insertSortDesc.imprimir(false);
    	
    //##INSERT SORT CRESCENTE - LISTA 3##
    	//InsertSort insertSortAsc = new InsertSort(lista3, new CompararStringAsc());
        //insertSortAsc.imprimir(false);

    //##INSERT SORT DECRESCENTE - LISTA 3##
    	//InsertSort insertSortDesc = new InsertSort(lista3, new CompararStringDesc());
        //insertSortDesc.imprimir(false);
    
    //##INSERT SORT CRESCENTE - LISTA 4##
    	//InsertSort insertSortAsc = new InsertSort(lista4, new CompararStringAsc());
        //insertSortAsc.imprimir(false);

    //##INSERT SORT DECRESCENTE - LISTA 4##
    	//InsertSort insertSortDesc = new InsertSort(lista4, new CompararStringDesc());
        //insertSortDesc.imprimir(false);
    	
    //##INSERT SORT CRESCENTE - LISTA 5##
    	//InsertSort insertSortAsc = new InsertSort(lista5, new CompararObjetoAsc());
        //insertSortAsc.imprimir(false);

    //##INSERT SORT DECRESCENTE - LISTA 5##
    	//InsertSort insertSortDesc = new InsertSort(lista5, new CompararObjetoDesc());
        //insertSortDesc.imprimir(false);
    	
    //##INSERT SORT CRESCENTE - LISTA 6##
    	//InsertSort insertSortAsc = new InsertSort(lista6, new CompararObjetoAsc());
        //insertSortAsc.imprimir(false);

    //##INSERT SORT DECRESCENTE - LISTA 6##
    	//InsertSort insertSortDesc = new InsertSort(lista6, new CompararObjetoDesc());
        //insertSortDesc.imprimir(false);
    	
    	
    	
    	
    	
    //##SELECTION SORT CRESCENTE - LISTA 1##
    	lista1 = lerArq.importaDouble("src\\arquivos\\numeros_100000.txt", 100000);
        SelectionSort selectionSortAsc = new SelectionSort(lista1, new CompararNumeroAsc());
        selectionSortAsc.imprimir(false);
        
    //##SELECTION SORT DECRESCENTE - LISTA 1##
        lista1 = lerArq.importaDouble("src\\arquivos\\numeros_100000.txt", 100000);
        SelectionSort selectionSortDesc = new SelectionSort(lista1, new CompararNumeroDesc());
        selectionSortDesc.imprimir(false);
        
    //##SELECTION SORT CRESCENTE - LISTA 2##
        lista2 = lerArq.importaDouble("src\\arquivos\\numeros_1000000.txt", 1000000);
        selectionSortAsc = new SelectionSort(lista2, new CompararNumeroAsc());
        selectionSortAsc.imprimir(false);
        
    //##SELECTION SORT DECRESCENTE - LISTA 2##
        lista2 = lerArq.importaDouble("src\\arquivos\\numeros_1000000.txt", 1000000);
        selectionSortDesc = new SelectionSort(lista2, new CompararNumeroDesc());
        selectionSortDesc.imprimir(false);

    //##SELECTION SORT CRESCENTE - LISTA 3##
        lista3 = lerArq.importaString("src\\arquivos\\palavras_100000.txt", 100000);
        selectionSortAsc = new SelectionSort(lista3, new CompararStringAsc());
        selectionSortAsc.imprimir(false);
        
    //##SELECTION SORT DECRESCENTE - LISTA 3##
        lista3 = lerArq.importaString("src\\arquivos\\palavras_100000.txt", 100000);
        selectionSortDesc = new SelectionSort(lista3, new CompararStringDesc());
        selectionSortDesc.imprimir(false);
    	
    //##SELECTION SORT CRESCENTE - LISTA 4##
        lista4 = lerArq.importaString("src\\arquivos\\palavras_1000000.txt", 1000000);
        selectionSortAsc = new SelectionSort(lista4, new CompararStringAsc());
        selectionSortAsc.imprimir(false);
        
    //##SELECTION SORT DECRESCENTE - LISTA 4##
        lista4 = lerArq.importaString("src\\arquivos\\palavras_1000000.txt", 1000000);
        selectionSortDesc = new SelectionSort(lista4, new CompararStringDesc());
        selectionSortDesc.imprimir(false);
    	
    //##SELECTION SORT CRESCENTE - LISTA 5##
        lista5 = lerArq.importaArq("src\\arquivos\\objetos_100000.txt", 100000);
        selectionSortAsc = new SelectionSort(lista5, new CompararObjetoAsc());
        selectionSortAsc.imprimir(false);
        
    //##SELECTION SORT DECRESCENTE - LISTA 5##
        lista5 = lerArq.importaArq("src\\arquivos\\objetos_100000.txt", 100000);
        selectionSortDesc = new SelectionSort(lista5, new CompararObjetoDesc());
        selectionSortDesc.imprimir(false);

    //##SELECTION SORT CRESCENTE - LISTA 6##
        lista6 = lerArq.importaArq("src\\arquivos\\objetos_1000000.txt", 1000000);
        selectionSortAsc = new SelectionSort(lista6, new CompararObjetoAsc());
        selectionSortAsc.imprimir(false);
        
    //##SELECTION SORT DECRESCENTE - LISTA 6##
        lista6 = lerArq.importaArq("src\\arquivos\\objetos_1000000.txt", 1000000);
        selectionSortDesc = new SelectionSort(lista6, new CompararObjetoDesc());
        selectionSortDesc.imprimir(false);


    	
    	/*
    	

    	
    //##MERGE SORT CRESCENTE - LISTA 1##      
    	lista1 = lerArq.importaDouble("src\\arquivos\\numeros_100000.txt", 100000);
        MergeSort mergeSortAsc = new MergeSort(lista1, new CompararNumeroAsc());
        mergeSortAsc.imprimir(false);

    //##MERGE SORT DECRESCENTE - LISTA 1##
        lista1 = lerArq.importaDouble("src\\arquivos\\numeros_100000.txt", 100000);
        MergeSort mergeSortDesc = new MergeSort(lista1, new CompararNumeroDesc());
        mergeSortDesc.imprimir(false);
               
    //##MERGE SORT CRESCENTE - LISTA 2##   
        lista2 = lerArq.importaDouble("src\\arquivos\\numeros_1000000.txt", 1000000);
         mergeSortAsc = new MergeSort(lista2, new CompararNumeroAsc());
        mergeSortAsc.imprimir(false);

    //##MERGE SORT DECRESCENTE - LISTA 2##
        lista2 = lerArq.importaDouble("src\\arquivos\\numeros_1000000.txt", 1000000);
        mergeSortDesc = new MergeSort(lista2, new CompararNumeroDesc());
        mergeSortDesc.imprimir(false);
    	    	
    //##MERGE SORT CRESCENTE - LISTA 3##
        lista3 = lerArq.importaString("src\\arquivos\\palavras_100000.txt", 100000);
        mergeSortAsc = new MergeSort(lista3, new CompararStringAsc());
    	mergeSortAsc.imprimir(false);
    	
    //##MERGE SORT DECRESCENTE - LISTA 3##
    	lista3 = lerArq.importaString("src\\arquivos\\palavras_100000.txt", 100000);
    	mergeSortDesc = new MergeSort(lista3, new CompararStringDesc());
    	mergeSortDesc.imprimir(false);
    	
    //##MERGE SORT CRESCENTE - LISTA 4##
    	lista4 = lerArq.importaString("src\\arquivos\\palavras_1000000.txt", 1000000);
    	mergeSortAsc = new MergeSort(lista4, new CompararStringAsc());
    	mergeSortAsc.imprimir(false);
    	
    //##MERGE SORT DECRESCENTE - LISTA 4##
    	lista4 = lerArq.importaString("src\\arquivos\\palavras_1000000.txt", 1000000);
    	mergeSortDesc = new MergeSort(lista4, new CompararStringDesc());
    	mergeSortDesc.imprimir(false);
    	
    //##MERGE SORT CRESCENTE - LISTA 5##
    	lista5 = lerArq.importaArq("src\\arquivos\\objetos_100000.txt", 100000);
    	mergeSortAsc = new MergeSort(lista5, new CompararObjetoAsc());
    	mergeSortAsc.imprimir(false);
    	
    //##MERGE SORT DECRESCENTE - LISTA 5##
    	lista5 = lerArq.importaArq("src\\arquivos\\objetos_100000.txt", 100000);
    	mergeSortDesc = new MergeSort(lista5, new CompararObjetoDesc());
    	mergeSortDesc.imprimir(false);
        
    //##MERGE SORT CRESCENTE - LISTA 6##
    	lista6 = lerArq.importaArq("src\\arquivos\\objetos_1000000.txt", 1000000);
    	mergeSortAsc = new MergeSort(lista6, new CompararObjetoAsc());
    	mergeSortAsc.imprimir(false);
    	
    //##MERGE SORT DECRESCENTE - LISTA 6##
    	lista6 = lerArq.importaArq("src\\arquivos\\objetos_1000000.txt", 1000000);
    	mergeSortDesc = new MergeSort(lista6, new CompararObjetoDesc());
    	mergeSortDesc.imprimir(false);

*/
    }
}
