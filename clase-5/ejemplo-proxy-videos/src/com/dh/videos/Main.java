package com.dh.videos;

import com.dh.videos.service.IProveedorDeVideo;
import com.dh.videos.service.impl.ProveedorVideoYoutube;
import com.dh.videos.service.impl.ProxyCacheVideo;

public class Main {

    public static void main(String[] args) {
        //Usamos la clase Proxy para acceder al Proveedor de video
        IProveedorDeVideo proveedorDeVideo = new ProxyCacheVideo(new ProveedorVideoYoutube());

        System.out.println(proveedorDeVideo.popularVideos());
        proveedorDeVideo.getVideo("1");
    }
}
