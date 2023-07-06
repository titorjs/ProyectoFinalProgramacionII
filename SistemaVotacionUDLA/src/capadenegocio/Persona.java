package capadenegocio;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author LEGION
 */
public class Persona {

    /**
     * Atributos de la clase Persona idBanner: es la identificacion de la
     * persona contrasenia: Contraseña de acceso nombre: Nombre de la persona
     * apellido Apellido de la persona
     */
    private String idBanner;
    private String contrasenia;
    private String nombre;
    private String apellido;

    /**
     * Constructor por parametro
     *
     * @param idBanner
     * @param contrasenia
     * @param nombre
     * @param apellido
     */
    public Persona(String idBanner, String contrasenia, String nombre, String apellido) {
        this.idBanner = idBanner;
        this.contrasenia = contrasenia;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    /**
     * Metodo get del IdBanner
     *
     * @return el IdBanner de la persona
     */
    public String getIdBanner() {
        return idBanner;
    }

    /**
     * Metodo get para el Nombre
     *
     * @return el nombre de la persona
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo get para el Apellido
     *
     * @return el apellido de la persona
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Metodo para validar de que la persona existe en la base de datos
     *
     * @param contrasenia
     * @return true si existe en la base false si no existe
     */
    public boolean validarCredenciales(String contrasenia) {
        return this.contrasenia.equals(contrasenia);
    }

}
