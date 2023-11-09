package Files.file;

public class Duration extends VideoFile {
    private static Duration[] durations;
    public static Duration[] getDuration() {
        return durations;
    }
    public static void addDuration(Duration duration) {
        if (durations == null || durations.length == 0) {
            durations = new Duration[]{duration};
        } else {
            Duration[] temp = new Duration[durations.length + 1];
            for (int i = 0; i < durations.length; i++) {
                temp[i] = durations[i];
            }
            temp[durations.length] = duration;
            durations = temp;
        }
    }
    public Duration(int durationHour, int durationMinutes, int durationSeconds) {
        super(durationHour, durationMinutes, durationSeconds);
    }
    @Override
    public String toString() {
        return printTime();
    }
    public static void main(String[] args) {
        Duration h = new Duration(10,58,9);
        System.out.println(h);
    }
}
