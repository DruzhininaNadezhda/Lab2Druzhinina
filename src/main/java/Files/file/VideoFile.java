package Files.file;

import static Files.file.AllFile.format.video;

public class VideoFile extends AudioFile {
    private long width;
    private long height;
    public VideoFile(int durationHour, int durationMinutes, int durationSeconds) {
        super(durationHour,durationMinutes,durationSeconds);
    }
    public VideoFile(String nameFile, long size, AllFile.format format, String content, int durationHour, int durationMinutes, int durationSeconds, long width, long height) {
        super(nameFile, size, format, content, durationHour, durationMinutes, durationSeconds);
        setWidth (width);
        setHeight(height);
    }
    public VideoFile(int durationHour, int durationMinutes, int durationSeconds, long width, long height) {
        super(durationHour, durationMinutes, durationSeconds);
        setWidth(width);
        setHeight(height);
    }
    public long getWidth() {
        return width;
    }
    public void setWidth(long width) {
        if (width > 0) {
            this.width = width;
        } else {
            throw new IllegalArgumentException("Некорректный размер файла");
        }
    }
    public long getHeight () {
        return height;
    }
    public void setHeight ( long height){
        if (height > 0) {
            this.height = height;
        } else {
            throw new IllegalArgumentException("Некорректный размер файла");
        }
    }
    @Override
    public String toString() {
        return super.toString() + ", " + getHeight() + "x" + getHeight();
    }
    public static void main(String[] args) {
        VideoFile videoFile1 = new VideoFile("Что-то там.клип", 3333, video, "Отпусти и забудь", 00, 4, 20, 1080, 960);
        VideoFile[] videoFiles = new VideoFile[]{videoFile1};
        printAll(videoFiles);
        //Дочерний класс имеет доступ ко всем методам основного класса, в том числе и Printall
    }
}
