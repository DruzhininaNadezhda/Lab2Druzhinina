package Files.file;

public class ImageFile extends AllFile {
    private long width;
    private long height;
    public ImageFile(String nameFile, long size, AllFile.format format, long width, long height) {
        super(nameFile, size, format);
        setWidth(width);
        setHeight(height);
    }
    public ImageFile (long width, long height) {
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
    public String toString(){ return  super.toString() + "," + getHeight() + "x" + getWidth();}
}
