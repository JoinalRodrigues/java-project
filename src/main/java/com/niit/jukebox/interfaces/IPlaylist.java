package com.niit.jukebox.interfaces;

public interface IPlaylist {

    void playPlayListFromIndex(int index);
    void pausePlaylist();
    void resumePlaylist();
    void stopPlaylist();
    void playFromPreviousContentInPlaylist();
    void playFromNextContentInPlaylist();
    void shuffle();
    void displayCurrentPlaylist(int startingIndex);
}
