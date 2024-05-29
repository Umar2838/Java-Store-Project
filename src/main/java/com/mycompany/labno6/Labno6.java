/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.labno6;

/**
 *
 * @author Umar
 */

class Product{
    String name;
    int  quantity;
    double price;
    
    Product(String name , int quantity , double price){
        
       this.name = name;
       this.quantity = quantity;
       this.price = price;
    }
    
    public String getName(){
        return this.name;
}
}

class Store{
    private String name;
    private String location;
    private Product[] productList;
    private int nbProduct;
   
    Store(String name , String location){
        this.name = name;
        this.location = location;
        this.productList = new Product[100];
        this.nbProduct = 0;
    }
    
    public String getName(){
        return this.name;
    }
    void addProduct(Product p){
      if(nbProduct < productList.length){
          productList[nbProduct] = p;
          nbProduct++;
    }
      else{
    System.out.println("Product list are full,cannot add more products");
      }
    }
    boolean searchProduct(String productName){
        for(int i=0 ; i<nbProduct ; i++){
            if(productList[i].getName().equalsIgnoreCase(productName)){
                return true;
            }
    }
        return false;
    }
    
    public Product deleteProduct(String productName){
       for(Product product : productList){
           if(product.getName().equalsIgnoreCase(productName)){
               productList.remove(product);
               return product;
           }
       }
       return null;
    }
    
}

public class Labno6 {
    public static void main(String[] args) {
        
   
    }
}
