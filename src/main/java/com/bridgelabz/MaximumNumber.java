package com.bridgelabz;

public class MaximumNumber<T> {
    T d;

    public T getMaxNumber(T a, T b, T c) {
        d = (a.toString().compareTo(b.toString()) > 0 ? (a.toString().compareTo(c.toString()) > 0 ? a : c)
                : (b.toString().compareTo(c.toString()) > 0 ? b : c));
        return d;
    }
}
