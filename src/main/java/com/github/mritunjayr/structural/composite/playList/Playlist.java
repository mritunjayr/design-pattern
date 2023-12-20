package com.github.mritunjayr.structural.composite.playList;

import java.util.ArrayList;

public class Playlist implements IComponent{
    public String playlistName;
    ArrayList<IComponent> playlist;

    public Playlist(String name) {
        playlistName = name;
        playlist = new ArrayList<>();
    }


    @Override
    public void play() {
        System.out.println("Playing playlist :"+playlistName);
        for (IComponent component: playlist){
            component.play();
        }
    }

    @Override
    public void setPlaybackSpeed(float speed) {
        for (IComponent component: playlist){
            component.setPlaybackSpeed(speed);
        }
    }

    @Override
    public String getName() {
        return playlistName;
    }
    public void add(IComponent component){
        playlist.add(component);
    }
    public void  remove(IComponent component){
        playlist.remove(component);
    }
}
