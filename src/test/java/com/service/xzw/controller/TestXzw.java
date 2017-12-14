package com.service.xzw.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestXzw {

        XzwDelegate xzwDelegate = new XzwDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = xzwDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}