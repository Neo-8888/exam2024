/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exam2024;

/**
 *
 * @author peter
 */
public class MovieTickets implements IMovieTickets {
    
    //adds up the tickets of one movie
     @Override
    public int TotalMovieSales(int[] movieTicketSales) {
        int total = 0;
        for (int i = 0; i < movieTicketSales.length; i++) {
            total += movieTicketSales[i];
        }
        return total;
    }
    //returms the nameof the movie with the highest total sales
     @Override
    public String TopMovie(String[] movies, int[] totalSales) {
        if (movies.length == 0) {
            return "";
        }

        int topIndex = 0;
        for (int i = 1; i < totalSales.length; i++) {
            if (totalSales[i] > totalSales[topIndex]) {
                topIndex = i;
            }
        }
        return movies[topIndex];
   }  
}
