package com.sambit.java8features.generics;
/*
* Object is the base class for everything, any type can fit into Object.
* But we should use generics in all the places, so type safe and type cast will be taken care by generics.
* Using genrics is the standard way to design am application.
* Using Object will impact performance.
*
*
* */
public class GenericExample_2 {
    public static void main(String[] args) {
      /*  Product product = new Product(121, "Soap");
        int productId = (int)product.getProductId();
        System.out.println("Product ID : "+ productId);
        String productDesc = (String)product.getProductDescription(); */

        //In generics no need to perform type cast, This is the benefit of generics.
        Product1<Integer,String> product = new Product1<>(121,"Soap");
        int p_Id = product.getProductId();
        String p_desc = product.getProductDescription();
        System.out.println("Product ID is: "+p_Id + " Product Description is : "+ p_desc);
    }
}
//Generics have used, using generics written below code..
class Product1<T,U>{
    private T productId;
    private U productDescription;

    public Product1(T productId, U productDescription) {
        this.productId = productId;
        this.productDescription = productDescription;
    }

    public T getProductId() {
        return productId;
    }

    public void setProductId(T productId) {
        this.productId = productId;
    }

    public U getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(U productDescription) {
        this.productDescription = productDescription;
    }
}

//Example without Generics, Using Object written below code
class Product{
    private Object productId;
    private Object productDescription;

    public Product(Object productId, Object productDescription) {
        this.productId = productId;
        this.productDescription = productDescription;
    }

    public Object getProductId() {
        return productId;
    }

    public void setProductId(Object productId) {
        this.productId = productId;
    }

    public Object getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(Object productDescription) {
        this.productDescription = productDescription;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productDescription=" + productDescription +
                '}';
    }
}