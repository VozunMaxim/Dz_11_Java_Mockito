import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManagerCinemaTest {

    @Test
    public void afisha() {
        String movie1 = "movie1";
        String movie2 = "movie2";
        String movie3 = "movie3";
        String movie4 = "movie4";
        String movie5 = "movie5";

        ManagerCinema ManagerCinema = new ManagerCinema();

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

        Assertions.assertArrayEquals (expected, actual);
    }

    @Test
    void findAll() {
    }
}