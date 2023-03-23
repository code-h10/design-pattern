package bridge.implement;

public class Linux extends Folder {
    private String folderName;
    private StringBuilder path = new StringBuilder("/User/Bridge/");

    public Linux(String folderName) {
        this.path.append(folderName);
    }
    @Override
    public String getPath() {
        return  path.toString();
    }

    public void addFolder(String folderName) {
        path.append(folderName);
    }
}
