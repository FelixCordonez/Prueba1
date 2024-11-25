package clases;

import java.util.Stack;

public class EditorTexto {

    private Stack<String> pilaDeshaser;
    private Stack<String> pilaRehacer;
    private String contenido;

    // vamos hacer metodos de deshaser y reacer y eescribir
    //sera un programa de deshaga y reahaga 
    public EditorTexto() {

        pilaDeshaser = new Stack<>();
        pilaRehacer = new Stack<>();
        contenido = "";// le asinamosa algo vacio
    }

    //vamos hacer un metod escribir
    public void escribir(String texto) {

        pilaDeshaser.push(contenido);
        contenido += texto;// Unimos las cademas que vamos a escribir con texto
        pilaRehacer.clear();//Es para limpiar la pila rehacer en la palabra iniciar
        System.out.println("contenido actual: " + contenido);

    }

    public void deshacer(String texto) {

        if (!pilaDeshaser.isEmpty()) {

            pilaRehacer.push(contenido);//guarada el contenido deshacer en el rehacer o el ctrol + Y
            contenido = pilaDeshaser.pop();// elimino en desahacer 
            System.out.println("Deshaser: " + contenido);

        } else {

            System.out.println("No hay accaiones para deshacer");
        }

    }
    public void rehacer() {

        if (!pilaRehacer.isEmpty()) {

            pilaDeshaser.push(contenido);//guarada el contenido deshacer en el rehacer o el ctrol + Y
            contenido = pilaRehacer.pop();// elimino en desahacer 
            System.out.println("Rehacer: " + contenido);

        } else {

            System.out.println("No hay accaiones para rehacer");
        }

    }

}
