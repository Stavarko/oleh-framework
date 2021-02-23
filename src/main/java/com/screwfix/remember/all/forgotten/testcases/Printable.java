package com.screwfix.remember.all.forgotten.testcases;

public interface Printable {
    default void print() {
        System.out.println("default print");
    }
}
