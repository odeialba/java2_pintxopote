import java.util.*;

public class Bar {
	private int Id;
	private String Nombre;
	private String Direccion;
	private ArrayList<Pintxo> pintxos;
	private ArrayList<Pote> potes;

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
	public void setDireccion (String dir){
		direccion = dir;
	}
	public String getDireccion(){
		return direccion;
	}
	public void setPintxos (ArrayList<Pintxo> pin){
		pintxos = pin;
	}
	public ArrayList<Pintxo> getPintxos(){
		return pintxos;
	}
	public void setPotes (ArrayList<Pote> pot){
		potes = pot;
	}
	public ArrayList<Pote> getPotes(){
		return potes;
	}

}