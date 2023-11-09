package Files.file;

public class DocFile extends AllFile {
    private int pages;
    public DocFile(String nameFile, long size, AllFile.format format, int pages) {
        super(nameFile, size, format);
        setPages(pages);
    }
    public int getPages() {
        return pages;
    }
    public void setPages(int pages) {
        if (pages > 0) {
            this.pages = pages;}
        else {
            throw new IllegalArgumentException("Некорректное количество страниц");
        }
    }
    @Override
    public String toString(){ return  super.toString() + ", " +getPages() + "pages.";}

}
