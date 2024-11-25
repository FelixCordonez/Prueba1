

package com.mycompany.pilatres;

import clases.EditorTexto;


public class PILATRES {

    public static void main(String[] args) {
        EditorTexto texto = new EditorTexto();
        texto.escribir("hola");
        texto.escribir("Johana");
        texto.deshacer("");
        texto.rehacer();
    }
}
