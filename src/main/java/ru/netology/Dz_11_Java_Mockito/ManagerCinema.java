package ru.netology.Dz_11_Java_Mockito;

public class ManagerCinema {
    private String[] movie = new String[0];
    private int limit;

    public ManagerCinema() {
        limit = 10;
    }

    public ManagerCinema(int limit) {
        this.limit = limit;
    }

    public void afisha(String cinema) {
        String[] tmp = new String[movie.length + 1];
        for (int i = 0; i < movie.length; i++) {
            tmp[i] = movie[i];
        }
        tmp[tmp.length - 1] = cinema;
        movie = tmp;
    }

    public String[] findAll() {
        return movie;
    }

    public String[] findLast() {
        int resultSize = limit < movie.length ? limit : movie.length;
        String[] result = new String[resultSize];
        for (int i = 0; i < resultSize; i++) {
            result[i] = movie[movie.length - 1 - i];
        }
        return result;
    }
}
