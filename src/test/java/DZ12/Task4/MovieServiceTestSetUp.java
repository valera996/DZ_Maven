package DZ12.Task4;

import org.junit.jupiter.api.BeforeEach;

public class MovieServiceTestSetUp {
    protected MovieService movieService;

     @BeforeEach
    protected void setUp(){
         this.movieService = new MovieService();
     }

}
