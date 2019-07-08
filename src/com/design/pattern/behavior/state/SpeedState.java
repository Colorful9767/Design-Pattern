package com.design.pattern.behavior.state;

/**
 * Created by perl on 2019/7/8.
 * 快进状态类
 */
public class SpeedState extends VideoState {
    @Override
    public void play() {
        super.videoContext.setVideoState(VideoContext.PLAY_STATE);
    }

    @Override
    public void speed() {
        System.out.println("快进状态");
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
