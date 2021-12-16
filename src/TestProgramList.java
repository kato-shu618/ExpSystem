// プログラムを管理するクラス
//複数のソースコードのパスを登録できるようにする。

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestProgramList {
    private List<String> programList = new ArrayList<>();
    private List<String> useProgramList = new ArrayList<>();

    //コンストラクタで使用するソースコードのファイル名を登録
    public TestProgramList(String... programFile) {
        Collections.addAll(programList, programFile);
    }

    //(テスト用)登録されたファイル名を出力するメソッド
    public void printProgramFilename() {
        if (programList.size() == 0) {
            System.out.println("Error:No file");
        } else {
            for (int i = 0; i < programList.size(); i++) {
                System.out.print("FILE NUMBER:" + (i) + "->");
                System.out.println(programList.get(i));
            }
        }
    }

    //問題に使用するソースコードを選択する(後々キーボード入力の方がいいかも)
    public List<String> choseProgram(int... i) {
        try {
            for (int num : i) {
                useProgramList.add(programList.get(num));
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("ファイル番号を選択してください");
        }
        return useProgramList;
    }

    //（テスト用）問題として使用するソースコードを出力
    public void printUseProgramList(){
        if(useProgramList.size() == 0){
            System.out.println("問題として登録されているソースコードがありません");
        }else{
            for (String filename : useProgramList){
                System.out.println(filename);
            }
        }
    }
}
