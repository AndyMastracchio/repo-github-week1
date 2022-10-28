package com.dh.videos.dto;

public class Video {
    private String id;
    private String titulo;
    private String datos;

    public Video(String id, String titulo) {
        this.id = id;
        this.titulo = titulo;
        this.datos = "Random video.";
    }

    @Override
    public String toString() {
        return "Video{" +
                "id='" + id + '\'' +
                ", titulo='" + titulo + '\'' +
                ", datos='" + datos + '\'' +
                '}';
    }
}
