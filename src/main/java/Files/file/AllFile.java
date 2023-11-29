package Files.file;

import static Files.file.AllFile.format.*;


public class AllFile {
    private String nameFile;
    private long size;
    format format;
    public AllFile() {
    }
    public AllFile(String nameFile, long size, format format) {
        setNameFile(nameFile);
        setSize(size);
        this.format = format;
    }
    public String getNameFile() {
        return nameFile;
    }
    public void setNameFile(String nameFile) {
        this.nameFile = nameFile;
    }
    public double getSize() {
        return size;
    }
    public void setSize(long size) {
        if (size > 0) {
            this.size = size;
        } else {
            throw new IllegalArgumentException("Некорректный размер файла");
        }
    }
    public enum format {
        docx("docx"),
        image("image"),
        audio("audio"),
        video("video");
        private final String form;
        public String getForm() {
            return form;
        }
        format(String form) {
            this.form = form;
        }
        @Override
        public String toString() {
            return getForm();
        }
    }
    public static void printAll(Object[] objects) {
        for (Object value : objects) {
            System.out.println(value);
        }
    }
    @Override
    public String toString() {
        return "File name = " + getNameFile() + ". Size = " + getSize() + ". Details: " + format.getForm();
    }
    public static void main(String[] args) {
        ImageFile imageFile1= new ImageFile("spb-map.png", 1703527, image, 1024, 3072);
        DocFile docFile = new DocFile("j110-lab2-hiers.docx", 23212, docx, 2);
        AudioFile audioFile = new AudioFile("06-PrettyGirl.mp3",7893454, audio, "Eric Clapton, Pretty Girl", 0,5,28);
        VideoFile videoFile = new VideoFile("BackToTheFuture1.avi", 1470984192, video, "Back to the future I, 1985", 1,48,8,640,352);
        AllFile [] allFiles = new AllFile[]{docFile, audioFile, imageFile1, videoFile};
        printAll(allFiles);
        System.out.println();
    }
}

