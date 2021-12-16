import java.io.*;

public class FileToString {
    public static String fileToString(File file) throws IOException{
        BufferedReader br = null;
        try{
            br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            StringBuffer sb = new StringBuffer();
            int c;
            while ((c = br.read()) != -1){
                sb.append((char) c);
            }
            return sb.toString();
        }finally {
            br.close();
        }
    }

    public static void main(String[] args) {
        String s = null;
        try {
            s = fileToString(new File("Student.java"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(s);
    }
}
