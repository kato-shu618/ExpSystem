//解答を入力するメイン

public class AnswerTestCase {
    public static void main(String[] args) {
        Answer answer1 = new Answer();
        answer1.setApi("Student", "コンストラクタです．「学生」のidを引数idで，名前を引数nameで渡します．\n\tそれぞれ，インスタンス変数id，nameに代入します");
        answer1.setApi("getId", "「学生」のidを返します．");
        answer1.setApi("setId", "「学生」のidを変更します．");
        answer1.setApi("getName", "「学生」の名前を返します．");
        answer1.setApi("setName", "「学生」の名前を変更します．");
        //answer1.getApi().printAPI();

        answer1.setClassFigureFilename("classFigure1","classFigure2");
        answer1.setProgramFilename("Student.java","StudentList.java");
        answer1.setFlameFilename("Value.txt","Coin50.txt","Coin100.txt","Coin1000.txt","CoinBox.txt");
        answer1.setTestFilename("C1_1.java");

        //System.out.println("クラス図一覧");
        //answer1.getClassFigureFilename().printFilenameList();

        //System.out.println("\nソースコード一覧");
        //answer1.getProgramFilename().printFilenameList();

        //System.out.println("\n機械的導出一覧");
        //answer1.getFlameFilename().printFilenameList();

        //System.out.println("\n動作確認用コード一覧");
        //answer1.getTestFilename().printFilenameList();

        Question question1 = new Question(answer1);
        //クラス図記述問題
        question1.createClassQuestion();

        //機械的導出問題
        question1.createFlameQuestion();

        //ソースコード記述問題
        question1.createSourceQuestion();

    }
}
