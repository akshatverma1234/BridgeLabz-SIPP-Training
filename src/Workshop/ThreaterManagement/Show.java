package Workshop.ThreaterManagement;

class Show {
    String name;
    String time;  

    public Show(String name, String time) {
        this.name = name;
        this.time = time;
    }

    public String toString() {
        return name + " at " + time;
    }
}