package capadenegocio;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LEGION
 */
public class Estudiante extends Persona{
    /**
     * Atributos de la clase Estudiante
     * facultar: enum de facultad a la que pertenece
     * aVotado:Verifica si el estudiante a votado o no
     * semestre: indica el semestre que esta cursando el estudiante
     * promedioGeneral: Promedio de notas que tiene el estudiante
     * estadoDiciplinario: Indica que estado diciplinario se encuentra el estudiante
     */
    protected Facultades.Facultad facultad;
    protected boolean aVotado;
    protected int semestre;
    protected double promedioGeneral;
    protected boolean estadoDiciplinario;
    
    /**
     * Constructor por parametro con atributos que hereda de la clase Persona
     * @param facultad
     * @param semestre
     * @param promedioGeneral
     * @param estadoDiciplinario
     * @param idBanner
     * @param contrasenia
     * @param nombre
     * @param apellido 
     */
    public Estudiante(Facultades.Facultad facultad, int semestre, double promedioGeneral, boolean estadoDiciplinario, String idBanner, String contrasenia, String nombre, String apellido, boolean aVotado) {
        super(idBanner, contrasenia, nombre, apellido);
        this.facultad = facultad;
        this.aVotado = aVotado;
        this.semestre = semestre;
        this.promedioGeneral = promedioGeneral;
        this.estadoDiciplinario = estadoDiciplinario;
    }
    
    /**
     * Metodo get de la Facultad
     * @return La faultad a la que pertenece
     */
    public Facultades.Facultad getFacultad() {
        return facultad;
    }
    /**
     * Metodo get de aVotado
     * @return 
     * true si el estudiante a votado
     * false si no a votado
     */
    public boolean isaVotado() {
        return aVotado;
    }
    /**
     * Metodo get para saber el semestre
     * @return Semesttre que esta cursando
     */
    public int getSemestre() {
        return semestre;
    }
    /**
     * Metodo get para el promedio
     * @return el promedio que tiene el estudiante
     */
    public double getPromedioGeneral() {
        return promedioGeneral;
    }
    /**
     * Metodo get del EstadoDiciplinario
     * @return 
     * true: si el estado es bueno
     * false: si el estado es malo
     */
    public boolean isEstadoDiciplinario() {
        return estadoDiciplinario;
    }
    
    /**
     * Metodo void para establecer el parametro aVotado a true
     */
    public Voto votar(String votoGeneral, String votoFacultad, int hora, int minuto, int segundo){
        Voto voto = new Voto(facultad, votoGeneral, votoFacultad, hora, minuto, segundo);
        aVotado = true;
        return voto;
    }
}
