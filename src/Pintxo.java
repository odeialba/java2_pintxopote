import java.util.*;

public class Pintxo {
	private int id;
	private String nombre;
	private String[] ingredientes;
	private int tipo; // 1: Basico 2:Selecto

	//1: Tortilla patata, ...
	//2: Foie,...
	//metodos getter/setter
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
	public void setIngredientes (String[] ingre){
		ingredientes = ingre;
	}
	public String[] getIngredientes (){
		return ingredientes;
	}
	public void setTipo (int tip){
		tipo = tip;
	}
	public int getTipo(){
		return tipo;
	}
}