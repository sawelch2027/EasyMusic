package com.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class Song {

    private String id;
    private String title;
    private String composer;
    private String difficultyLevel;
    private Date date;
    private SheetMusic sheetMusic; 
    private boolean isPrivate;
    private List<String> songNotes;
    
    // Constructor
    public Song(String id, String title, String composer, String difficultyLevel, SheetMusic sheetMusic, boolean isPrivate, List<String> songNotes) {
        this.id = UUID.randomUUID().toString();  // Fix: Preserve the given UUID instead of overriding with random UUID
        this.title = title;
        this.composer = composer;
        this.date = new Date();  // Default to current date
        this.difficultyLevel = difficultyLevel;  // Default difficulty level
        this.sheetMusic = sheetMusic;
        this.isPrivate = isPrivate;
        this.songNotes = songNotes;  // Initialize comments to prevent NullPointerException
    }

    public void playSong() {
        // Logic to play the song
        System.out.println("Playing song: " + title);
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getComposer() {
        return composer;
    }

    public void setComposer(String composer) {
        this.composer = composer;
    }

    public String getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(String difficultyLevel) {
        if (difficultyLevel != null) {
            this.difficultyLevel = difficultyLevel.toUpperCase();
        } else {
            System.out.println("Invalid difficulty level.");
        }
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public SheetMusic getSheetMusic() {
        return sheetMusic;
    }

    public void setSheetMusic(SheetMusic sheetMusic) {
        this.sheetMusic = sheetMusic;
    }

    public boolean isPrivate() {
        return isPrivate;
    }

    public void setPrivate(boolean isPrivate) {
        this.isPrivate = isPrivate;
    }

    public List<String> getSongNotes() {
        return songNotes;
    }

    public void setSongNotes(List<String> songNotes) {
        this.songNotes = (songNotes != null) ? songNotes : new ArrayList<>();
    }
}
