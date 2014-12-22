import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int accion;
		do {
			System.out.println("\n¿Qué acción deseas realizar?");
			System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
			System.out.println("1) Ver los PINTXOS disponibles.");
			System.out.println("2) Ver los POTES disponibles.");
			System.out.println("3) Ver los BARES disponibles.");
			System.out.println("0) Salir");
			accion = sc.nextInt();
			
			switch (accion) {
				case 1: { //1) Ver los PINTXOS disponibles.
					try {
						File txt = new File("./Pintxos.txt");
						FileReader fr = new FileReader(txt);
						BufferedReader br = new BufferedReader(fr);
						String linea = br.readLine();
						
						ArrayList<Pintxo> apintxo = new ArrayList<Pintxo>();
						String [] parpin1;
						String [] parpin2;
						while (linea != null) {
							parpin1 = linea.split(";");
							Pintxo pintxo = new Pintxo();
							pintxo.setId(Integer.parseInt(parpin1[0]));
							pintxo.setNombre(parpin1[1]);
							parpin2 = parpin1[2].split(",");
							pintxo.setIngredientes(parpin2);
							pintxo.setTipo(Integer.parseInt(parpin1[3]));
							apintxo.add(pintxo);
							linea = br.readLine();
						} 
						
						for (int i = 0; i < apintxo.size(); i++) {
							System.out.println("\n---PINTXO " + (i+1) + "---");
							System.out.println("ID: " + apintxo.get(i).getId());
							System.out.println("Nombre: " + apintxo.get(i).getNombre());
							System.out.println("Ingredientes: ");
							for (int ing = 0; ing < apintxo.get(i).getIngredientes().length; ing++){
								System.out.println("  " + (ing+1) + "- " + apintxo.get(i).getIngredientes()[ing]);
							}
							if (apintxo.get(i).getTipo() == 1){
								System.out.println("Tipo: Básico");
							} else if (apintxo.get(i).getTipo() == 2) {
								System.out.println("Tipo: Selecto");
							}
						}
					} catch(IOException ioe) {
						System.out.println("Error: " + ioe);
					}
					break;
				}
				case 2: { //2) Ver los POTES disponibles.
					try {
						File txt = new File("./Potes.txt");
						FileReader fr = new FileReader(txt);
						BufferedReader br = new BufferedReader(fr);
						String linea = br.readLine();
						
						ArrayList<Pote> apote = new ArrayList<Pote>();
						String [] parpot;
						while (linea != null) {
							parpot = linea.split(";");
							Pote pote = new Pote();
							pote.setId(Integer.parseInt(parpot[0]));
							pote.setNombre(parpot[1]);
							pote.setTipo(Integer.parseInt(parpot[2]));
							apote.add(pote);
							linea = br.readLine();
						} 
						
						for (int i = 0; i < apote.size(); i++) {
							System.out.println("\n---POTE " + (i+1) + "---");
							System.out.println("ID: " + apote.get(i).getId());
							System.out.println("Nombre: " + apote.get(i).getNombre());
							if (apote.get(i).getTipo() == 1){
								System.out.println("Tipo: Básico");
							} else if (apote.get(i).getTipo() == 2) {
								System.out.println("Tipo: Selecto");
							}
						}
					} catch(IOException ioe) {
						System.out.println("Error: " + ioe);
					}
					break;
				}
				case 3: { //3) Ver los BARES disponibles.
					try {
						File txt = new File("./Bares.txt");
						FileReader fr = new FileReader(txt);
						BufferedReader br = new BufferedReader(fr);
						String linea = br.readLine();
						
						ArrayList<Bar> abar = new ArrayList<Bar>();
						String [] parbar;
						while (linea != null) {
							parbar = linea.split(";");
							Bar bar = new Bar();
							bar.setId(Integer.parseInt(parbar[0]));
							bar.setNombre(parbar[1]);
							bar.setDireccion(parbar[2]);
							abar.add(bar);
							linea = br.readLine();
						} 
						
						for (int i = 0; i < abar.size(); i++) {
							System.out.println("\n---BAR " + (i+1) + "---");
							System.out.println("ID: " + abar.get(i).getId());
							System.out.println("Nombre: " + abar.get(i).getNombre());
							System.out.println("Dirección: " + abar.get(i).getDireccion());
						}
					} catch(IOException ioe) {
						System.out.println("Error: " + ioe);
					}
				}
				case 0: { //0) Salir
					break;
				}
				default: { //Si la opción es erronea
					System.out.println("¡El número introducido no es válido!");
				}
			}
		} while(accion != 0);
	}
}