package com.dh.documentos.service.impl;

import com.dh.documentos.model.Documento;
import com.dh.documentos.service.IDocumentoService;

import java.util.*;

public class ProxyDocumentoService implements IDocumentoService {

    private IDocumentoService documentoService;

    // A modo de ejemplo, utilizaremos una lista  para guardar los accesos
    private List<Map<String,String>> registroDeUsuarios;

    public ProxyDocumentoService(IDocumentoService documentoService) {
        this.documentoService = documentoService;
        this.registroDeUsuarios = new ArrayList<>();
    }

    @Override
    public Documento buscarDocumento(String url, String email) {

        Documento documento = documentoService.buscarDocumento(url, email);

        if (documento != null) {
            System.out.println("Usuario : " + email + " accediendo al documento con url " + url);
            registroDeUsuarios.add(registroDeUsuariosMap(url,email));
            System.out.println("Registro: "+ registroDeUsuarios.toString());
        } else {
            System.out.println("El documento no existe o no tenes acceso.");
        }

        return documento;
    }

    private Map<String, String> registroDeUsuariosMap(String key, String value) {
        return Collections.singletonMap(key, value);
    }
}
