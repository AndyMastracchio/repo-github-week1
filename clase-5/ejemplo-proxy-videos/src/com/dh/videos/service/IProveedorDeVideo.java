package com.dh.videos.service;


import com.dh.videos.dto.Video;

import java.util.Map;

public interface IProveedorDeVideo {

    Map<String, Video> popularVideos();

    Video getVideo(String videoId);
}
