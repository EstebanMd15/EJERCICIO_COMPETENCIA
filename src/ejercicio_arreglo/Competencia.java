
package ejercicio_arreglo;

import java.util.ArrayList;
import javax.swing.JOptionPane;
public class Competencia {
    
    ArrayList<Atleta> listadoAtletas = new ArrayList<Atleta>();
 
    //METODO PARA REGISTRAR EL ATLETA 
public void nuevoAtleta (){
    String nombreAtleta=JOptionPane.showInputDialog("Ingresar Nombre");
    String nacionalidad=JOptionPane.showInputDialog("Ingresar Nacionalidad");
    double tiempo=Double.parseDouble(JOptionPane.showInputDialog("Ingresar Tiempo"));
    Atleta nuevoAtleta = new Atleta(nombreAtleta, nacionalidad, tiempo);
    listadoAtletas.add(nuevoAtleta);
   
}
public void mostrarAtleta(){
    for(Atleta a: listadoAtletas){
        System.out.println("Nombre: "+a.getNombre()+" Nacionalidad: "+a.getNacionalidad()+ " Tiempo: "+a.getTiempo());
    }
}
}



