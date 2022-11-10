/*
Crear una clase llamada Alumno que mantenga información sobre las notas de
distintos alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de
tipo Integer con sus 3 notas.
 */
package cole3;

import java.util.ArrayList;

public class Alumno {
    
    private String nombre;
    
    private ArrayList<Integer> notas;
 
    public Alumno() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }

    public double  notaFinal(ArrayList<Integer> notas){
        double promedio=0;
        for(int x=0;x<notas.size();x++) {
            promedio+=notas.get(x);
        }
        promedio=promedio/3;
        
        return promedio;
    }
}
