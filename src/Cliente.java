public class Cliente {

	private int id;
	private String nombre; //Guardar Nombre Apellidos
	private Cartilla cartilla;

	public void setId (int id){
		id = id;
	}
	public int getId(){
		return id;
	}
	public void setNombre (String nom){
		nombre = nom;
	}
	public String getNombre(){
		return nombre;
	}
	public void setCartilla (Cartilla cart){
		cartilla = cart;
	}
	public Cartilla getCartilla(){
		return cartilla;
	}

}