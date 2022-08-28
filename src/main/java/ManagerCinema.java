
public class ManagerCinema {
    private String[] movie = new String[0];
private int limit;
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

    }
}
