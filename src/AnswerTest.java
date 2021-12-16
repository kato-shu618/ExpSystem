// 解答を登録するクラス
public class AnswerTest {
    private Test classFigureFilename = new Test();
    private Test programFilename = new Test();
    private Test flameFilename = new Test();
    private Test testFilename = new Test();
    private Api api = new Api();
    //private String comment;
    //private String explain;
    //private String result;

    public AnswerTest() {

    }
    //クラス図登録、取得メソッド
    public void setClassFigureFilename(String... classFigureFilenames){
        this.classFigureFilename.addFilename(classFigureFilenames);
    }
    public Test getClassFigureFilename(){
        return this.classFigureFilename;
    }

    //ソースコードを登録、取得メソッド
    public void setProgramFilename(String... programFilenames){
        this.programFilename.addFilename(programFilenames);
    }
    public Test getProgramFilename(){
        return this.programFilename;
    }

    //機械的導出の登録、取得メソッド
    public void setFlameFilename(String... flameFilenames){
        this.flameFilename.addFilename(flameFilenames);
    }
    public Test getFlameFilename(){
        return this.flameFilename;
    }

    //実行確認プログラムの登録、取得メソッド
    public void setTestFilename(String... testFilenames){
        this.testFilename.addFilename(testFilenames);
    }
    public Test getTestFilename(){
        return this.testFilename;
    }

    //API仕様を登録、取得するメソッド
    public void setApi(String methodName,String methodWork){
        this.api.addAPI(methodName,methodWork);
    }
    public Api getApi(){
        return this.api;
    }
}

