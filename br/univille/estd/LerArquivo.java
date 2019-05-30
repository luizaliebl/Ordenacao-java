package br.univille.estd;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LerArquivo {
	
	Scanner input = new Scanner(System.in);
	
	public Double[] importaDouble(String arquivo, int tam) throws FileNotFoundException {
			
	    File file = new File(arquivo);
	
	    input = new Scanner(file);
	
	    Double[] lista = new Double[tam];
	
	    int i = 0;
	    while (input.hasNextLine()) {
	        double line = Double.parseDouble(input.nextLine());
	        lista[i] = line;
	        i++;
	    }
	    return lista;
	}
	
	public String[] importaString(String arquivo, int tam) throws FileNotFoundException {
		
	    File file = new File(arquivo);
	
	    input = new Scanner(file);
	
	    String[] lista = new String[tam];
	
	    int i = 0;
	    while (input.hasNextLine()) {
	        String line = input.nextLine();
	        lista[i] = line;
	        i++;
	    }
	    return lista;
	}
	
	public LatitudeLongitude[] importaArq(String arquivo, int tam) throws FileNotFoundException {
		
	    File file = new File(arquivo);
	    input = new Scanner(file);	
	    LatitudeLongitude[] lista = new LatitudeLongitude[tam];
	    int i = 0;
	    while (input.hasNextLine()) {
            String[] vetor = input.nextLine().split(" ");

            LatitudeLongitude latLng = new LatitudeLongitude();

            latLng.setLatitude(Double.parseDouble(vetor[0]));
            latLng.setLongitude(Double.parseDouble(vetor[1]));

            lista[i] = latLng;
            i++;
        }
	    return lista;
	}
}
