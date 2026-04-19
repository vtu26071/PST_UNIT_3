import java.util.Comparator;
class Checker implements Comparator<Player> {
    @Override
    public int compare(Player a, Player b) {
        // Sort by score (descending)
        if (a.score != b.score) {
            return b.score - a.score;
        }
        // If scores are equal, sort by name (ascending)
        return a.name.compareTo(b.name);
    }
}
