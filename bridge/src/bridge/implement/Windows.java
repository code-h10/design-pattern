package bridge.implement;

public class Windows extends Folder {
    private String folderName;
    private StringBuilder path = new StringBuilder("C:\\Users\\Bridge\\");
    public Windows(String folderName) {
        this.path.append(folderName);
    }

    @Override
    public String getPath() {
        return path.toString();
    }
    public void addFolder(String folderName) {
        path.append(folderName);
    }
}
