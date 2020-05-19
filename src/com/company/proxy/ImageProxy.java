package com.company.proxy;

public class ImageProxy implements Image{
    private String imagePath;
    private Image image;

    public ImageProxy(String imagePath) {
        this.imagePath = imagePath;
    }

    @Override
    public void showImage() {
        image = new ImageLoader(imagePath);
        image.showImage();
    }
}
