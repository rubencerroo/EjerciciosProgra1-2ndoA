package dominio;

import java.io.Serializable;
import java.util.UUID;

public class Contacto implements Serializable {
    private String referencia;
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private String numeroTelefono;


    public Contacto(String nombre, String primerApellido, String segundoApellido, String numeroTelefono) {
        this.referencia = generarReferenciaUnica();
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.numeroTelefono = numeroTelefono;
    }


    public String getReferencia() {
        return referencia;
    }


    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getPrimerApellido() {
        return primerApellido;
    }


    public void setModelo(String primerApellido) {
        this.primerApellido = primerApellido;
    }


    public String getSegundoApellido() {
        return segundoApellido;
    }


    public void setYear(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }


    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }


    @Override
    public String toString() {
        return "Referencia: " + referencia + ", Nombre: " + nombre + ", PrimerApellido: " + primerApellido
                + ", SegundoApellido: " + segundoApellido + ", Numero de Telefono: " + numeroTelefono;
    }


    private String generarReferenciaUnica() {
        return UUID.randomUUID().toString();
    }
 
    public boolean matchesSearchTerm(String searchTerm) {

        return nombre.contains(searchTerm) || primerApellido.contains(searchTerm)
                || segundoApellido.contains(searchTerm) || numeroTelefono.contains(searchTerm);
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;

        Contacto contacto = (Contacto) obj;

        return referencia.equals(contacto.referencia);
    }

    @Override
    public int hashCode() {
        return referencia.hashCode();
    }

}
