package DZ12.Task4;

import java.util.*;
import java.util.stream.Collectors;

public class MovieService {
    private Map<Movie, List<Rating>> ratingList = new HashMap<>();

    public Map<Movie, List<Rating>> getAll(){
        return Map.copyOf(ratingList);
    }
    //Метод для добавления оценки к фильму.
    public synchronized void addRating(Movie movie, Rating rating){
        if(rating.getRating().doubleValue() < 1 || rating.getRating().doubleValue() > 10){
            throw new IllegalArgumentException("Ошибка, оценка не должена быть меньше 1 или больше 10");
        }
        if(!ratingList.containsKey(movie)){
            ratingList.put(movie, new LinkedList<>(List.of(rating)));
        } else ratingList.get(movie).add(rating);
    }


    //Расчет средней оценки фильма.
    public double averageRatingOfFilm(Movie movie){
        return ratingList.get(movie).stream()
                .mapToDouble(n -> n.getRating().doubleValue())
                .average()
                .orElseThrow();
    }

    //Расчет средней оценки для каждого фильма.
    public Map<Movie, Double> averageRatingOfAllFilm(){
        return ratingList.keySet().stream()
                .map(movie -> Map.entry(movie, averageRatingOfFilm(movie)))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a1 ,a2) -> a1,
                        HashMap::new));
    }

    //Сортировка фильмов по средней оценке.
    public LinkedHashMap<Movie, Double> sortFilmsByRating(){
        return averageRatingOfAllFilm().entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a1,a2) -> a1,
                        LinkedHashMap::new));
    }


}
