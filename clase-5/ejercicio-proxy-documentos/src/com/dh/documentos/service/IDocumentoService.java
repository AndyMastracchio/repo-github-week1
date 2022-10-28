package com.dh.documentos.service;

import com.dh.documentos.model.Documento;

public interface IDocumentoService {
    Documento buscarDocumento(String url,String email);
}
