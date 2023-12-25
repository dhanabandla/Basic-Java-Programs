package com.company;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;

public class GenpacTest {

    public static void main(String[] args) {
        int n1=0,n2=1,n3;
        System.out.print(n1+ " " +n2);
        for(int i=2;i<=12;i++)
        {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
    }

}








