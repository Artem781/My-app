package com.mycompany.json;

import java.util.Arrays;

public class SomeData {
    private int param1;
    private boolean param2;
    private String param3;
    private int [] array;
    private InnerObject innerObject;

    public InnerObject getInnerObject() {
        return innerObject;
    }

    public void setInnerObject(InnerObject innerObject) {
        this.innerObject = innerObject;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int getParam1() {
        return param1;
    }

    public void setParam1(int param1) {
        this.param1 = param1;
    }

    public boolean isParam2() {
        return param2;
    }

    public void setParam2(boolean param2) {
        this.param2 = param2;
    }

    public String getParam3() {
        return param3;
    }

    public void setParam3(String param3) {
        this.param3 = param3;
    }

    @Override
    public String toString() {
        return "SomeData{" +
                "param1=" + param1 +
                ", param2=" + param2 +
                ", param3='" + param3 + '\'' +
                ", array=" + Arrays.toString(array) +
                ", innerObject=" + innerObject +
                '}';
    }
}
