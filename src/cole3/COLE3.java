/*
En el main deberemos tener un bucle que crea un objeto Alumno. Se pide toda la
información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.

Crear una clase llamada Alumno que mantenga información sobre las notas de
distintos alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de
tipo Integer con sus 3 notas.

Después de ese bluce tendremos el siguiente método en la clase Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su
nota final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método.
Dentro del método se usará la lista notas para calcular el promedio final de alumno.
Siendo este promedio final, devuelto por el método y mostrado en el main.
 */
package cole3;

import java.util.ArrayList;
import java.util.Scanner;

public class COLE3 {

    public static void main(String[] args) {
      
        Scanner leer = new Scanner (System.in).useDelimiter("\n");
        ArrayList<Alumno> alumnos = new ArrayList<>();
        String respuesta = "";
        Alumno nuevoAlumno;
        ArrayList<Integer> notas = new ArrayList<Integer>();
        int valor1, valor2, valor3;
        do {
            nuevoAlumno = new Alumno();
            System.out.println("Ingrese el nombre del alumno:"); 
            String nombre = leer.nextLine();
            System.out.println("Ingrese las 3 notas del alumno:");
            valor1=leer.nextInt();valor2=leer.nextInt();valor3=leer.nextInt();
            notas.add(valor1);
            notas.add(valor2);
            notas.add(valor3);
            nuevoAlumno.setNotas(notas);
            nuevoAlumno.setNombre(nombre);
            alumnos.add(nuevoAlumno);
            System.out.println("¿Desea agregar otro alumno? S/N");
            respuesta = leer.next();
        }   while (!respuesta.equalsIgnoreCase("n"));
        
            System.out.println("Ingrese el alumno que quiera calcular su nota final:");
            String alumnoIngresado = leer.next();
            
            for (Alumno add : alumnos) {
                
                if (add.getNombre().equalsIgnoreCase(alumnoIngresado)) { 

                // Usamos el objeto estudiante creado en el for each para llamar el metodo para calcular la nota final
                System.out.println("La nota final de "  + alumnoIngresado + " es " + nuevoAlumno.notaFinal(notas));
            }
        }
    }
    
}