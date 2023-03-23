package bridge;

import bridge.function.File;
import bridge.function.FileValidation;
import bridge.implement.Linux;
import bridge.implement.Mac;
import bridge.implement.Windows;

public class Main {
    public static void main(String[] args) {

        File file1 = new File(new Linux("Document"));
        File file2 = new File(new Windows("Document"));
        File file3 = new File(new Mac("$!@$@!$"));

        FileValidation valid1 = new FileValidation(new Linux("Document"));
        FileValidation valid2 = new FileValidation(new Windows("Document"));
        FileValidation valid3 = new FileValidation(new Mac("$!@$@!$"));


        System.out.println(file1.getPath());;
        System.out.println(file2.getPath());;
        System.out.println(file3.getPath());;

        System.out.println(valid1.verifyFileName());
        System.out.println(valid2.verifyFileName());
        System.out.println(valid3.verifyFileName());

    }
}