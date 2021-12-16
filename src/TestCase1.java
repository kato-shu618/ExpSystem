public class TestCase1 {
    public static void main(String[] args) {
        Test test1 = new Test();
        test1.addFilename("file1","file2");
        test1.printFilenameList();
        System.out.println("-----------------");
        System.out.println("QFilename");
        test1.createQFilenameList();
        test1.printQFilenameList();
    }
}
