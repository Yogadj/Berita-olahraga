package com.yogadj.berita;

/**
 * Created by Asus on 12/8/2017.
 */

public class pojo {

    private int image;
    private String title;
    private String description;
    private String isi;

    public pojo(int image, String title, String description, String isi) {

        this.image = image;
        this.title = title;
        this.description = description;
        this.isi = isi;
    }

    public int getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getIsi() {
        return isi;
    }

}