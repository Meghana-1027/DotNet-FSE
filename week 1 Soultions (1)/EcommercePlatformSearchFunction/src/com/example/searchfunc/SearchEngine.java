package com.example.searchfunc;

//File: SearchEngine.java
import java.util.Arrays;
import java.util.Comparator;

public class SearchEngine {

 // Linear Search
 public static Product linearSearch(Product[] products, String targetName) {
     for (Product p : products) {
         if (p.productName.equalsIgnoreCase(targetName)) {
             return p;
         }
     }
     return null;
 }

 // Binary Search
 public static Product binarySearch(Product[] products, String targetName) {
     // Binary Search requires sorted array
     Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));

     int low = 0;
     int high = products.length - 1;

     while (low <= high) {
         int mid = (low + high) / 2;
         int cmp = products[mid].productName.compareToIgnoreCase(targetName);

         if (cmp == 0)
             return products[mid];
         else if (cmp < 0)
             low = mid + 1;
         else
             high = mid - 1;
     }
     return null;
 }
}
