package com.design.pattern.behavior.state;

/**
 * Created by perl on 2019/7/8.
 * 抽象视频状态类
 */
public abstract class VideoState {
    protected VideoContext videoContext;

    public void setVideoContext(VideoContext videoContext) {
        this.videoContext = videoContext;
    }

    public abstract void play();
    public abstract void speed();
    public abstract void pause();
    public abstract void stop();
}
