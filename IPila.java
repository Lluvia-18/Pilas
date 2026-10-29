
//Interface Pila Generica
//autor: Lluvia Villanueva
//fecha:29 de octubre de 2026


//pop sirve para salir de la lista, push para entrar a ella, T para aceptar cualquier tipo de dato
public interface IPila<T> {

     public T pop();
     public void push(T dato);
     public T peek();
     public boolean isEmpty();


}



