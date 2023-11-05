package Files.file;

public class DocFile extends AllFile {
    public static DocFile[] getDocFiles() {
        return docFiles;
    }
    public static void addDocFile(DocFile docFile) {
        if (docFiles == null || docFiles.length == 0) {
            docFiles = new DocFile[]{docFile};
        } else {
            DocFile[] temp = new DocFile[docFiles.length + 1];
            for (int i = 0; i < docFiles.length; i++) {
                temp[i] = docFiles[i];
            }
            temp[docFiles.length] = docFile;
            docFiles = temp;
            // = System.arraycopy(docFiles, 0, temp, 0, docFiles.length);
            //            temp[docFiles.length] = docFile;
            //            docFiles = temp;????
        }
    }


    private  static DocFile[] docFiles;


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
    private int pages;
    public String toString(){ return  super.toString() + ", " +getPages() + "pages.";}

}
