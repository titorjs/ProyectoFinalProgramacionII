/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capadenegocio;

/**
 *
 * @author titoj
 */
public class Candidato {

    private Dignidades.Dignidad dignidad;
    private String candidato;
    private String[] propuestas;

    /**
     * Constructor para inciar/crear un Candidato
     *
     * @param asociacion
     * @param dignidad
     * @param candidato id del estudiante postulante
     */
    public Candidato(Dignidades.Dignidad dignidad, String candidato) {
        this.dignidad = dignidad;
        this.candidato = candidato;
        this.propuestas = new String[5];
    }

    /**
     * Constructor para crear un Candidato con datos definidos
     * @param asociacion
     * @param dignidad
     * @param candidato
     * @param propuestas 
     */
    public Candidato(Dignidades.Dignidad dignidad, String candidato, String[] propuestas) {
        this.dignidad = dignidad;
        this.candidato = candidato;
        this.propuestas = propuestas;
    }

    /**
     * Método get de la Dignidad
     *
     * @return devuelve la dignidad a la que pertenece el candidato
     */
    public Dignidades.Dignidad getDignidad() {
        return dignidad;
    }

    /**
     * Método get del Estudiante
     *
     * @return devuelve un objeto de tipo estudiante, que hace referencia al
     * estudiante asociado con la candidatura
     */
    public String getEstudiante() {
        return candidato;
    }

    /**
     * Método get de las propuestas
     *
     * @return un array de String´s que contiene las propuestas
     */
    public String[] getPropuestas() {
        return propuestas;
    }

    /**
     * Método para modificar las propuestas
     * 
     * @param propuestas array de propuestas nuevas
     */
    public void modificarPropuestas(String[] propuestas) {
        this.propuestas = propuestas;
    }
}
