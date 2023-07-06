package capabasededatos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import capadenegocio.Asociacion;
import capadenegocio.Candidato;
import capadenegocio.Dignidades;
import capadenegocio.Dignidades.Dignidad;
import capadenegocio.Estudiante;
import capadenegocio.Facultades;
import capadenegocio.Facultades.Facultad;
import capadenegocio.Persona;
import capadenegocio.Voto;
import java.sql.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Hashtable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author titoj
 */
public class Conexion {

    /**
     * Constantes para establecer la conexión
     */
    private final String URL = "jdbc:mysql://localhost:3306/proyecto_final";
    private String USERNAME = "root";
    private String PASSWORD = "MySQLs&5H%";
    private final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private Connection cx;

    public Conexion() {
        conectar();
    }

    /**
     * Devuelve la conexión realizada con la base de datos
     */
    public void conectar() {
        try {
            Class.forName(DRIVER);
            cx = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Se conectó");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("No se conectó");
        }
    }

    public Connection con() {
        return cx;
    }

    /**
     * Cierra la conexión antes creada
     */
    public void desconectar() {

        if (cx != null) {
            try {
                cx.close();
                System.out.println("Se ha desconectado");
            } catch (SQLException ex) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("No se ha desconectado?");
            }
        }
    }

    /**
     * Decarga los estudiantes desde la base de datos
     * @return ArrayList<Estudiante> con todos los estudiantes y su información
     * null si hubo error
     */
    public ArrayList<Estudiante> descargarEstudiantes() {
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        try {
            String sql = "SELECT * FROM estudiantes;";
            Statement st = cx.createStatement();

            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                Facultad facultad = Facultad.valueOf(rs.getString("facultad"));
                int semestre = rs.getInt("semestre");
                double promedioGeneral = rs.getDouble("promedio");
                boolean estadoDiciplinario = rs.getBoolean("estadoDisciplianario");
                String idBanner = rs.getString("id");
                String contrasenia = rs.getString("contrasenia");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                boolean aVotado = Boolean.parseBoolean(rs.getString("aVotado"));

                estudiantes.add(new Estudiante(facultad, semestre, promedioGeneral,
                        estadoDiciplinario, idBanner, contrasenia, nombre, apellido, aVotado));
            }
            return estudiantes;
        } catch (SQLException sql) {
            System.out.println("descargarEstudiantes");
            return null;
        }
    }

    /**
     * Decarga los Integrantes del comité desde la base de datos
     * @return ArrayList<Persona> con todos los integrantes del comité y su información
     * null si hubo error
     */
    public ArrayList<Persona> descargarComite() {
        ArrayList<Persona> integrantes = new ArrayList<>();
        try {
            String sql = "SELECT * FROM comite;";
            Statement st = cx.createStatement();

            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                String idBanner = rs.getString("id");
                String contrasenia = rs.getString("contrasenia");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");

                integrantes.add(new Persona(idBanner, contrasenia, nombre, apellido));
            }
            return integrantes;
        } catch (SQLException sql) {
            System.out.println("descargarComite");
            return null;
        }
    }

    /**
     * Decarga los partidos desde la base de datos
     * @return ArrayList<Asociacion> con todos los partidos y su información
     * null si hubo error
     */
    public ArrayList<Asociacion> descargarPartidos() {
        ArrayList<Asociacion> partidos = new ArrayList<>();
        try {
            String sql = "SELECT * FROM partidos;";
            Statement st = cx.createStatement();

            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                String nombre = rs.getString("nombre");
                String presidenteAsociacion = rs.getString("presidente");
                int numFirmas = rs.getInt("firmas");
                String eslogan = rs.getString("eslogan");
                Candidato presidenteGeneral = descargarCandidatoGeneral(rs.getString("nombre"), true);
                Candidato vicepresidenteGeneral = descargarCandidatoGeneral(rs.getString("nombre"), false);
                Hashtable<Facultad, Integer> votosGeneral = new Hashtable<>();
                Hashtable<Facultad, Integer> votosFacultad = new Hashtable<>();
                for (Facultad f : Facultad.values()) {
                    votosGeneral.put(f, rs.getInt("g_" + f.toString()));
                    votosFacultad.put(f, rs.getInt("f_" + f.toString()));
                }
                Hashtable<Facultad, Candidato> presidentesFacultad = descargarCandidatosFacultades(rs.getString("nombre"), true);
                Hashtable<Facultad, Candidato> vicepresidentesFacultad = descargarCandidatosFacultades(rs.getString("nombre"), false);

                partidos.add(new Asociacion(nombre, presidenteAsociacion, numFirmas, eslogan,
                        presidenteGeneral, vicepresidenteGeneral, votosGeneral, presidentesFacultad,
                        vicepresidentesFacultad, votosFacultad));
            }
            return partidos;
        } catch (SQLException sql) {
            System.out.println("descargarPartidos");
            return null;
        }
    }

    /**
     * Descarga el candidato general presidente/vicepresidente de una asociación
     * @param asociacion nombre de la asociación a buscar
     * @param presidente si se busca el presidente true, vicepresidente false
     * @return Candidato con la información del presidente/vicepresidente
     * null si hubo error
     */
    public Candidato descargarCandidatoGeneral(String asociacion, boolean presidente) {
        Candidato candidato = null;
        try {
            String sql = "SELECT * FROM candidatos_general_" + (presidente ? "p" : "v") + " "
                    + "WHERE partido = ?";
            PreparedStatement ps = cx.prepareStatement(sql);
            ps.setString(1, asociacion);

            ResultSet rs = ps.executeQuery();

            rs.next();

            String id = rs.getString("id");
            String propuestas[] = new String[5];
            propuestas[0] = rs.getString("propuesta_1");
            propuestas[1] = rs.getString("propuesta_2");
            propuestas[2] = rs.getString("propuesta_3");
            propuestas[3] = rs.getString("propuesta_4");
            propuestas[4] = rs.getString("propuesta_5");
            Dignidad dignidad = presidente ? Dignidades.Dignidad.PRESIDENTE : Dignidades.Dignidad.VICEPRESIDENTE;

            candidato = new Candidato(dignidad, id, propuestas);

            return candidato;
        } catch (SQLException sql) {
            System.out.println("descargarCandidatoGeneral");
            return null;
        }
    }

    /**
     * Devuelve la lista de candidatos para las facultades ya sea de presidente
     * o vicepresidente, esto de una asociación
     * @param asociacion nombre de la asociación a buscar
     * @param presidente si se busca los presidentes true, vicepresidentes false
     * @return Hashtable<Facultades.Facultad, Candidato> con los candidatos organizados
     * por facultad, null si hubo error
     */
    public Hashtable<Facultades.Facultad, Candidato> descargarCandidatosFacultades(String asociacion, boolean presidente) {
        Hashtable<Facultades.Facultad, Candidato> candidato = new Hashtable<>();
        try {
            String sql = "SELECT * FROM candidatos_facultad_" + (presidente ? "p" : "v") + " "
                    + "WHERE partido = ?";
            PreparedStatement ps = cx.prepareStatement(sql);
            ps.setString(1, asociacion);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String id = rs.getString("id");
                String propuestas[] = new String[5];
                propuestas[0] = rs.getString("propuesta_1");
                propuestas[1] = rs.getString("propuesta_2");
                propuestas[2] = rs.getString("propuesta_3");
                propuestas[3] = rs.getString("propuesta_4");
                propuestas[4] = rs.getString("propuesta_5");
                Dignidad dignidad = presidente ? Dignidades.Dignidad.PRESIDENTE : Dignidades.Dignidad.VICEPRESIDENTE;

                candidato.put(Facultad.valueOf(rs.getString("facultad")), new Candidato(dignidad, id, propuestas));
            }

            return candidato;
        } catch (SQLException sql) {
            System.out.println("descargarCandidatosFacultades");
            return null;
        }
    }

    /**
     * Descarga el estado del proceso actual
     * @return int con el estado del proceso, -1 si hubo error
     */
    public int descargarEstadoProceso() {
        try {
            String sql = "SELECT * FROM estado_proceso";
            Statement st = cx.createStatement();

            ResultSet rs = st.executeQuery(sql);
            rs.next();
            return rs.getInt("estado");
        } catch (SQLException sql) {
            System.out.println("descargarEstadoProceso");
            return -1;
        }
    }

    /**
     * Descarga el id del padrón
     * @return String con el identificador del padrón, null si hubo error
     */
    public String descargarIDPadron() {
        try {
            String sql = "SELECT * FROM estado_proceso";
            Statement st = cx.createStatement();

            ResultSet rs = st.executeQuery(sql);
            rs.next();
            return rs.getString("id");
        } catch (SQLException sql) {
            System.out.println("descargarIDPadron");
            return null;
        }
    }

    /**
     * Descarga los votos registrados al momento
     * @return ArrayList<Voto> con los votos registrados, null si hubo error
     */
    public ArrayList<Voto> descargarVotos() {
        try {
            ArrayList<Voto> votos = new ArrayList<>();
            String sql = "SELECT * FROM registro_votos";
            Statement st = cx.createStatement();

            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                Facultad facultad = Facultad.valueOf(rs.getString("proveniente"));
                String votoGeneral = rs.getString("general");
                String votoFacultad = rs.getString("facultad");
                String horaC = rs.getString("hora");
                int hora = Integer.parseInt(horaC.substring(0, 2));
                int min = Integer.parseInt(horaC.substring(3, 5));
                int seg = Integer.parseInt(horaC.substring(6, 8));

                votos.add(new Voto(facultad, votoGeneral, votoFacultad, hora, min, seg));
            }
            return votos;
        } catch (SQLException sql) {
            System.out.println("descargarVotos");
            return null;
        }
    }

    /**
     * Agrega un partido en la base de datos
     * @param nombre nombre del partido a agregar
     * @param presidente id del presidente de la asociación a agregar
     * @param eslogan eslogan del partido a agregar
     * @return true: se hizo correctamente false: si hubo un error
     */
    public boolean agregarPartido(String nombre, String presidente, String eslogan) {
        try {
            String sql = "INSERT INTO partidos (nombre, presidente, eslogan)\n"
                    + "VALUES (? , ? , ?);";
            PreparedStatement ps = cx.prepareStatement(sql);
            ps.setString(1, nombre);
            ps.setString(2, presidente);
            ps.setString(3, eslogan);

            ps.execute();
            return true;
        } catch (SQLException sql) {
            System.out.println("agregarPartido");
            return false;
        }
    }

    /**
     * Elimina un partido de la base de datos según el nombre
     * @param nombre nombre de la asociación a eliminar
     * @return true: se hizo correctamente false: si hubo un error
     */
    public boolean eliminarPartido(String nombre) {
        try {
            String sql = "DELETE FROM partidos "
                    + "WHERE nombre = ?";
            PreparedStatement ps = cx.prepareStatement(sql);
            ps.setString(1, nombre);
            ps.execute();

            return true;
        } catch (SQLException sql) {
            System.out.println("eliminarPartido");
            return false;
        }
    }

    /**
     * Establece el número de firmas para una asociación
     * @param nombre nombre de la asociación a cambiarle el número de firmas
     * @param firmas número de firmas para modificar
     * @return true: se hizo correctamente false: si hubo un error
     */
    public boolean establecerFirmasAsociacion(String nombre, int firmas) {
        try {
            String sql = "UPDATE partidos "
                    + "SET firmas = ? "
                    + "WHERE nombre = ? ";
            PreparedStatement ps = cx.prepareStatement(sql);
            ps.setInt(1, firmas);
            ps.setString(2, nombre);
            ps.executeUpdate();

            return true;
        } catch (SQLException sql) {
            System.out.println("establecerFirmasAsociacion");
            return false;
        }
    }

    /**
     * Actualiza el estado del proceso a 1
     * @return true: se hizo correctamente false: si hubo un error
     */
    public boolean actualizarEstadoAgregacionCandidatos() {
        try {
            String sql = "UPDATE estado_proceso "
                    + "SET estado = 1";
            Statement ps = cx.createStatement();
            ps.execute(sql);

            return true;
        } catch (SQLException sql) {
            System.out.println("actualizarEstadoAgregacionCandidatos");
            return false;
        }
    }

    /**
     * Agrega un candidato a la tabla correspodiente para AseudlaGeneral
     * @param id id banner del candidato
     * @param partido partido por el que va a participar
     * @param presidente true: si se postula a presidente, false: a vicepresidente
     * @return true: se hizo correctamente false: si hubo un error
     */
    public boolean agregarCandidatoGeneral(String id, String partido, boolean presidente) {
        try {
            String sql = "INSERT INTO candidatos_general_" + (presidente ? "p" : "v") + " (id, partido) "
                    + "VALUES (?, ?)";
            PreparedStatement ps = cx.prepareStatement(sql);
            ps.setString(1, id);
            ps.setString(2, partido);
            ps.executeUpdate();

            return true;
        } catch (SQLException sql) {
            System.out.println("agregarCandidatoGeneral");
            return false;
        }
    }

    /**
     * Agrega un candidato a la tabla correspodiente para AseudlaFacultad
     * @param id id banner del candidato
     * @param partido partido por el que va a participar
     * @param presidente true: si se postula a presidente, false: a vicepresidente
     * @param facultad facultad por la que participará
     * @return true: se hizo correctamente false: si hubo un error
     */
    public boolean agregarCandidatoFacultad(String id, String partido, String facultad, boolean presidente) {
        try {
            String sql = "INSERT INTO candidatos_facultad_" + (presidente ? "p" : "v") + " (id, partido, facultad) "
                    + "VALUES (?, ?, ?)";
            PreparedStatement ps = cx.prepareStatement(sql);
            ps.setString(1, id);
            ps.setString(2, partido);
            ps.setString(3, facultad);
            ps.executeUpdate();

            return true;
        } catch (SQLException sql) {
            System.out.println("agregarCandidatoFacultad");
            return false;
        }
    }

    /**
     * Elimina un candidato a la tabla correspodiente para AseudlaFacultad
     * @param partido partido por el que iba a participar
     * @param presidente true: si se postulaba a presidente, false: a vicepresidente
     * @return true: se hizo correctamente false: si hubo un error
     */
    public boolean eliminarCandidatoGeneral(String partido, boolean presidente) {
        try {
            String sql = "DELETE FROM candidatos_general_" + (presidente ? "p" : "v") + " "
                    + "WHERE partido = ?";
            PreparedStatement ps = cx.prepareStatement(sql);
            ps.setString(1, partido);
            ps.executeUpdate();

            return true;
        } catch (SQLException sql) {
            System.out.println("eliminarCandidatoGeneral");
            return false;
        }
    }

    /**
     * Elimina un candidato a la tabla correspodiente para AseudlaFacultad
     * @param partido partido por el que iba a participar
     * @param facultad facultad por la que iba a participar
     * @param presidente true: si se postulaba a presidente, false: a vicepresidente
     * @return true: se hizo correctamente false: si hubo un error
     */
    public boolean eliminarCandidatoFacultad(String partido, String facultad, boolean presidente) {
        try {
            String sql = "DELETE FROM candidatos_facultad_" + (presidente ? "p" : "v") + " "
                    + "WHERE partido = ? AND facultad = ?";
            PreparedStatement ps = cx.prepareStatement(sql);
            ps.setString(1, partido);
            ps.setString(2, facultad);
            ps.executeUpdate();

            return true;
        } catch (SQLException sql) {
            System.out.println("eliminarCandidatoFacultad");
            return false;
        }
    }

    /**
     * Actualiza el estado del proceso a 2
     * @return true: se hizo correctamente false: si hubo un error
     */
    public boolean actualizarEstadoVotaciones() {
        try {
            String sql = "UPDATE estado_proceso "
                    + "SET estado = 2";
            Statement ps = cx.createStatement();
            ps.execute(sql);

            return true;
        } catch (SQLException sql) {
            System.out.println("actualizarEstadoVotaciones");
            return false;
        }
    }

    /**
     * Actualiza el estado del proceso a 3
     * @return true: se hizo correctamente false: si hubo un error
     */
    public boolean actualizarEstadoFinalizado() {
        try {
            String sql = "UPDATE estado_proceso "
                    + "SET estado = 3";
            Statement ps = cx.createStatement();
            ps.execute(sql);

            return true;
        } catch (SQLException sql) {
            System.out.println("actualizarEstadoVotaciones");
            return false;
        }
    }

    /**
     * Agrega un voto a la asociación correspondiente en el apartado correspondiente
     * @param nombre nombre de la facultad a aumentar el voto
     * @param facultad facultad de la que viene el voto o a la que se le debe aumentar
     * @param general si participa por aseudla general(true) o facultad(false)
     * @return true: se hizo correctamente false: si hubo un error
     */
    public boolean agregarVoto(String nombre, String facultad, boolean general) {
        try {
            String tabla = (general ? "g" : "f");
            String sql = "UPDATE partidos "
                    + "SET " + tabla + "_" + facultad + " = " + tabla + "_" + facultad + " + 1 "
                    + "WHERE nombre = ?";
            PreparedStatement ps = cx.prepareStatement(sql);
            ps.setString(1, nombre);
            ps.execute();

            return true;
        } catch (SQLException sql) {
            System.out.println("agregarVoto");
            return false;
        }
    }

    /**
     * Actualiza el estado a true una vez votó el estudiante
     * @param id id del estudiante a actualizar
     * @return true: se hizo correctamente false: si hubo un error
     */
    public boolean cambiarVotoEstudiante(String id) {
        try {
            String sql = "UPDATE estudiantes "
                    + "SET aVotado = 'true'"
                    + "WHERE id = ?";
            PreparedStatement ps = cx.prepareStatement(sql);
            ps.setString(1, id);
            ps.execute();

            return true;
        } catch (SQLException sql) {
            System.out.println("cambiarVotoEstudiante");
            return false;
        }
    }

    /**
     * Añade un registro de votación, equivalente a guardar la papeleta
     * @param proveniente facultad de la que proviene el voto
     * @param general asociación por la que votó en la dignidad general
     * @param facultad asociación por la que votó en la dignidad facultad
     * @param cal objeto con la información de la hora al momento del voto
     * @return true: se hizo correctamente false: si hubo un error
     */
    public boolean añadirRegistro(String proveniente, String general, String facultad, Calendar cal) {

        int hora = cal.get(Calendar.HOUR_OF_DAY);
        int minuto = cal.get(Calendar.MINUTE);
        int segundo = cal.get(Calendar.SECOND);
        try {
            String sql = "INSERT INTO registro_votos "
                    + " VALUES (?, ?, ?, ?)";
            PreparedStatement ps = cx.prepareStatement(sql);
            ps.setString(1, ((hora < 10) ? "0" : "") + hora + ":" + ((minuto < 10) ? "0" : "") + minuto + ":" + ((segundo < 10) ? "0" : "") + segundo);
            ps.setString(2, proveniente);
            ps.setString(3, general);
            ps.setString(4, facultad);

            ps.executeUpdate();

            return true;
        } catch (SQLException sql) {
            System.out.println("añadirRegistro");
            return false;
        }
    }

    /**
     * Modifica las propuestas de un candidato a aseudla general
     * @param asociacion asociacion a la que pertenece el candidato
     * @param propuestas array de propuestas a insertar
     * @param presidente true: modificar al presidente, false: vicepresidente
     * @return true: se hizo correctamente false: si hubo un error
     */
    public boolean modificarPropuestasGeneral(String asociacion, String[] propuestas, boolean presidente) {
        try {
            String columna = presidente ? "p" : "v";
            String sql = "UPDATE candidatos_general_" + columna + " "
                    + "SET propuesta_1 = ?, "
                    + "propuesta_2 = ?, "
                    + "propuesta_3 = ?, "
                    + "propuesta_4 = ?, "
                    + "propuesta_5 = ? "
                    + "WHERE partido = ? ";
            PreparedStatement ps = cx.prepareStatement(sql);
            ps.setString(1, propuestas[0]);
            ps.setString(2, propuestas[1]);
            ps.setString(3, propuestas[2]);
            ps.setString(4, propuestas[3]);
            ps.setString(5, propuestas[4]);
            ps.setString(6, asociacion);
            ps.executeUpdate();

            return true;
        } catch (SQLException sql) {
            System.out.println("modificarPropuestasGeneral");
            return false;
        }
    }

    /**
     * Modifica las propuestas de un candidato a aseudla facultad
     * @param asociacion asociacion a la que pertenece el candidato
     * @param propuestas array de propuestas a insertar
     * @param presidente true: modificar al presidente, false: vicepresidente
     * @param facultad facultad por la que participará el candidato
     * @return true: se hizo correctamente false: si hubo un error
     */
    public boolean modificarPropuestasFacultad(String asociacion, String facultad, String[] propuestas, boolean presidente) {
        try {
            String columna = presidente ? "p" : "v";
            String sql = "UPDATE candidatos_facultad_" + columna + " "
                    + "SET propuesta_1 = ?, "
                    + "propuesta_2 = ?, "
                    + "propuesta_3 = ?, "
                    + "propuesta_4 = ?, "
                    + "propuesta_5 = ? "
                    + "WHERE partido = ? AND facultad = ?";
            PreparedStatement ps = cx.prepareStatement(sql);
            ps.setString(1, propuestas[0]);
            ps.setString(2, propuestas[1]);
            ps.setString(3, propuestas[2]);
            ps.setString(4, propuestas[3]);
            ps.setString(5, propuestas[4]);
            ps.setString(6, asociacion);
            ps.setString(7, facultad);
            ps.executeUpdate();

            return true;
        } catch (SQLException sql) {
            System.out.println("modificarPropuestasFacultad");
            return false;
        }
    }
}
