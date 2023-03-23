package bridge.implement;

public class Mac extends Folder {
    private String folderName;
    private StringBuilder path = new StringBuilder("/User/Bridge/");
    public Mac(String folderName) {
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
