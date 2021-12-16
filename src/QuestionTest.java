//解答クラスから問題を作成するプログラム

public class QuestionTest {
    private AnswerTest answer;
    public QuestionTest(AnswerTest answer){
        this.answer = answer;
    }


    //必要なメソッド
    //クラス図作成問題->必要な要素|問題文、ソースコード
    public void createClassQuestion(){
        System.out.println("以下のソースコードからクラス図を作成しなさい。");
        //解答クラスから必要なソースコードを取得する。
        Test questionSourceCode = this.answer.getProgramFilename();
        //questionSourceCode.printFilenameList();
        questionSourceCode.filePrint();
        //解答として、クラス図を取得
        Test questionClassFigure = this.answer.getClassFigureFilename();
        questionClassFigure.printFilenameList();
    }

    //機械的導出問題->必要な要素|問題文、クラス図
    public void createFlameQuestion(){
        System.out.println("以下のクラス図から機械的導出をしなさい");
        //解答クラスからクラス図を取得する。
        Test classFigure = this.answer.getClassFigureFilename();
        //解答として、機械的導出を取得
        Test flameCode = this.answer.getFlameFilename();
    }

    //ソースコード作成問題->必要な要素|問題文、API仕様
    public void createSourceQuestion(){
        System.out.println("以下のAPI仕様からソースコードを作成しなさい。");
        //解答クラスからAPI仕様を取得する
        Api api = this.answer.getApi();
        api.printAPI();
        //解答として、ソースコード取得
        Test sourceCode = this.answer.getProgramFilename();
    }

    //実行結果予想問題->必要な要素|問題文、ソースコード、テストケース
    public void createResultQuestion(){
        System.out.println("以下のソースコード、実行確認用プログラムを用いて実行した場合の結果を予想しなさい。");
        //解答クラスからソースコード、実行確認用のプログラムを取得する
        Test sourceCode = this.answer.getProgramFilename();
        Test testCode = this.answer.getTestFilename();
        //解答として、resultを取得する
    }
}
