package guru.springframework.joke.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

/**
 * Created by dmitri on 2020-08-15.
 */
//@Configuration
public class ChuckConfiguration {

//    @Bean
    public ChuckNorrisQuotes chuckNorrisQuotes() {
        return new ChuckNorrisQuotes();
    }
}
