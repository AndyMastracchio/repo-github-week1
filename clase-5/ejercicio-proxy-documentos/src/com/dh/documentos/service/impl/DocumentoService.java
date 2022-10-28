package com.dh.documentos.service.impl;

import com.dh.documentos.model.Documento;
import com.dh.documentos.service.IDocumentoService;

import java.util.List;

public class DocumentoService implements IDocumentoService {
    // A modo de ejemplo, utilizaremos una lista de documentos para guardar y buscar los documentos.
    private List<Documento> documentos;

    public DocumentoService(List<Documento> documentos) {
        this.documentos = documentos;
    }

    //Buscamos un documento que tenga la misma url, y que el email esté en la lista de autorizados para leerlo.
    @Override
    public Documento buscarDocumento(String url, String email) {

        for (Documento doc : documentos) {
            if (doc.getUrl().equalsIgnoreCase(url)
                    && doc.getUsuariosAutorizados().contains(email)) {
                return doc;
            }
        }
        return null;

        /* La siguiente forma de hacer la iteración y validación es con una librería de Java que se llama StreamAPI
        * Les dejo por si les interesa investigar un poco más. Esto es Programación Funcional, otro paradigma.
        * Pueden comentar el for/if de arriba y descomentar el código de abajo para ver cómo funciona.
        * Básicamente, establecemos un flujo de datos ('documentos') a recorrer con stream()
        * Y luego utilizamos una funcion de esa libreria que 'filtra' según la validación que le pasamos.
        * Finalmente devuelve el primero que encuentra (findFirst) y si no encuentra nada (orElse), devuelve null.
        */
        //return this.documentos.stream()
        //                      .filter(doc -> doc.getUrl().equals(url)
        //                      && doc.getUsuariosAutorizados().contains(email))
        //                      .findFirst().orElse(null);

    }
}
