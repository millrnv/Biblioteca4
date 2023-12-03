package modelo;

public class Usuario {

    private String nombre;
    private String rut;
    private String nTelefonico;

    public Usuario(String nombre, String rut, String nTelefonico) {
        this.nombre = nombre;
        this.rut = rut;
        this.nTelefonico = nTelefonico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getnTelefonico() {
        return nTelefonico;
    }

    public void setnTelefonico(String nTelefonico) {
        this.nTelefonico = nTelefonico;
    }
}
