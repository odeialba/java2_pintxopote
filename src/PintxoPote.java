public class PintxoPote {
	private Pintxo pintxo;
	private Pote pote;
	private double precio;

	//metodo getter/setter
	public void setPintxo(Pintxo pin)
	{
		pintxo=pin;
	}
	public Pintxo getPintxo()
	{
		return pintxo;
	}
	public void setPote(Pote pot)
	{
		pote=pot;
	}
	public Pote getPote()
	{
		return pote;
	}
	public void setPrecio(Double prec)
	{
		precio=prec;
	}
	public Double getPrecio()
	{
		return precio;
	}
} 