package Utils;

public class Competition {
    int year;
    double team1goals;
    int team2goals;

    public Competition(int year, double team1goals, int team2goals) {
        this.year = year;
        this.team1goals = team1goals;
        this.team2goals = team2goals;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getTeam1goals() {
        return team1goals;
    }

    public void setTeam1goals(double team1goals) {
        this.team1goals = team1goals;
    }

    public int getTeam2goals() {
        return team2goals;
    }

    public void setTeam2goals(int team2goals) {
        this.team2goals = team2goals;
    }

    @Override
    public String toString() {
        return "Competition{" +
                "year=" + year +
                ", team1goals=" + team1goals +
                ", team2goals=" + team2goals +
                '}';
    }
}
