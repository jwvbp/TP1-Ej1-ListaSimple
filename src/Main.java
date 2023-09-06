import ar.edu.unlu.listaSimple.ListaEnlazada;
import ar.edu.unlu.listaSimple.Nodo;

public class Main {

	public static void main(String[] args) {

		ListaEnlazada lista = new ListaEnlazada();
		System.out.println(lista.tieneDatos());
		System.out.println(lista.longitud() + " elementos");
		lista.agregar("Hola");
		lista.agregar("nuevo");
		lista.agregar("gran");
		lista.agregar("y");
		lista.agregar("odioso");
		lista.agregar("mundo");
		System.out.println(lista.longitud() + " elementos");
		System.out.println(lista.tieneDatos());
		System.out.println(lista);
		lista.eliminarElemento(5);
		System.out.println(lista);
		System.out.println(lista.longitud() + " elementos");
		System.out.println("dato --> " + lista.recuperarElemento(5));
		System.out.println(lista);
		lista.insertarEnPosicion("Eureka", 3);
		System.out.println(lista);
		
	}

}