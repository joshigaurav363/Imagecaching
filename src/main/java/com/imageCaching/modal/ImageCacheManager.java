package com.imageCaching.modal;

import org.springframework.context.annotation.Bean;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ImageCacheManager {

    CacheStrategy cacheStrategy;


    ImageFileProcessor imageFileProcessor;


    Map<Integer, List<Image>> map = new HashMap();


    public void populateHash(List<Integer> list) {

        for(int i=list.get(0);i<list.size()-1;i++) {
           Image image = (Image) cacheStrategy.getFromCache(i); 
           System.out.println(image);
        }
    }


    }


//    for(int i=0;i<();i++)
//    {
//        int cachesize = cacheStrategy.getCachesize();
//        if (map.get(i) == i ){
//
//        }
//
//    }



