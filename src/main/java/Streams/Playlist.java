package Streams;

import java.util.ArrayList;
import java.util.List;

public class Playlist {

    public static void main(String[] args) {
        List<String> genres = new ArrayList<>();

        genres.add("Rock");
        genres.add("Alternative");
        genres.add("Classic");
        genres.add("Rap");
        genres.add("Metal");

        for (String genre : genres) {
            if (!genre.equals("Alternative")) {
                System.out.println(genre);
            }
        }
        System.out.println("===============");
        genres.stream()
                .filter(genre -> !genre.equals("Alternative"))
                .forEach(genre -> System.out.println(genre));

    }
}
