package com.mycompany.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Runner {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        InnerObject innerObject = new InnerObject();
        innerObject.setParameter1("Hello");
        innerObject.setParameter2("world");
        SomeData someData = new SomeData();
        someData.setParam1(100);
        someData.setParam2(true);
        someData.setParam3("StringParam");
        someData.setArray(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        someData.setInnerObject(innerObject);
        String result = null;
        SomeData someData1 = null;
        try {
             result = objectMapper.writeValueAsString(someData);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        System.out.println(result);
        try {
             someData1 = objectMapper.readValue(result, SomeData.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        System.out.println(someData1);
    }
}
