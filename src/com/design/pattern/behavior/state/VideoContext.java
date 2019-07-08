package com.design.pattern.behavior.state;

/**
 * Created by perl on 2019/7/8.
 * 视频上下文类
 */
public class VideoContext {
    private VideoState videoState;
    public final static PlayState PLAY_STATE = new PlayState();
    public final static SpeedState SPEED_STATE = new SpeedState();
    public final static PauseState PAUSE_STATE = new PauseState();
    public final static StopState STOP_STATE = new StopState();

    public VideoState getVideoState() {
        return videoState;
    }

    public void setVideoState(VideoState videoState) {
        this.videoState = videoState;
        this.videoState.setVideoContext(this);
    }

    public void play() {
        this.videoState.play();
    }
    public void speed() {
        this.videoState.speed();
    }
    public void pause() {
        this.videoState.pause();
    }
    public void stop() {
        this.videoState.stop();
    }
}
