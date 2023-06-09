package com.hermes.cloud.springboot.sample;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.hash.BloomFilter;
import com.google.common.hash.Funnels;

import java.util.concurrent.ExecutionException;

public class cache {
    public static void main(String[] args) throws ExecutionException {
        LoadingCache<String, String> cache = CacheBuilder.newBuilder()
                .maximumSize(1000)
                .build(new CacheLoader<String, String>() {
                    @Override
                    public String load(String s) throws Exception {
                        return "";
                    }
                });
        BloomFilter<Integer> bloomFilter = BloomFilter.create(Funnels.integerFunnel(), 100);
        for (int i = 0; i < 100; i++) {
            bloomFilter.put(i);
        }
        System.out.println(bloomFilter.mightContain(10));
        System.out.println(bloomFilter.mightContain(111));
    }

}
