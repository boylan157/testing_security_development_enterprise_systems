package org.tsdes.jee.ejb.multithreading.jse;

import org.tsdes.jee.ejb.multithreading.Counter;
import org.tsdes.jee.ejb.multithreading.CounterTestBase;

public class Example06Test extends CounterTestBase {

    @Override
    protected Counter getCounter() {
        return new Example06();
    }
}