/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capadenegocio;

import capadenegocio.Facultades.Facultad;
import java.util.Calendar;

/**
 *
 * @author titoj
 */
public class Voto {

    /**
     * proveniente: Facultad de donde fue emitido el voto votoGeneral:
     * Asociación por la que vota para dignidad general votoFacultad: Asociación
     * por la que vota para dignidad de su facutad hora: hora en la que se
     * registra el voto minuto: minuto en la que se registra el voto segundo:
     * segundo en la que se registra el voto
     */
    private Facultad proveniente;
    private String votoGeneral;
    private String votoFacultad;
    private int hora;
    private int minuto;
    private int segundo;

    public Voto(Facultad proveniente, String votoGeneral, String votoFacultad, int hora, int minuto, int segundo) {
        this.proveniente = proveniente;
        this.votoGeneral = votoGeneral;
        this.votoFacultad = votoFacultad;
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    /**
     * Método get de Proveniente
     *
     * @return de que facultad proviene
     */
    public Facultad getProveniente() {
        return proveniente;
    }

    /**
     * Método get VotoGeneral
     *
     * @return asociación por la que votó para la dignidad general
     */
    public String getVotoGeneral() {
        return votoGeneral;
    }

    /**
     * Método get VotoFacultad
     *
     * @return asociación por la que votó para la dignidad facultad
     */
    public String getVotoFacultad() {
        return votoFacultad;
    }

    /**
     * Método get de la hora del voto
     * @return hora a la que se registró el voto
     */
    public int getHora() {
        return hora;
    }

    /**
     * Método get de la minuto del voto
     * @return minuto a la que se registró el voto
     */
    public int getMinuto() {
        return minuto;
    }

    /**
     * Método get de la segundo del voto
     * @return segundo a la que se registró el voto
     */
    public int getSegundo() {
        return segundo;
    }

}
