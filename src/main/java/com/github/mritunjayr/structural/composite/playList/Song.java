package com.github.mritunjayr.structural.composite.playList;

public class Song implements IComponent{
    public  String songName;
    public String artist;

    public float speed;

    public Song(String name, String artist) {
        songName = name;
        this.artist = artist;
        speed = 1.0f;
    }

    @Override
    public void play() {
        System.out.println("Playing "+ songName);
    }

    @Override
    public void setPlaybackSpeed(float speed) {
        this.speed = speed;
    }

    @Override
    public String getName() {
        return songName;
    }

    public String getArtist(){
        return artist;
    }
}
