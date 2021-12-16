//Answerクラスのテストケース(解答の要素を登録する)


public class TestCase {
    public static void main(String[] args) {
        Api api = new Api();
        api.addAPI("Student","コンストラクタです。引数(price:int)は価格です。\n\t価格(引数:price)をインスタンス変数priceに代入します。");
        api.addAPI("getItem","品名を返却します。\n\tインスタンス変数itemを返却します。");
        api.printAPI();

        Practice1 answer1 = new Practice1();
        answer1.setClassFigureFile("Student1.java","StudentList.java","StudentManager.java");
        Test classFilenames = answer1.getClassFigureFile();
        classFilenames.printFilenameList();

    }
}
