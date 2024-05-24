
package ejercicio_arreglo;

import javax.swing.JOptionPane;
 
public class Principal {

    
    public static void main(String[] args) {
        
        boolean x=true;
        
        while(x){
            String menu = JOptionPane.showInputDialog("***Competencia***\n"
            + "1. Registrar Atleta. \n"
            + "2. Datos del Campeón. \n"
            + "3. Atletas por País. \n"
            + "4. Tiempo Promedio de Todos los Atletas. \n"
            + "5. Salir");
            int opcion=Integer.parseInt(menu);
                switch (opcion){
                    case 1:                      
                        Competencia competidores = new Competencia();
                        competidores.nuevoAtleta();
                        competidores.mostrarAtleta();
                    break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    default:
                        throw new AssertionError();
       }  
      }   
    }
}
