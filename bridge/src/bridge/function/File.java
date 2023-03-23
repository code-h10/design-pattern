package bridge.function;

import bridge.implement.Folder;

public class File {
    private Folder folder;
    public File(Folder folder) {
        this.folder = folder;
    }

    public String getPath() {
        return folder.getPath();
    }

}
