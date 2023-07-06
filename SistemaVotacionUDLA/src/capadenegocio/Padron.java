/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capadenegocio;

import capadenegocio.Facultades.Facultad;
import java.util.ArrayList;

/**
 *
 * @author titoj
 */
public class Padron {

    /**
     * Esta lista contiene a todos los estudiantes que van a votar
     */
    private ArrayList<Estudiante> estudiantes;

    /**
     * Lista de asociaciones participantes
     */
    private ArrayList<Asociacion> asociaciones;

    /**
     * Muestra el estado en el que se encuentra el proceso: 0 = agregar partidos
     * 1 = agregar candidatos 2 = votación
     */
    private int estadoProceso;

    private String idPadron;

    private ArrayList<Voto> votos;

    /**
     * Constructor sin parámetros que importa toda la información necesaria para
     * el funcionamiento del programa
     *
     */
    public Padron(ArrayList<Estudiante> estudiantes, ArrayList<Asociacion> asociaciones, ArrayList<Voto> votos, int estadoProceso, String idPadron) {
        this.estudiantes = estudiantes;
        this.asociaciones = asociaciones;
        this.votos = votos;
        this.estadoProceso = estadoProceso;
        this.idPadron = idPadron;
    }

    /**
     * Método get de la Lista de estudiantes
     *
     * @return List de Estudiantes
     */
    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    /**
     * Método get de las asociaciones
     *
     * @return
     */
    public ArrayList<Asociacion> getAsociaciones() {
        return asociaciones;
    }

    /**
     * Método get del estado proceso
     *
     * @return estado de proceso
     */
    public int getEstadoProceso() {
        return estadoProceso;
    }

    /**
     * Método get del id del padrón
     *
     * @return id del padrón
     */
    public String getIdPadron() {
        return idPadron;
    }

    /**
     * Método get de la lista de votos
     *
     * @return ArrayList<Voto> de los votos registrados
     */
    public ArrayList<Voto> getVotos() {
        return votos;
    }

    /**
     * Establece el estadoProceso en 1
     */
    public void setEstadoProcesoRegistro() {
        estadoProceso = 1;
    }

    /**
     * Establece el estadoProceso en 2
     */
    public void setEstadoProcesoVotaciones() {
        estadoProceso = 2;
    }

    /**
     * Establece el estadoProceso en 3
     */
    public void setEstadoFinalizado() {
        estadoProceso = 3;
    }

    /**
     * Busca un estudiante en la lista por su idBanner
     *
     * @param idBanner un String de 9 caracteres, de la forma: A00083259
     * @return retorna un objeto de tipo Estudiante, el cuál coincide con el
     * parámetro idBanner
     */
    public Estudiante buscarEstudiante(String idBanner) {
        if (!estudiantes.isEmpty()) {
            for (Estudiante e : estudiantes) {
                if (e.getIdBanner().equals(idBanner)) {
                    return e;
                }
            }
        }

        return null;
    }

    /**
     * Busca una asociación por nu nombre
     *
     * @param nombre de la asociación a buscar
     * @return Asociacion buscada, null si no se encontró nada
     */
    public Asociacion buscarAsociacion(String nombre) {
        if (!asociaciones.isEmpty()) {
            for (Asociacion a : asociaciones) {
                if (a.getNombre().equals(nombre)) {
                    return a;
                }
            }
        }
        return null;
    }

    /**
     * Agrega un voto a la lista de votos
     *
     * @param voto objeto de tipo Voto a agregar
     */
    public void agregarVoto(Voto voto) {
        votos.add(voto);
    }

    /**
     * Agrega uan asociación a la lista de asociaciones
     *
     * @param nombre nombre de la asociacion
     * @param presidente id del presidente de la asocicación
     * @param eslogan eslogan de la asociación
     */
    public void agregarAsociacion(String nombre, String presidente, String eslogan) {
        asociaciones.add(new Asociacion(nombre, eslogan, presidente));
    }

    /**
     * Elimina una lista de la lista de asociaciones
     *
     * @param nombre nombre de la asociación a eliminar
     */
    public void eliminarAsociacion(String nombre) {
        asociaciones.remove(buscarAsociacion(nombre));
    }

    /**
     * Busca si existe un candidato en cualquiera de las listas con cierto id
     * @param id id buscado
     * @return  true: si existe, false: no existe
     */
    public boolean existeCandidatoId(String id) {
        for (Asociacion a : asociaciones) {
            if (!a.getNombre().equals("blanco")) {
                if (a.getPresidenteGeneral() != null) {
                    if (a.getPresidenteGeneral().getEstudiante().equals(id)) {
                        return true;
                    }
                }
                if (a.getVicepresidenteGeneral() != null) {
                    if (a.getVicepresidenteGeneral().getEstudiante().equals(id)) {
                        return true;
                    }
                }
                for (Candidato c : a.getPresidentesFacultad().values()) {
                    if (c.getEstudiante().equals(id)) {
                        return true;
                    }
                }
                for (Candidato c : a.getVicepresidentesFacultad().values()) {
                    if (c.getEstudiante().equals(id)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /**
     * Valida si todas las listas han postulado a todos los candidatos necesarios
     * @return true: si , false: no
     */
    public boolean candidatosCompletos() {
        for (Asociacion a : asociaciones) {
            if (!a.getNombre().equals("blanco")) {
                if (a.getPresidenteGeneral() == null || a.getVicepresidenteGeneral() == null) {
                    return false;
                }
                for (Facultad f : Facultad.values()) {
                    if (a.getPresidentesFacultad().get(f) == null || a.getVicepresidentesFacultad().get(f) == null) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
