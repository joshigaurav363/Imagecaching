package com.imageCaching.modal;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ImageFileProcessor<K, V> {


    Image image;


    CacheStrategy<Integer, String> cacheStrategy;
    FilenameFilter fileFilter;
    List<String> imageList;

    Map<String, String> map;


    //Path p = Paths.get("C:/Users/This PC/Desktop/Pune_Mumbai");
    File file;


    public void setCacheStrategy(CacheStrategy<Integer, String> cacheStrategy) {
        this.cacheStrategy = cacheStrategy;
    }





    public long mapImages(File file) throws Exception{
        List<Integer> hashcodes;
        String fileName = file.getName();
        //int length = names.length();
        long hashCode =0;
        try {
            //long modified = file.lastModified();
            //long modified_int = Integer.parseInt(String.valueOf(modified));
            hashCode = fileName.length() *17;
//            K key = hashCode;
//            V value = fileName;
            Map<Integer, String> mapcache = new HashMap<>();
            cacheStrategy = new CacheStrategy<>();
            cacheStrategy.setCache(mapcache);
            cacheStrategy.addToCache((int)hashCode,fileName);
        }
        catch(NumberFormatException e){
            System.out.print(e);
            }
        return hashCode;

    }

    public List<String> getImageList() throws Exception{
        List<Long> hashList = new ArrayList<>();
        image = new Image();
        image.setPath(image.dir);
        fileFilter = image.Image_Filter;
        imageList = new ArrayList<>();
        if(image.getPath().isDirectory()) {
            for (File f : image.getPath().listFiles(fileFilter)) {
                BufferedImage bufferImage = null;
                try {
                    bufferImage = ImageIO.read(f);
                    long hash = mapImages(f);
                    imageList.add(f.getName());
//                    hashList.add(hash);

                } catch (IOException e) {
                    System.out.println(e);
                }
                catch(NumberFormatException e){
                    System.out.print(e);
                }

            }
        }
        System.out.print("size of imglist"+imageList.size());
        //populateHash(hashList);
           return imageList;
        }

}
