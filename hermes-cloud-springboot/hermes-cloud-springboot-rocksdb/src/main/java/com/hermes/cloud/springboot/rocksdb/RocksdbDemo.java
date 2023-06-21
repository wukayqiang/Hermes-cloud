package com.hermes.cloud.springboot.rocksdb;

import org.rocksdb.RocksDB;
import org.rocksdb.RocksDBException;

import java.util.List;
public class RocksdbDemo {
    public static void main(String[] args) throws RocksDBException {
        RocksdbFactory rocksdbFactory = new RocksdbFactory();
        RocksDB rocksDB = rocksdbFactory.getRocksdb();
        RocksdbRepository rocksdbRepository = new RocksdbRepository(rocksDB);
        Object result = rocksdbRepository.get("wukaiqiang");
        System.out.println(result);
    }
}
