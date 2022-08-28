package com.example.androidtoolsshop;

import androidx.annotation.NonNull;

public class Drill {
    private String title;
    private String description;
    private int imageId;

    public Drill(String title, String description, int imageId) {
        this.title = title;
        this.description = description;
        this.imageId = imageId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getImageId() {
        return imageId;
    }

    @NonNull
    @Override
    public String toString() {
        return title;
    }
}
