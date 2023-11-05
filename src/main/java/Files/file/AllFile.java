package Files.file;

import static Files.file.AllFile.format.*;


public class AllFile {

    private String nameFile;
    private long size;

    public AllFile() {

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
            this.size = size;}
        else {
            throw new IllegalArgumentException("Некорректный размер файла");
        }
    }
    private static AllFile[] allFiles;
    public static void addAllFile(AllFile allFile){
        if(allFiles==null || allFiles.length==0){
            allFiles = new AllFile[]{allFile};
        }else {
            AllFile[] temp = new AllFile[allFiles.length+1];
            for(int i=0 ; i< allFiles.length ; i++){
                temp[i] = allFiles[i];
            }
            temp[allFiles.length] = allFile;
            allFiles = temp;
        }
    }

    public static AllFile[] getAllFiles(){
        return allFiles;
    }
    public AllFile(String nameFile, long size, format format) {
        setNameFile(nameFile);
        setSize(size);
        this.format = format;
    }
    public enum format {
        docx ("docx"),
        image ("image"),
        audio ("audio"),
        video ("video");
        private final String form;
        public String getForm() {
            return form;
        }
        format (String form){
            this.form = form;
        }

        @Override
        public String toString() {
            return getForm();
        }

    }
    format format;
    @Override
    public String toString() {
        return "File name = " + getNameFile() + ". Size = " + getSize() + ". Details: " + format.getForm();
    }
    public static void printAll (AllFile[] objects){
        if (ImageFile.getImageFiles() != null) {
        for (ImageFile value : ImageFile.getImageFiles()) {
            System.out.println(value);}
        }
        if (AudioFile.getAudioFiles() != null) {
        for (AudioFile value : AudioFile.getAudioFiles()) {
          System.out.println(value);}
       }
        if (VideoFile.getVideoFiles() != null) {
        for (VideoFile value : VideoFile.getVideoFiles()) {
           System.out.println(value);}
     }
        if (DocFile.getDocFiles() != null) {
        for (DocFile value : DocFile.getDocFiles()) {
           System.out.println(value);}
       }
    }
    public static void main(String[] args) {
        ImageFile imageFile1= new ImageFile("spb-map.png", 1703527, image, 1024, 3072);
        DocFile docFile = new DocFile("j110-lab2-hiers.docx", 23212, docx, 2);
        AudioFile audioFile = new AudioFile("06-PrettyGirl.mp3",7893454, audio, "Eric Clapton, Pretty Girl", 0,5,28);
        VideoFile videoFile = new VideoFile("BackToTheFuture1.avi", 1470984192, video, "Back to the future I, 1985", 1,48,8,640,352);
        AllFile [] allFiles = new AllFile[]{imageFile1, docFile, audioFile, videoFile};
            ImageFile.addImageFiles(imageFile1);
            DocFile.addDocFile(docFile);
            AudioFile.addAudioFile(audioFile);
            VideoFile.addVideoFile(videoFile);
        printAll(allFiles);
    }
}

