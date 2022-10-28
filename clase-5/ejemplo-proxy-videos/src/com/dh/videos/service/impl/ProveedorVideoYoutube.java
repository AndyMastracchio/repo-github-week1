package com.dh.videos.service.impl;


import com.dh.videos.dto.Video;
import com.dh.videos.service.IProveedorDeVideo;

import java.util.HashMap;
import java.util.Map;

public class ProveedorVideoYoutube implements IProveedorDeVideo {
    @Override
    public Map<String, Video> popularVideos() {
        return getRandomVideos();
    }

    @Override
    public Video getVideo(String videoId) {
        return new Video(videoId, "video_ejemplo.mp4");
    }
    
    private HashMap<String, Video> getRandomVideos() {
        System.out.print("Descargando... ");

        HashMap<String, Video> hmap = new HashMap<String, Video>();
        hmap.put("1", new Video("sadgahasgdas", "Catzzzz.avi"));
        hmap.put("2", new Video("mkafksangasj", "mascotas.mp4"));
        hmap.put("3", new Video("asdfas3ffasd", "baile_video.mp4"));
        hmap.put("4", new Video("dlsdk5jfslaf", "Barcelona_vs_RealM.mov"));
        hmap.put("5", new Video("3sdfgsd1j333", "Programing_lesson#1.avi"));

        System.out.print("Completo!" + "\n");
        return hmap;
    }
}
