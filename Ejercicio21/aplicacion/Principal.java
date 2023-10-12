package Ejercicio21.aplicacion;

import Ejercicio21.dominio.Localidad;
import Ejercicio21.dominio.Municipio;
import Ejercicio21.dominio.Provincia;

public class Principal {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        // Crear una localidad
        Localidad localidad1 = new Localidad();
        localidad1.setNombre("Ciudad A");
        localidad1.setNumeroDeHabitantes(10000);

        // Mostrar la localidad por pantalla
        System.out.println(localidad1);

        // Crear un municipio y agregar la localidad
        Municipio municipio1 = new Municipio();
        municipio1.agregarLocalidad(localidad1);

        // Contar el número total de habitantes en el municipio
        int totalHabitantesMunicipio1 = municipio1.contarHabitantes();
        System.out.println("Total de habitantes en el municipio 1: " + totalHabitantesMunicipio1);

        // Crear una provincia y agregar el municipio
        Provincia provincia1 = new Provincia();
        provincia1.agregarMunicipio(municipio1);

        // Contar el número total de habitantes en la provincia
        int totalHabitantesProvincia1 = provincia1.contarHabitantes();
        System.out.println("Total de habitantes en la provincia 1: " + totalHabitantesProvincia1);
    }
}
