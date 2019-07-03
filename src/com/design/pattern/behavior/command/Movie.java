package com.design.pattern.behavior.command;

/**
 * Created by perl on 2019/7/3.
 * 电影类
 */
public class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                '}';
    }

    public void play() {
        System.out.println(this.getName()+":   播放");
    }

    public void pause() {
        System.out.println(this.getName()+":   暂停");
    }
}
