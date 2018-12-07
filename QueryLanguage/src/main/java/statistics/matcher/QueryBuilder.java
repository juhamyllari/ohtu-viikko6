package statistics.matcher;

public class QueryBuilder {
    
    private Matcher matcher;

    public QueryBuilder() {
        matcher = new All();
    }
    
    public Matcher build() {
        Matcher returnValue = matcher;
        matcher = new All();
        return returnValue;
    }
    
    public QueryBuilder playsIn(String team) {
        matcher = new And(matcher, new PlaysIn(team));
        return this;
    }
    
    public QueryBuilder hasAtLeast(int number, String category) {
        matcher = new And(matcher, new HasAtLeast(number, category));
        return this;
    }
    
    public QueryBuilder hasFewerThan(int number, String category) {
        matcher = new And(matcher, new HasFewerThan(number, category));
        return this;
    }
    
    public QueryBuilder oneOf(Matcher matcher1, Matcher matcher2) {
        matcher = new Or(matcher1, matcher2);
        return this;
    }

}
