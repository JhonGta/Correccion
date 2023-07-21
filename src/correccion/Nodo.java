package correccion;

public class Nodo {

	protected Object dato;
	protected Nodo izdo;
	protected Nodo dcho;

	public Nodo(Object valor) {
		dato = valor;
		izdo = dcho = null;

	}

	public Nodo(Nodo ramaizdo, Object valor, Nodo ramaDcho) {
		dato = valor;
		izdo = ramaizdo;
		dcho = ramaDcho;

	}

//operaciones de acceso public Object valorNodo(){
	public Object valorNodo() {
		return dato;
	}

	public Nodo subarbolIzdo() {
		return izdo;

	}

	public Nodo subarbolDcho() {
		return dcho;

	}

	public void nuevoValor(Object d) {
		dato = d;
	}

	public void ramaIzdo(Nodo n) {
		izdo = n;

	}

	public void ramaDcho(Nodo n) {

		dcho = n;

	}

//--método adicional para implementar el recorrido de un arbol bin public void visitar(){ System.out.print(dato + " ");
	public void visitar() {
		System.out.println(dato + " ");

	}
}

