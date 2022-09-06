package celulararraylist;

import java.util.ArrayList;

public class CelularArrayList {

    public static void main(String[] args) {
        
        ArrayList<celular> arrayCelu = new ArrayList();
        
        arrayCelu.add(new celular(594239894, 40, "Malron", 0.5));
        arrayCelu.add(new celular(954237821, 1000, "Ricardo", 0.10));
        arrayCelu.add(new celular(978687234, 120, "Angelo", 0.5));
        arrayCelu.add(new celular(978078023, 5000, "Jesus", 0.30));
        
        System.out.println("--------- MOSTRANDO RESUTADOS ---------");
        arrayCelu.forEach(cel -> { 
            int cont = 0, cont2 = 0;
            cont++;
            System.out.println("\n ------- Persona " + cont + " -------");
            cel.mostrar(); 
            
            //Valores Cambiado
            System.out.println("************* MOSTRANOD CON DATOS ACTUALIZADOS *************");
            System.out.println("PERSONA " + cont2);
            cel.mostrar2();
        });
    }
    
}
