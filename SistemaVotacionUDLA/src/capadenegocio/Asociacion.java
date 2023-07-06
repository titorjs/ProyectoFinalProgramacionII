package capadenegocio;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import capadenegocio.Facultades.Facultad;
import java.util.Hashtable;

/**
 *
 * @author LEGION
 */
public class Asociacion {
    private String nombre;
    private String presidenteAsociacion;
    private int numFirmas;
    private String eslogan;
    private Candidato presidenteGeneral;
    private Candidato vicepresidenteGeneral;
    private Hashtable<Facultades.Facultad, Integer> votosGeneral;
    private Hashtable<Facultades.Facultad, Candidato> presidentesFacultad;
    private Hashtable<Facultades.Facultad, Candidato> vicepresidentesFacultad;
    private Hashtable<Facultades.Facultad, Integer> votosFacultad;

    public Asociacion(String nombre, String presidenteAsociacion, int numFirmas, String eslogan, Candidato presidenteGeneral, Candidato vicepresidenteGeneral, Hashtable<Facultades.Facultad, Integer> votosGeneral, Hashtable<Facultades.Facultad, Candidato> presidentesFacultad, Hashtable<Facultades.Facultad, Candidato> vicepresidentesFacultad, Hashtable<Facultades.Facultad, Integer> votosFacultad) {
        this.nombre = nombre;
        this.presidenteAsociacion = presidenteAsociacion;
        this.numFirmas = numFirmas;
        this.eslogan = eslogan;
        this.presidenteGeneral = presidenteGeneral;
        this.vicepresidenteGeneral = vicepresidenteGeneral;
        this.votosGeneral = votosGeneral;
        this.presidentesFacultad = presidentesFacultad;
        this.vicepresidentesFacultad = vicepresidentesFacultad;
        this.votosFacultad = votosFacultad;
    }

    public Asociacion(String nombre, String eslogan, String presidenteAsociacion) {
        this.eslogan = eslogan;
        this.nombre = nombre;
        this.presidenteAsociacion = presidenteAsociacion;
        this.numFirmas = 0;
        this.presidenteGeneral = null;
        this.vicepresidenteGeneral = null;
        this.presidentesFacultad = new Hashtable<>();
        this.vicepresidentesFacultad = new Hashtable<>();
    }

    /**
     * Método get del nombre
     *
     * @return String con el nombre de la asociación
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método get del presidente
     *
     * @return un Estudiante, dirigente de la Asociacion
     */
    public String getPresidenteAsociacion() {
        return presidenteAsociacion;
    }

    /**
     * Método get del número de firmas
     *
     * @return int, con el número de firmas
     */
    public int getNumFirmas() {
        return numFirmas;
    }

    /**
     * Método get del eslogan
     *
     * @return String, con el slogan
     */
    public String getEslogan() {
        return eslogan;
    }

    /**
     * Método get del candidato a presidente general
     *
     * @return CandidatoGeneral, con el candidato al presidente general
     */
    public Candidato getPresidenteGeneral() {
        return presidenteGeneral;
    }

    /**
     * Método get del candidato a vicepresidente general
     *
     * @return int, con el candidato al vicepresidente general
     */
    public Candidato getVicepresidenteGeneral() {
        return vicepresidenteGeneral;
    }

    /**
     * Método get de los votos general
     * @return 
     */
    public Hashtable<Facultades.Facultad, Integer> getVotosGeneral() {
        return votosGeneral;
    }

    /**
     * Método get de los votos facultad
     * @return 
     */
    public Hashtable<Facultades.Facultad, Integer> getVotosFaculad() {
        return votosFacultad;
    }

    /**
     * Método get de los candidatos a presidente para las facultades
     *
     * @return una lista de los candidatos a presidente para cada facultad
     */
    public Hashtable<Facultades.Facultad, Candidato> getPresidentesFacultad() {
        return presidentesFacultad;
    }       

    /**
     * Método get de los candidatos a vicepresidente para las facultades
     *
     * @return una lista de los candidatos a vicpresidente para cada facultad
     */
    public Hashtable<Facultades.Facultad, Candidato> getVicepresidentesFacultad() {
        return vicepresidentesFacultad;
    }

    /**
     * Busca un candidato de la facultad según sea presidente o vicepresidente
     * @param facultad facultad por la que postula
     * @param presidente si es presidente o no
     * @return Objeto con la información del estudiante deseado
     */
    public Candidato buscarCandidatoFacultad(Facultad facultad, boolean presidente) {
        for (Facultad f : (presidente ? presidentesFacultad : vicepresidentesFacultad).keySet()) {
            if (f.equals(facultad)) {
                return (presidente ? presidentesFacultad : vicepresidentesFacultad).get(f);
            }
        }
        return null;
    }

    /**
     * Establece el número de firmas recolectado por la Asociación
     *
     * @param numFirmas número de firmas a fijar para el partido
     */
    public void setFirmas(int numFirmas) {
        this.numFirmas = numFirmas;
    }

    /**
     * Agrega voto para aseudla general a una asociación
     * @param facultad de donde proviene el voto
     */
    public void agregarVotoGeneral(Facultad facultad) {
        votosGeneral.put(facultad, votosGeneral.get(facultad) + 1);
    }

    /**
     * Agrega voto para aseudla facultad a una asociación
     * @param facultad de donde proviene el voto
     */
    public void agregarVotoFacultad(Facultad facultad) {
        votosFacultad.put(facultad, votosFacultad.get(facultad) + 1);
    }

    /**
     * Agrega candidato general con cierto id
     * @param id del candidato
     * @param presidente si es presidente o vicepresidente
     */
    public void agregarCandidatoGeneral(String id, boolean presidente) {
        if (presidente) {
            presidenteGeneral = new Candidato(Dignidades.Dignidad.PRESIDENTE, id);
        } else {
            vicepresidenteGeneral = new Candidato(Dignidades.Dignidad.VICEPRESIDENTE, id);
        }
    }

    /**
     * Agrega candidato general con cierto id
     * @param id del candidato
     * @param facultad a la que postula
     * @param presidente si es presidente(true) o vicepresidente(false)
     */
    public void agregarCandidatoFacultad(String id, Facultad facultad, boolean presidente) {
        if (presidente) {
            presidentesFacultad.put(facultad, new Candidato(Dignidades.Dignidad.PRESIDENTE, id));
        } else {
            vicepresidentesFacultad.put(facultad, new Candidato(Dignidades.Dignidad.VICEPRESIDENTE, id));
        }
    }

    /**
     * Eliminar un candidato de aseudla general
     * @param presidente si es el presidente(true) o vicepresidente(false)
     */
    public void eliminarCandidatoGeneral(boolean presidente) {
        if (presidente) {
            presidenteGeneral = null;
        } else {
            vicepresidenteGeneral = null;
        }
    }

    /**
     * Eliminar un candidato de aseudla facultad
     * @param presidente si es el presidente(true) o vicepresidente(false)
     * @param facultad facultad a la que postulaba
     */
    public void eliminarCandidatoFacultad(boolean presidente, Facultad facultad) {
        if (presidente) {
            presidentesFacultad.remove(buscarCandidatoFacultad(facultad, presidente));
        } else {
            vicepresidentesFacultad.remove(buscarCandidatoFacultad(facultad, presidente));
        }
    }

    /**
     * Calcula el número total de votos para la dignidad general
     * @return número de votos totales
     */
    public int votosTotalesGeneral() {
        int votos = 0;
        for (Integer in : votosGeneral.values()) {
            votos += in;
        }
        return votos;
    }
}
