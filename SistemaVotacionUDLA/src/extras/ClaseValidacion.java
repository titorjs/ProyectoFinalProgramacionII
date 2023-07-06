
package extras;
import java.util.regex.Pattern;
/**
 *
 * @author Laptop
 */
public class ClaseValidacion {
    //método para validar el ingreso del usuario
    public static boolean validarUsuario (String usuario){
        String patron = "^A000[0-9]{5}$";
        return Pattern.matches(patron, usuario);
    }
    
    //método para validar la contraseña con un mínimo de 8 carateres hasta 16 caractéres
    public static boolean validarContrasenia (String contrasenia){
        String patron = "[A-Za-z0-9!@#\\$%\\^&\\*\\(\\)_\\+\\-=\\{\\}\\[\\]\\|;:'\",.<>\\/?\\\\]{8,16}";
        return Pattern.matches(patron, contrasenia);
    }
    
    //método para ingresar texto sin números y sin palabras con tilde, NO PERMITE ESPACIOS
    public static boolean validarSoloTexto (String texto){
        String patron = "^[a-zA-Z]+$";
        return Pattern.matches(patron, texto);
    }
    
    //método para ingresar solo números enteros
    public static boolean validarSoloNumeros (String numero){
        String patron = "^[0-9]\\d*$";
        return Pattern.matches(patron, numero);
    }
    
    //método para ingresar solo texto de cierta longitud
    public static boolean validarLongitusString(String texto, int longitudMaxima){
        return texto.length() <= longitudMaxima;
    }
}
