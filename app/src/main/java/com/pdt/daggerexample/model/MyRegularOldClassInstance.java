package com.pdt.daggerexample.model;

public class MyRegularOldClassInstance {
    private final int mId;

    public MyRegularOldClassInstance() {
        mId = hashCode();
    }


    @Override
    public String toString() {
        return "MyRegularOldClassInstance{" +
                "mId=" + mId + '}';
    }
}