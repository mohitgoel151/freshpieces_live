package org.util.common.base;

import org.util.common.exception.MyException;

@FunctionalInterface
public interface CheckedFunction <T, R> {
    R apply(T t) throws MyException;
}