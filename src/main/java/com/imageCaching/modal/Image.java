package com.imageCaching.modal;
import java.io.FilenameFilter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;


public class Image {

    String name;
    File path;

    static public final File dir = new File("C:/Users/This PC/Desktop/Pune_Mumbai");

    static public final String[] Extensions = new String[]{"gif", "png", "jpg"};
    static public final FilenameFilter Image_Filter = new FilenameFilter() {
        @Override
        public boolean accept(File dir, String name) {
            for(final String ext : Extensions){
                if(name.endsWith("."+ext)){
                    return true;
                }
            }
            return false;
        }
    };





    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setPath(File paths){
         //paths = Paths.get("C:/Users/This PC/Desktop/Pune_Mumbai");
         this.path = paths;
    }

    public File getPath(){
        return path;
    }
}
