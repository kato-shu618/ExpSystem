//FilePrinterの実装を確認するクラス

import java.io.File;
import java.io.IOException;

public class FilePrintTestCase {
    public static void main(String[] args) {
        String fileContent = null;
        try {
            fileContent = FilePrinter.filePrint(new File("Student.java"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(fileContent);
    }
}
