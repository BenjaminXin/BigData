package com.lagou.phase01.module04.code.task1;

import java.io.IOException;

public class SubExceptionMethodTest extends ExceptionMethod {

    @Override
    public void show() throws IOException {}                 // 可以抛出和父类相同的异常
    // public void show() throws FileNotFoundException {}       // 可以抛出更小的异常
    // public void show() throws ClassNotLoadedException {}     // 不可以抛出不同类型的异常
    // public void show() throws Exception {}                      // 不可以抛出更大的异常


}
