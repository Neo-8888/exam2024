/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.exam2024.tests;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author peter
 */

import com.mycompany.exam2024.IMovieTickets;
import com.mycompany.exam2024.MovieTickets;


public class MovieTicketsTest {

    @Test
    public void CalculateTotalSales_ReturnsExpectedTotalSales() {
        // Arrange
        IMovieTickets movieTickets = new MovieTickets();
        int[] napoleonSales = {3000, 1500, 1700};

        // Act
        int actual = movieTickets.TotalMovieSales(napoleonSales);

        // Assert
        assertEquals(6200, actual);
    }

    @Test
    public void TopMovieSales_ReturnsTopMovie() {
        // Arrange
        IMovieTickets movieTickets = new MovieTickets();
        String[] movies = {"Napoleon", "Oppenheimer"};
        int[] totalSales = {6200, 6300};

        // Act
        String actual = movieTickets.TopMovie(movies, totalSales);

        // Assert
        assertEquals("Oppenheimer", actual);
    }
}
