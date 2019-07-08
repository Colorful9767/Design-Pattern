package com.design.pattern.behavior.state;

/**
 * Created by perl on 2019/7/8.
 * 停止状态类
 */
public class StopState extends VideoState {
    @Override
    public void play() {
        super.videoContext.setVideoState(VideoContext.PLAY_STATE);
    }

    @Override
    public void speed() {
        System.out.println("停止状态无法快进");
    }

    @Override
    public void pause() {
        System.out.println("停止状态无法暂停");
    }

    @Override
    public void stop() {
        System.out.println("停止状态");
    }
}
