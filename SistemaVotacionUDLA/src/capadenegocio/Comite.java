package capadenegocio;

import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author LEGION
 */
public class Comite {

    ArrayList<Persona> integranteComite;

    public Comite(ArrayList<Persona> integrantesComite){
        this.integranteComite = integrantesComite;
    }

    /**
     * Método get de integranteComite
     * @return List<Persona> lista de personas integrantes del comité
     */
    public List<Persona> getIntegranteComite() {
        return integranteComite;
    }

    /**
     * Busca un integrante del comité por id
     * @param id del integrante a buscar
     * @return Persona que es el integrante, si no lo encuentra retorna null
     */
    public Persona buscarIntegrante(String id) {
        if (!integranteComite.isEmpty()) {
            for (Persona p : integranteComite) {
                if (p.getIdBanner().equals(id)) {
                    return p;
                }
            }
        }
        return null;
    }
}
