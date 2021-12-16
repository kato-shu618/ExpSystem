//解答クラスから問題を作成するプログラム

public class Question{
    private Answer answer;
    public Question(Answer answer){
        this.answer = answer;
    }

    //必要なメソッド
    //クラス図作成問題->必要な要素|問題文、ソースコード
    public void createClassQuestion(){
        System.out.println("＜問＞以下のソースコードからクラス図を作成しなさい。");
        //解答クラスから必要なソースコードを取得する。
        FileList qSourceCode = this.answer.getProgramFilename();
        qSourceCode.filePrint();
        //解答として、クラス図を取得
        System.out.println("＜解答＞");
        FileList qClassFigure = this.answer.getClassFigureFilename();
        qClassFigure.printFilenameList();
    }

    //機械的導出問題->必要な要素|問題文、クラス図
    public void createFlameQuestion(){
        System.out.println("＜問＞以下のクラス図から機械的導出をしなさい");
        //解答クラスからクラス図を取得する。
        FileList classFigure = this.answer.getClassFigureFilename();
        classFigure.printFilenameList();
        //解答として、機械的導出を取得
        FileList flameCode = this.answer.getFlameFilename();
        System.out.println("＜解答＞");
        flameCode.filePrint();
    }

    //ソースコード作成問題->必要な要素|問題文、API仕様、クラス図
    public void createSourceQuestion(){
        System.out.println("＜問＞以下のAPI仕様とクラス図からソースコードを作成しなさい。");
        //解答クラスからAPI仕様を取得する
        Api api = this.answer.getApi();
        api.printAPI();
        FileList classFileList = this.answer.getClassFigureFilename();
        classFileList.printFilenameList();
        //解答として、ソースコード取得
        System.out.println("＜解答＞");
        FileList sourceCode = this.answer.getProgramFilename();
        sourceCode.filePrint();
    }

    //実行結果予想問題->必要な要素|問題文、ソースコード、テストケース
    public void createResultQuestion(){
        System.out.println("＜問＞以下のソースコード、実行確認用プログラムを用いて実行した場合の結果を予想しなさい。");
        //解答クラスからソースコード、実行確認用のプログラムを取得する
        FileList sourceCode = this.answer.getProgramFilename();
        sourceCode.filePrint();
        System.out.println("実行確認用プログラム");
        FileList testCode = this.answer.getTestFilename();
        testCode.filePrint();
        //解答として、resultを取得する
        System.out.println("＜解答＞");
        System.out.println(this.answer.getResult());
    }
}
