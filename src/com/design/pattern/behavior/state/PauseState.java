package com.design.pattern.behavior.state;

/**
 * Created by perl on 2019/7/8.
 * 暂停状态类
 */
public class PauseState extends VideoState {
    @Override
    public void play() {
        super.videoContext.setVideoState(VideoContext.PLAY_STATE);
    }

    @Override
    public void speed() {
        super.videoContext.setVideoState(VideoContext.SPEED_STATE);
    }

    @Override
    public void pause() {
        System.out.println("暂停状态");
    }

    @Override
    public void stop() {
        super.videoContext.setVideoState(VideoContext.STOP_STATE);
    }
}
