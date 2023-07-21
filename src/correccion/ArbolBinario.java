package correccion;

public class ArbolBinario {

	   private Nodo raiz;

	    public ArbolBinario() {
	        raiz = null;
	    }

	    public void insertar(Object dato) {
	        raiz = insertarRecursivo(raiz, dato);
	    }

	    private Nodo insertarRecursivo(Nodo actual, Object dato) {
	        if (actual == null) {
	            return new Nodo(dato);
	        } else {
	            Comparable<Object> datoActual = (Comparable<Object>) actual.valorNodo();
	            Comparable<Object> datoNuevo = (Comparable<Object>) dato;

	            if (datoNuevo.compareTo(datoActual) < 0) {
	                actual.ramaIzdo(insertarRecursivo(actual.subarbolIzdo(), dato));
	            } else if (datoNuevo.compareTo(datoActual) > 0) {
	                actual.ramaDcho(insertarRecursivo(actual.subarbolDcho(), dato));
	            }
	            return actual;
	        }
	    }

    // Métodos de recorrido
    public void preorden() {
        preordenRecursivo(raiz);
    }

    private void preordenRecursivo(Nodo nodo) {
        if (nodo != null) {
            nodo.visitar();
            preordenRecursivo(nodo.subarbolIzdo());
            preordenRecursivo(nodo.subarbolDcho());
        }
    }

    public void inorden() {
        inordenRecursivo(raiz);
    }

    private void inordenRecursivo(Nodo nodo) {
        if (nodo != null) {
            inordenRecursivo(nodo.subarbolIzdo());
            nodo.visitar();
            inordenRecursivo(nodo.subarbolDcho());
        }
    }

    public void postOrden() {
        postOrdenRecursivo(raiz);
    }

    private void postOrdenRecursivo(Nodo nodo) {
        if (nodo != null) {
            postOrdenRecursivo(nodo.subarbolIzdo());
            postOrdenRecursivo(nodo.subarbolDcho());
            nodo.visitar();
        }
    }

    // Métodos adicionales
    public int numNodos() {
        return numNodosRecursivo(raiz);
    }

    private int numNodosRecursivo(Nodo nodo) {
        if (nodo == null) {
            return 0;
        } else {
            return 1 + numNodosRecursivo(nodo.subarbolIzdo()) + numNodosRecursivo(nodo.subarbolDcho());
        }
    }

    public int sumaValorNodo() {
        return sumaValorNodoRecursivo(raiz);
    }

    private int sumaValorNodoRecursivo(Nodo nodo) {
        if (nodo == null) {
            return 0;
        } else {
            return (int) nodo.valorNodo() + sumaValorNodoRecursivo(nodo.subarbolIzdo()) + sumaValorNodoRecursivo(nodo.subarbolDcho());
        }
    }
}
