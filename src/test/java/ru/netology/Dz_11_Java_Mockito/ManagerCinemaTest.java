package ru.netology.Dz_11_Java_Mockito;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ManagerCinemaTest {
    @Test
    public void shouldAfisha() {
        String movie1 = "movie1";
        String movie2 = "movie2";
        String movie3 = "movie3";
        String movie4 = "movie4";
        String movie5 = "movie5";


        ManagerCinema ManagerCinema = new ManagerCinema(5);

        ManagerCinema.afisha(movie1);
        ManagerCinema.afisha(movie2);
        ManagerCinema.afisha(movie3);
        ManagerCinema.afisha(movie4);
        ManagerCinema.afisha(movie5);

        String[] expected = {
                movie1,
                movie2,
                movie3,
                movie4,
                movie5,
        };
        String[] actual = ManagerCinema.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAfishaAllLimit() {
        String movie1 = "movie1";
        String movie2 = "movie2";
        String movie3 = "movie3";
        String movie4 = "movie4";
        String movie5 = "movie5";
        String movie6 = "movie6";
        String movie7 = "movie7";
        String movie8 = "movie8";
        String movie9 = "movie9";
        String movie10 = "movie10";


        ManagerCinema ManagerCinema = new ManagerCinema();

        ManagerCinema.afisha(movie1);
        ManagerCinema.afisha(movie2);
        ManagerCinema.afisha(movie3);
        ManagerCinema.afisha(movie4);
        ManagerCinema.afisha(movie5);
        ManagerCinema.afisha(movie6);
        ManagerCinema.afisha(movie7);
        ManagerCinema.afisha(movie8);
        ManagerCinema.afisha(movie9);
        ManagerCinema.afisha(movie10);

        String[] expected = {
                movie1,
                movie2,
                movie3,
                movie4,
                movie5,
                movie6,
                movie7,
                movie8,
                movie9,
                movie10,
        };
        String[] actual = ManagerCinema.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAfishaBelowLimit() {
        String movie1 = "movie1";
        String movie2 = "movie2";
        String movie3 = "movie3";
        String movie4 = "movie4";
        String movie5 = "movie5";
        String movie6 = "movie6";
        String movie7 = "movie7";
        String movie8 = "movie8";
        String movie9 = "movie9";
        String movie10 = "movie10";


        ManagerCinema ManagerCinema = new ManagerCinema(10);

        ManagerCinema.afisha(movie1);
        ManagerCinema.afisha(movie2);
        ManagerCinema.afisha(movie3);
        ManagerCinema.afisha(movie4);
        ManagerCinema.afisha(movie5);
        ManagerCinema.afisha(movie6);
        ManagerCinema.afisha(movie7);
//        ManagerCinema.afisha(movie8);
//        ManagerCinema.afisha(movie9);
//        ManagerCinema.afisha(movie10);

        String[] expected = {
                movie1,
                movie2,
                movie3,
                movie4,
                movie5,
                movie6,
                movie7,
//                movie8,
//                movie9,
//                movie10,
        };
        String[] actual = ManagerCinema.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLast() {
        String movie1 = "movie1";
        String movie2 = "movie2";
        String movie3 = "movie3";
        String movie4 = "movie4";
        String movie5 = "movie5";

        ManagerCinema ManagerCinema = new ManagerCinema(5);

        ManagerCinema.afisha(movie1);
        ManagerCinema.afisha(movie2);
        ManagerCinema.afisha(movie3);
        ManagerCinema.afisha(movie4);
        ManagerCinema.afisha(movie5);

        String[] expected = {
                movie5,
                movie4,
                movie3,
                movie2,
                movie1,
        };
        String[] actual = ManagerCinema.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastWithOutMovie() {
        String movie1 = "movie1";
        String movie2 = "movie2";
        String movie3 = "movie3";
        String movie4 = "movie4";
        String movie5 = "movie5";

        ManagerCinema ManagerCinema = new ManagerCinema(5);

//        ManagerCinema.afisha(movie1);
//        ManagerCinema.afisha(movie2);
//        ManagerCinema.afisha(movie3);
//        ManagerCinema.afisha(movie4);
//        ManagerCinema.afisha(movie5);

        String[] expected = {
//                movie5,
//                movie4,
//                movie3,
//                movie2,
//                movie1,
        };
        String[] actual = ManagerCinema.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastAboveLimit() {
        String movie1 = "movie1";
        String movie2 = "movie2";
        String movie3 = "movie3";
        String movie4 = "movie4";
        String movie5 = "movie5";
        String movie6 = "movie6";
        String movie7 = "movie7";

        ManagerCinema ManagerCinema = new ManagerCinema(5);

        ManagerCinema.afisha(movie1);
        ManagerCinema.afisha(movie2);
        ManagerCinema.afisha(movie3);
        ManagerCinema.afisha(movie4);
        ManagerCinema.afisha(movie5);
        ManagerCinema.afisha(movie6);
        ManagerCinema.afisha(movie7);

        String[] expected = {
                movie7,
                movie6,
                movie5,
                movie4,
                movie3,
        };
        String[] actual = ManagerCinema.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastBelowLimit() {
        String movie1 = "movie1";
        String movie2 = "movie2";
        String movie3 = "movie3";
        String movie4 = "movie4";
        String movie5 = "movie5";

        ManagerCinema ManagerCinema = new ManagerCinema(5);

        ManagerCinema.afisha(movie1);
        ManagerCinema.afisha(movie2);
        ManagerCinema.afisha(movie3);
//        ManagerCinema.afisha(movie4);
//        ManagerCinema.afisha(movie5);

        String[] expected = {
//                movie5,
//                movie4,
                movie3,
                movie2,
                movie1,
        };
        String[] actual = ManagerCinema.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}