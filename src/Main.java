public class Main {
    public static void main(String[] args) {
        Answer answer1 = new Answer();
        answer1.setApi("CoinBox", "コンストラクタです");
        answer1.setApi("add", "CoinBoxオブジェクトにValueオブジェクトを入れます");
        answer1.setApi("remove", "CoinBoxオブジェクトに入っているValueオブジェクトを返し、削除します。");
        answer1.setApi("size", "CoinBoxオブジェクト内にあるValueオブジェクトの個数を返します。");
        answer1.setApi("getSum", "CoinBoxオブジェクトに入っているValueオブジェクトの価値の合計を返却します");
        answer1.setApi("print","全てのValueオブジェクトの価値を出力します。");

        answer1.setClassFigureFilename("classFigure1","classFigure2");
        answer1.setProgramFilename("Value.java","Wallet.java","Coin100.java","Coin50.java","Bill1000.java");
        answer1.setFlameFilename("Wallet.txt","Coin100.txt","Coin50.txt","Bill1000.txt");
        answer1.setTestFilename("C1_1.java");


        Question question1 = new Question(answer1);
        //クラス図記述問題
        question1.createClassQuestion();

        //機械的導出問題
        //question1.createFlameQuestion();

        //ソースコード記述問題
        //question1.createSourceQuestion();

        //実行結果予想問題
        //answer1.setResult("財布の中身は1250です。");
        //question1.createResultQuestion();
    }
}
