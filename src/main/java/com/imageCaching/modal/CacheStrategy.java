package com.imageCaching.modal;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CacheStrategy<K,V>
{
        private K key;
        private V value;

        private Map<K,V> cache;
        private final int cachesize = 10;
        private List<Image> listOfImages;

        public K getKey(){
            return key;
        }

//        public CacheStrategy(K key, V value){
//            this.key = key;
//            this.value = value;
//        }


        public void addToCache(K key, V value){
            cache.put(key, value);
        }

        public void setCache(Map<K,V> cache){
            this.cache = cache;
        }

        public Map<K,V> getCache(){
            if(cache == null) {cache = new HashMap();}
            return cache;
        }
        public V getFromCache(K Key){
            return cache.get(Key);
        }

        public void removeFromCache(K key){
            cache.remove(key);
        }

        public void clearCache(){
            cache.clear();
        }

        public void setKey(K key){
            this.key = key;
        }

        public V getValue(){
            return value;
        }

        public void setValue(V value){
            this.value = value;
        }

        public void setListOfImages(List listofImages){
            this.listOfImages = listofImages;
        }

        public List getListOfImages(){
            return listOfImages;
        }

        public int getCachesize(){
            return cachesize;
        }

}
