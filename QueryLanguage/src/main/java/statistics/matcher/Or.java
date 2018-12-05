package statistics.matcher;

import java.util.stream.Stream;
import statistics.Player;

public class Or implements Matcher {

    private Matcher[] matchers;

    public Or(Matcher... matchers) {
        this.matchers = matchers;
    }
    
    @Override
    public boolean matches(Player p) {
        return Stream.of(matchers).anyMatch(m -> m.matches(p));
    }

}
