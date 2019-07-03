package com.design.pattern.behavior.command;

/**
 * Created by perl on 2019/7/3.
 * 测试类
 */
public class Test {

    public static void main(String[] args) {
        Movie movie = new Movie("复仇者联盟4");
        MovieCommands movieCommands = new MovieCommands();
        movieCommands.addCommand(new PlayMovieCommand(movie));
        movieCommands.addCommand(new PauseMovieCommand(movie));

        movieCommands.executionCommands();
    }
}
