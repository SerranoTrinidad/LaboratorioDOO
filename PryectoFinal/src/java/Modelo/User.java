package Modelo;

/**
 *
 * @author Luis Serrano
 */
public final class User {
    private String usuario;
    private String contraseña;
    
    public User(String usuario, String contraseña){
        setUsuario(usuario);
        setContraseña(contraseña);
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }
    
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}
