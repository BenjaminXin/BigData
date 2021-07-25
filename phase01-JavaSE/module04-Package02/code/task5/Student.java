package com.lagou.phase01.module04.code.task5;

import java.io.Serializable;

@MyAnnotation
public class Student<T, E> extends Person implements Comparable<String>, Serializable {

    @Override
    public int compareTo(String o) {
        return 0;
    }
}
