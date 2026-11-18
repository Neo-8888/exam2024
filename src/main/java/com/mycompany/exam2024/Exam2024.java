/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exam2024;

/**
 *
 * @author peter
 */
public class Exam2024 {

    public static void main(String[] args) {
        
        String[] movies = {"Naoploen", "Opphenhimer"};
        String[] months = {"JAN", "FEB", "MAR"};
        
        int[][] ticketSales ={
            {3000, 1500, 1700},
            {3500,1200, 1600}
        };
        
        int[] totalSales = new int[movies.length];
        
        //calculating the total for each movir 
        for (int i = 0; i < movies.length; i++){
            for (int j = 0; j< ticketSales[i].length; j++){
                totalSales[i] += ticketSales [i][j];
            }
        }
        
        //find the top performing bassically highest
        int topIndex =0;
        for (int i = 1; i < totalSales.length; i++){
            if (totalSales[i] > totalSales[topIndex]){
                topIndex =i;
            }
            
        }
           // Report heading and column headings
        System.out.println("MOVIE TICKET SALES REPORT - 2024");
        System.out.println();
        System.out.printf("%-20s", "");
        for (int j = 0; j < months.length; j++) {
            System.out.printf("%-15s", months[j]);
        }
        System.out.println();
        System.out.println("---------------------------------------------------------------");

        // One row per movie, one column per month
        for (int i = 0; i < movies.length; i++) {
            System.out.printf("%-20s", movies[i]);
            for (int j = 0; j < ticketSales[i].length; j++) {
                System.out.printf("%-15d", ticketSales[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        // Total sales for each movie
        for (int i = 0; i < movies.length; i++) {
            System.out.println("Total movie ticket sales for " + movies[i] + " " + totalSales[i]);
        }
        System.out.println();

        // Top performing movie
        System.out.println("Top performing movie: " + movies[topIndex]);
    }
}
  