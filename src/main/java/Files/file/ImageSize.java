package Files.file;

public class ImageSize extends ImageFile{
    private static ImageSize[] imageSizes;
    public static ImageSize[] getImageSizes() {
        return imageSizes;
    }
    public static void addImageSize(ImageSize imageSize) {
        if (imageSizes == null || imageSizes.length == 0) {
            imageSizes = new ImageSize[]{imageSize};
        } else {
            ImageSize[] temp = new ImageSize[imageSizes.length + 1];
            for (int i = 0; i < imageSizes.length; i++) {
                temp[i] = imageSizes[i];
            }
            temp[imageSizes.length] = imageSize;
            imageSizes = temp;
        }
    }
    public ImageSize(long width, int height) {
        super(width, height);
    }
    @Override
    public String toString() {
        return super.toString() + getWidth() + "x" + getHeight();
    }
}
