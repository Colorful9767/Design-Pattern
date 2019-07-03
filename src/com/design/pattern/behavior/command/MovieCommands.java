package com.design.pattern.behavior.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by perl on 2019/7/3.
 * 电影指令容器类
 */
public class MovieCommands {

    private List<Command> MOVIE_COMMANDS = new ArrayList<>();

    public void addCommand(Command command){
        MOVIE_COMMANDS.add(command);
    }

    public void executionCommands() {
        MOVIE_COMMANDS.stream().forEach(command -> command.execute());
    }
}
