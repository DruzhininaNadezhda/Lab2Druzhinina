package Files.file;

public class ImageFile extends AllFile {
    private static ImageFile[] imageFiles;

    public ImageFile(long width, int height) {
        setWidth(width);
        setHeight(height);
    }

    public static ImageFile[] getImageFiles() {
        return imageFiles;
    }
    public static void addImageFiles(ImageFile imageFile) {
        if (imageFiles == null || imageFiles.length == 0) {
            imageFiles = new ImageFile[]{imageFile};
        } else {
            ImageFile[] temp = new ImageFile[imageFiles.length + 1];
            for (int i = 0; i < imageFiles.length; i++) {
                temp[i] = imageFiles[i];
            }
            temp[imageFiles.length] = imageFile;
            imageFiles = temp;
        }
    }
    public ImageFile(String nameFile, long size, AllFile.format format, long width, int height) {
        super(nameFile, size, format);
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
    private long width;
    private long height;

    public String toString(){ return  super.toString() + "," + getHeight() + "x" + getWidth();}
}
