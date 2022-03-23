package com.my.domain;

public class AopTestImpl implements AopTest {
    @Override
    public int getADD(int x, int y) {
        return x+y;
    }
}
