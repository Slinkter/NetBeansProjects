package tienda.bean;

public class Administrador {
    
    private String id_admin;
    private String name;
    private String password;
    
    public Administrador (String id_admin, String name, String password){
            this.id_admin = id_admin;
            this.name = name;
            this.password = password;
    }
    public Administrador (String usuario, String contraseña){
		
		this.name = usuario;
		this.password = contraseña;
	}

    public Administrador() {
    }
        
    
    public String getId_admin() {
            return id_admin;
    }

    public void setId_admin(String id_admin) {
            this.id_admin = id_admin;
    }

    public String getName() {
            return name;
    }

    public void setName(String name) {
            this.name = name;
    }

    public String getPassword() {
            return password;
    }

    public void setPassword(String password) {
            this.password = password;
    }
    
}
