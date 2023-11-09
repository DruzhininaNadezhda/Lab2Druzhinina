package Files.file;

public class AudioFile extends AllFile {

    private String content;
    private int durationHour;
    private int durationMinutes;
    private int durationSeconds;

    public AudioFile(int durationHour, int durationMinutes, int durationSeconds) {
        super();
        setDurationHour(durationHour);
        setDurationMinutes(durationMinutes);
        setDurationSeconds(durationSeconds);

    }
    public AudioFile() {
    }
    public AudioFile(String nameFile, long size, AllFile.format format, String content, int durationHour, int durationMinutes, int durationSeconds) {
        super(nameFile, size, format);
        setContent(content);
        setDurationHour(durationHour);
        setDurationMinutes(durationMinutes);
        setDurationSeconds(durationSeconds);
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public int getDurationHour() {
        return durationHour;
    }
    public void setDurationHour(int durationHour) {
       if (durationHour >= 0) {
           this.durationHour = durationHour;
       }else {throw new IllegalArgumentException("Некорректная длительность (часы)");}
    }
    public int getDurationMinutes() {
        return durationMinutes;
    }
    public void setDurationMinutes(int durationMinutes) {
        if (durationMinutes >= 0 && durationMinutes < 60) {
            this.durationMinutes = durationMinutes;
        }else {throw new IllegalArgumentException("Некорректная длительность (минуты)");}
    }
    public int getDurationSeconds() {
        return durationSeconds;
    }
    public void setDurationSeconds(int durationSeconds) {
        if (durationSeconds >= 0 && durationSeconds < 60) {
            this.durationSeconds = durationSeconds;
        }else {throw new IllegalArgumentException("Некорректная длительность (секунды)");}
    }
    public String printTime() {
        String a;
        String b;
        String c;
        a = getDurationMinutes() < 10 ? "0" + getDurationMinutes() : "" + getDurationMinutes();
        b = getDurationSeconds() < 10 ? "0" + getDurationSeconds() : "" + getDurationSeconds();
        c = getDurationHour() < 10 ? "0" + getDurationHour() : "" + getDurationHour();
        return c + ":" + a + ":" + b;
    }
    @Override
    public String toString() {
        return super.toString() +", " + getContent() + ", " + printTime();
    }

}
