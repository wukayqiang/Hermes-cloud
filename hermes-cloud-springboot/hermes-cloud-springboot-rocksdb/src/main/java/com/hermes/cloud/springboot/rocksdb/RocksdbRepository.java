package com.hermes.cloud.springboot.rocksdb;

import com.alibaba.fastjson.JSONObject;
import org.rocksdb.RocksDB;
import org.rocksdb.RocksDBException;

import java.util.Arrays;

public class RocksdbRepository {
    private RocksDB rocksDB;

    public RocksdbRepository(RocksDB rocksDB) {
        this.rocksDB = rocksDB;
    }

    public void save(String key, Object value) throws RocksDBException {
        rocksDB.put(key.getBytes(), JSONObject.toJSONString(value).getBytes());
    }

    public Object get(String key) throws RocksDBException {
        byte[] value = rocksDB.get(key.getBytes());
        String result = new String(value);
        return JSONObject.parse(result);
    }
}
