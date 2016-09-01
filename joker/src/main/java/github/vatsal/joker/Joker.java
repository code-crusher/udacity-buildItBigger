package github.vatsal.joker;

import java.util.Random;

public class Joker {

    // no object initialisation
    private Joker() {
    }

    private static final Random random = new Random();

    private static final String[] NERDY_JOKES = {
            "There are only 10 types of people in the world: those that understand binary and those that don’t.",
            "The Internet: where men are men, women are men, and children are FBI agents.",
            "The box said ‘Requires Windows Vista or better’. So I installed LINUX.",
            "In a world without fences and walls, who needs Gates and Windows?",
            "Penguins love cold, they wont survive the sun.",
            "Computers are like air conditioners: they stop working when you open Windows.",
            "My attitude isn’t bad. It’s in beta.",
            "If I wanted a warm fuzzy feeling, I’d antialias my graphics!"
    };

    public static String tossMeJoke() {
        return NERDY_JOKES[random.nextInt(NERDY_JOKES.length)];
    }
}
