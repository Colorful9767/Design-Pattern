package com.design.pattern.behavior.command;

/**
 * Created by perl on 2019/7/3.
 * 播放命令类
 */
public class PlayMovieCommand implements Command {
    private Movie movie;

    public PlayMovieCommand(Movie movie) {
        this.movie = movie;
    }

    @Override
    public void execute() {
        this.movie.play();
    }
}
