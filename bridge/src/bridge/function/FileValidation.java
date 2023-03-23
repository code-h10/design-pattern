package bridge.function;

import bridge.implement.Folder;

public class FileValidation extends File{
    private Folder folder;
    public FileValidation(Folder folder) {
        super(folder);
        this.folder = folder;
    }

    public boolean verifyFileName() {
        if (folder.getPath().contains("@")) {
            return true;
        } else {
            return false;
        }
    }
}
