package com.example.emillozev.backwardcompatibility.model;

import com.example.emillozev.backwardcompatibility.R;

import java.util.ArrayList;

public class Landscape {

    private int imageId;
    private String title;
    private String description;

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static ArrayList<Landscape> getData(){
        ArrayList<Landscape> data = new ArrayList<>();

        int[] images = getImages();

        for(int i = 0; i < images.length; i++){
            Landscape landscape = new Landscape();
            landscape.setImageId(images[i]);
            landscape.setTitle("Landscape " + i);

            data.add(landscape);
        }

        return data;
    }

    public static int[] getImages(){
        int[] images = {
                R.drawable.bin,
                R.drawable.oceanview,
                R.drawable.refresh,
                R.drawable.dice};

        return images;
    }

}
