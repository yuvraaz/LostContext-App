package com.lostincontext.data.rules;


import com.lostincontext.data.Playlist;

public class Rule {

    private String name;
    private FenceVM fenceVM;
    private Playlist playlist;

    public Rule() {
    }

    public Rule(String name, FenceVM fenceVM, Playlist playlist) {
        this.name = name;
        this.fenceVM = fenceVM;
        this.playlist = playlist;
    }


    public String getName() {
        return name;
    }

    public FenceVM getFenceVM() {
        return fenceVM;
    }

    public Playlist getPlaylist() {
        return playlist;
    }

}