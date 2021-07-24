package com.sambit.java8features.generics;

public class GenericsExample_3 {
    public static void main(String[] args) {
    Mapping<Integer,String> mapping = new Mapping(1,"One");
        System.out.println(mapping);
        int k = mapping.getK();
        String v = mapping.getV();
        System.out.println("Key is : "+ k + " Value is : " + v);
    }
}

class Mapping<K,V>{
    private K k;
    private V v;

    public Mapping(K k, V v) {
        this.k = k;
        this.v = v;
    }

    public K getK() {
        return k;
    }

    public void setK(K k) {
        this.k = k;
    }

    public V getV() {
        return v;
    }

    public void setV(V v) {
        this.v = v;
    }

    @Override
    public String toString() {
        return "Mapping{" +
                "k=" + k +
                ", v=" + v +
                '}';
    }
}
