package com.dh.videos.service.impl;


import com.dh.videos.dto.Video;
import com.dh.videos.service.IProveedorDeVideo;

import java.util.HashMap;
import java.util.Map;

public class ProxyCacheVideo implements IProveedorDeVideo {
    private IProveedorDeVideo proveedorDeVideo;
    private Map<String, Video> cachePopular;
    private Map<String, Video> cacheAll;

    public ProxyCacheVideo(IProveedorDeVideo proveedorDeVideo) {
        this.proveedorDeVideo = proveedorDeVideo;
        this.cachePopular = new HashMap();
        this.cacheAll = new HashMap();
    }
    //Si tenemos videos en el cache, devolvemos eso, si no, le pedimos al proveedor y lo agregamos al cache.
    @Override
    public Map<String, Video> popularVideos() {
        if(this.cacheAll.isEmpty())
            cachePopular = proveedorDeVideo.popularVideos();

        return cachePopular;
    }

    //Misma logica,si tenemos videos en el cache, devolvemos eso, si no, le pedimos al proveedor y lo agregamos al cache.

    @Override
    public Video getVideo(String videoId) {
        Video video = cacheAll.get(videoId);
        if(video == null)
            video = proveedorDeVideo.getVideo(videoId);
            cacheAll.put(videoId,video);
        return video;
    }
}
