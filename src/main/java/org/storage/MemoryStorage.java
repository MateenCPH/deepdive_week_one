package org.storage;

import java.util.ArrayList;
import java.util.List;

public class MemoryStorage <T> implements DataStorage <T> {

    private List<T> storageList = new ArrayList<>();

    @Override
    public String store(T data){
        storageList.add(data);
        return String.valueOf(storageList.size() - 1);
    }

    @Override
    public T retrieve(String source){
        int index = Integer.parseInt(source);
        return storageList.get(index);
    }
}
