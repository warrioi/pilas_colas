package pc;

import LSE.ListaSimplementeEnlazada;

public class Pila extends ListaSimplementeEnlazada {
    @Override
    public void eliminar() {
        if(!estaVacia()){
            primero = primero.getSiguiente();
        }
    }
}
