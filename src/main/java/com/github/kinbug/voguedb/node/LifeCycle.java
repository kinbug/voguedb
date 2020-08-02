package com.github.kinbug.voguedb.node;

/**
 *
 * @author 莫那·鲁道
 */
public interface LifeCycle {

    void init() throws Throwable;

    void destroy() throws Throwable;
}
