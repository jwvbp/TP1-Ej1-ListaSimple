package ar.edu.unlu.listaSimple;

public class ListaEnlazada {
	private Nodo primero = null;

	public void agregar(Object dato) {
		Nodo nuevoNodo = new Nodo();
		nuevoNodo.setDato(dato);
		if (primero == null) {
			primero = nuevoNodo;
		} else {
			Nodo nodoAux = primero;
			while (nodoAux.getProximo() != null) {
				nodoAux = nodoAux.getProximo();
			}
			nodoAux.setProximo(nuevoNodo);
		}

	}

	public String tieneDatos() {
		if (estaVacia()) {
			return "esta vacia";
		} else {
			return "tiene datos";
		}
	}

	public Boolean estaVacia() {
		if (primero == null) {
			return true;
		} else {
			return false;
		}
	}

	public Integer longitud() {
		Integer contador = 0;
		Nodo nodoAux = primero;
		if (primero == null) {
			return contador;
		} else {
			while (nodoAux != null) {
				contador++;
				nodoAux = nodoAux.getProximo();
			}
		}
		return contador;
	}

	public void eliminarElemento(Integer numero) {
		Nodo nodoAux = primero;
		Nodo nodoAux2 = primero;
		if (this.longitud() < numero) {
			System.out.println("fuera de rango");
		} else {
			if (numero == 1) {
				this.eliminarPrimerNodo();
			} else {
				for (Integer i = 1; i <= (numero - 1); i++) {
					nodoAux2 = nodoAux;
					nodoAux = nodoAux.getProximo();
				}
				this.eliminarNodo(nodoAux2);

			}
		}
	}

	public void insertarEnPosicion(Object dato, Integer numero) {
		Nodo nodoAux = primero;
		Nodo nodoAux2 = primero;
		if (this.longitud() < numero) {
			System.out.println("fuera de rango");
		} else {
			if (numero == 1) {
				this.insertarPrimerNodo(dato);
			} else {
				for (Integer i = 1; i <= (numero - 1); i++) {
					nodoAux2 = nodoAux;
					nodoAux = nodoAux.getProximo();
				}

				this.insertarOtroNodo(dato, nodoAux2);

			}
		}
	}

	private void insertarOtroNodo(Object dato, Nodo nodo) {
		Nodo nuevoNodo = new Nodo();
		nuevoNodo.setDato(dato);
		nuevoNodo.setProximo(nodo.getProximo());
		nodo.setProximo(nuevoNodo);
	}

	private void insertarPrimerNodo(Object dato) {
		Nodo nodoAux = primero;
		Nodo nuevoNodo = new Nodo();
		nuevoNodo.setProximo(nodoAux);
		nuevoNodo.setDato(dato);
		primero = nuevoNodo;
	}

	public Object recuperarElemento(Integer numero) {
		Nodo nodoAux = primero;
		Object dato = null;
		if (this.longitud() < numero) {
			System.out.println("fuera de rango");
		} else {
			if (numero == 1) {
				dato = primero.getDato();
			} else {
				for (Integer i = 1; i <= (numero - 1); i++) {
					nodoAux = nodoAux.getProximo();
				}
				dato = nodoAux.getDato();

			}
		}
		return dato;
	}

	private void eliminarNodo(Nodo nodo) {
		Nodo nodoAux = nodo.getProximo();
		nodo.setProximo(nodoAux.getProximo());
	}

	private void eliminarPrimerNodo() {
		primero = primero.getProximo();
	}

	public String toString() {
		String acumulador = "";
		Integer i = 1;
		Nodo nodoAux = primero;
		if (primero == null) {
			acumulador = "Lista Vacia";
		} else {
			while (nodoAux != null) {
				acumulador += "Nodo " + i + " " + nodoAux.getDato() + "\n";
				i++;
				nodoAux = nodoAux.getProximo();
			}
		}
		return acumulador;
	}
}
