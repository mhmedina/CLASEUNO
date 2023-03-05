package clase_01_practica;

import java.util.Scanner;

public class Variable_1 {
    public static void main(String[] args) {
        int numeroInicio = 2;
        int numeroFin = 12;
        String numerosPares="";
        String numerosImpares="";
		
        while (numeroInicio <= numeroFin) {
            if (numeroInicio % 2 == 0) {
                System.out.println("Estos son los numeros pares: " + numeroInicio);
                numerosPares += String.valueOf(numeroInicio) + " ";
            } else {
                System.out.println("Estos son los numeros impares: " + numeroInicio);
                numerosImpares += String.valueOf(numeroInicio) + " ";
            }
            numeroInicio++;    
        }
        
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.print("Para ver numeros pares coloca Si, para ver impares No S/N: ");
            String imprimirValor = teclado.nextLine();
            
            if (imprimirValor.equalsIgnoreCase("S")) {
                System.out.println(numerosPares);
            } else {
                System.out.println(numerosImpares);
            }
        } catch (Exception e) {
            System.out.println("Error al leer entrada del usuario: " + e.getMessage());
        }
    }
}
        	
        



	