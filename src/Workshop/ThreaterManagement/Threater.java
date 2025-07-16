package Workshop.ThreaterManagement;

class Theater {
    Show[] shows;
    int size;

    public Theater(int length) {
        shows = new Show[length];
        size = 0;
    }

    public void addShow(Show newShow) {
        if (size >= shows.length) {
            return;
        }

        shows[size] = newShow;

        int i = size;
        while (i > 0 && shows[i].time.compareTo(shows[i - 1].time) < 0) {
            Show temp = shows[i];
            shows[i] = shows[i - 1];
            shows[i - 1] = temp;
            i--;
        }

        size++;
    }

    public void displayShows() {
        System.out.println("Shows:");
        for (int i = 0; i < size; i++) {
            System.out.println("* " + shows[i]);
        }
    }
}

public class Threater {
    public static void main(String[] args) {
        Theater akshatTheater = new Theater(10); 

        akshatTheater.addShow(new Show("Avengers", "15:30"));
        akshatTheater.addShow(new Show("Kesari 2", "2:00"));
        akshatTheater.addShow(new Show("HouseFull 4", "18:00"));
        akshatTheater.addShow(new Show("Hero No.1", "14:00"));
        akshatTheater.addShow(new Show("Interstellar", "16:30"));

        akshatTheater.displayShows();
    }
}
