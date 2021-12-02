package edu.pnu.collection;
public class GenericList<T> {
    private static final int DEFAULT_SIZE = 10;
    private Object[] data;
    private int size = 0;

    public GenericList() {
        data = new Object[DEFAULT_SIZE];
    }

    public GenericList(int size) {
        data = new Object[size];
    }

    public void putIfAbsent(T newBeverage) {
        if(isAbsent(newBeverage)){
            data[size] = newBeverage;
            size++;
        }
    }
    private boolean isAbsent(T newBeverage) {
        if(size == 0) return true;
        for(int i = 0; i < size; i++) {
            if(data[i].hashCode()==(newBeverage.hashCode())) return false;
        }
        return true;
    }

    public void clear() {
        for(int i = 0; i < size; i++) {
            data[i] = null;
        }
        size = 0;
    }

    public T get(String name, String type) {
        edu.pnu.admin.Beverage newBeverage = new edu.pnu.admin.Beverage(name,type);
        if(isAbsent((T) newBeverage)){
            return null;
        }
        for(int i = 0; i < size; i++) {
            if (data[i].hashCode()==newBeverage.hashCode()) return (T) data[i];
        }
        return null;
    }
    public T getIth(int i) {
        return (T) data[i];
    }

    public int size() {
        return size;
    }

}
