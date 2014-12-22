public class Pote {
	private int id;
	private String nombre;
	private int tipo; //1: Basico 2: Selecto

	//1: Agua, zurito, vino del año
	//2: Caña, refrescos, vino crianza
	public void setId (int ide){
		id = ide;
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
	public void setTipo (int tip){
		tipo = tip;
	}
	public int getTipo(){
		return tipo;
	}
}
