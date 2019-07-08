package com.design.pattern.behavior.state;

/**
 * Created by perl on 2019/7/8.
 * 播放状态类
 */
public class PlayState extends VideoState {
    @Override
    public void play() {
        System.out.println("播放状态");
    }

    @Override
    public void speed() {
        super.videoContext.setVideoState(VideoContext.SPEED_STATE);
    }

    @Override
    public void pause() {
        super.videoContext.setVideoState(VideoContext.PAUSE_STATE);
    }

    @Override
    public void stop() {
        super.videoContext.setVideoState(VideoContext.STOP_STATE);
    }
}
