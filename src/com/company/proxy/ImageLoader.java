package com.company.proxy;

public class ImageLoader implements Image {

    private String imagePath;

    public ImageLoader(String imagePath) {
        this.imagePath = imagePath;
    }

    @Override
    public void showImage() {
          System.out.println(imagePath);
    }
}
