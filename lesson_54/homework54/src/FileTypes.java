public enum FileTypes {
    GIF(".gif"),
    JPG(".jpg"),
    CLASS(".class");
    public String getExt() {
        return ext;
    }

    FileTypes(String ext) {
        this.ext = ext;
    }

    private String ext;
}
