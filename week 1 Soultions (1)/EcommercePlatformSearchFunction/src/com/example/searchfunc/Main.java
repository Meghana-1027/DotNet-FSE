package com.example.searchfunc;

//File: Main.java
public class Main {
 public static void main(String[] args) {
     Product[] products = {
         new Product(1, "Laptop", "Electronics"),
         new Product(2, "Shoes", "Footwear"),
         new Product(3, "Book", "Education"),
         new Product(4, "Smartphone", "Electronics"),
         new Product(5, "T-Shirt", "Clothing")
     };

     String searchKey = "Smartphone";

     System.out.println("=== Linear Search ===");
     Product found1 = SearchEngine.linearSearch(products, searchKey);
     System.out.println(found1 != null ? "Found: " + found1 : "Product not found");

     System.out.println("\n=== Binary Search ===");
     Product found2 = SearchEngine.binarySearch(products, searchKey);
     System.out.println(found2 != null ? "Found: " + found2 : "Product not found");
 }
}
