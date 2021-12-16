//Testクラスを利用出来るか実験プログラム(Answerのための元クラス)

public class Practice1 {
    private final Test classFigureFile = new Test();

    public Practice1(){

    }
    public void setClassFigureFile(String... filenames){
        classFigureFile.addFilename(filenames);
    }
    public Test getClassFigureFile(){
        return classFigureFile;
    }
}
