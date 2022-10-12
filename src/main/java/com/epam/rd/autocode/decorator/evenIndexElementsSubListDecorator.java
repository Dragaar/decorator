package com.epam.rd.autocode.decorator;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class evenIndexElementsSubListDecorator<T> extends AbstractList {

    List<T> sourceList;
    public evenIndexElementsSubListDecorator(List<T> sourceList) {
        this.sourceList = sourceList;
    }

    @Override
    public Object get(int index) {
        return sourceList.get(index*2);
    }

    @Override
    public int size() {
        return (int) Math.ceil(sourceList.size()/2.0);
    }
}
