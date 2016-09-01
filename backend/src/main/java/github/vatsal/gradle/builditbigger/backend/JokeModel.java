package github.vatsal.gradle.builditbigger.backend;

/**
 * The object model for the data we are sending through endpoints
 */
public class JokeModel {

    private String joke;

    public JokeModel(String joke) {
        this.joke = joke;
    }

    public String getData() {
        return joke;
    }

    public void setData(String joke) {
        this.joke = joke;
    }
}