package com.hermes.cloud.springboot.rocksdb;

import org.rocksdb.Options;
import org.rocksdb.RocksDB;

public class RocksdbFactory {
    public RocksDB getRocksdb() {
        try {
            RocksDB.loadLibrary();
            Options options = new Options();
            options.setCreateIfMissing(true);
            return RocksDB.open(options, "/Users/hujinhui/hermes-cloud/hermes-cloud-springboot/hermes-cloud-springboot-rocksdb/rocksdb");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
