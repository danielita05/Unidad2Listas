package Lists;

public class SinglyLinkedList {
    Nodo cabeza;

    public SinglyLinkedList() {
        this.cabeza = null;
    }

    public void insertar(Integer dato){
        //Crear un nodo
        Nodo nuevoNodo = new Nodo(dato);
        //Verificar si la lista esta vacia
        if (cabeza == null) {
            //Coloca el nuevoNodo como la cabeza
            cabeza = nuevoNodo;
        }else{
            Nodo temp=cabeza;//Iniciamos desde el cabeza
            //Recorremos todos los nodos hasta encontrar un null en las referencias
            while (temp.getSiguiente() != null) {

                temp=temp.getSiguiente();
                
            }
            temp.setSiguiente(nuevoNodo); 
        }
    }

    public void mostrar(){
        Nodo temp = cabeza;
        while (temp != null) {
            System.out.println(temp.getDato()+ "->");
            temp =temp.getSiguiente();
        }
        System.out.println("null");
    }

    public boolean buscar(Integer valor){
        if (cabeza == null) {
            System.out.println("La lista esta vacia");
            return false;
        }else{
            Nodo temp=cabeza;//Iniciamos desde el cabeza
            //Recorremos todos los nodos hasta encontrar un null en las referencias
            while (temp != null) {       
        if (temp.getDato() == valor){
            System.out.println("Si se encontro el valor buscado.");
            return true;
            
        }
        temp=temp.getSiguiente();
            }
            System.out.println("No se encontro el valor buscado.");
        }
        return false;

    }

     //metodo para eliminar 
     public void eliminar(Integer valor) {
        if (cabeza==null) {
            System.out.println("No se puede eliminar porque la lista esta vacia ");
        }
        if (cabeza.getDato()==valor) {
            cabeza=cabeza.getSiguiente();
        }
        Nodo temp=cabeza;
        Nodo anterior=null;
        while (temp!=null && temp.getDato()!=valor) { //recorrer hasta encontrar el nodo con el valor 
            anterior=temp;
            temp=temp.getSiguiente();
        }
        if (temp==null) {
            System.out.println("No se encontro el valor ");
            return;
        }
        anterior.setSiguiente(temp);
        System.out.println("Se elimino correctamente "+valor);
    }





}
