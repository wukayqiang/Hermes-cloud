package com.hermes.cloud.utils.oop;

import com.alibaba.fastjson.JSONObject;
public class SerializationTest {

    public static void main(String[] args) {
        Obj obj = new Obj();
        System.out.println(JSONObject.toJSONString(obj));
    }
}

