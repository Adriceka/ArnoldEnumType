package edu.teamrocket.arnold;

import edu.teamrocket.arnold.logica.Planeta;

public class ArnoldMain {
	
	public static void main(String[] args) {
        
        double peso = 48.0; // kg
        
        for(Planeta planeta : Planeta.values()){
            System.out.printf("Tu peso en %s es %f N%n", planeta.name(), planeta.pesoSuperficie(peso));
        }
         
        System.out.println("\nTu peso solo en los planetas terrestres: ");
        for(Planeta planeta: Planeta.getPlanetasTerrestres()){
            System.out.printf("Tu peso en %s es %f N%n", planeta.name(), planeta.pesoSuperficie(peso));
        }
         
        System.out.println("\nTu peso solo en los planetas gigantes gaseosos: ");
        for(Planeta planeta: Planeta.getGigantesGaseosos()){
            System.out.printf("Tu peso en %s es %f N%n", planeta.name(), planeta.pesoSuperficie(peso));
        }

        System.out.println("\nTu peso solo en los planetas gigantes helados: ");
        for(Planeta planeta: Planeta.getGigantesHelados()){
            System.out.printf("Tu peso en %s es %f N%n", planeta.name(), planeta.pesoSuperficie(peso));
        }
    }

}