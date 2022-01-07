package com.oct.camera2;

public interface CameraDataCallback {
    void onVideoData(byte[] data, int size, long pts);
}
