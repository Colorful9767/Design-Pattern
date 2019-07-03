package com.design.pattern.behavior.command;

/**
 * Created by perl on 2019/7/3.
 * 暂停命令类
 */
public class PauseMovieCommand implements Command {
    private Movie movie;

    public PauseMovieCommand(Movie movie) {
        this.movie = movie;
    }

    @Override
    public void execute() {
        this.movie.pause();
    }
}
