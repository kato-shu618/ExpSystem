//複数のString型要素を利用するクラス

// システム開発するうえで実験するためのプログラム

//複数のファイルを管理するクラス

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    private List<String> filenameList = new ArrayList<>();
    private List<String> QFilenameList = new ArrayList<>();

    //コンストラクタ()
    public Test() {
    }

    //filenameを追加するメソッド
    public void addFilename(String... filenames) {
        Collections.addAll(this.filenameList, filenames);
    }

    //ファイル名リストを返す
    public List<String> getFilenameList() {
        return filenameList;
    }


    //filenameListを出力
    public void printFilenameList() {
        if (filenameList.size() == 0) {
            System.out.println("ファイル名が登録されていません");
        } else {
            for (int i = 0; i < filenameList.size(); i++) {
                System.out.print("FILE:" + i + "->");
                System.out.println(filenameList.get(i));
            }
        }
    }

    //問題として使用したいファイルを選択する
    public void createQFilenameList(int... num){
        for(int i : num){
            Collections.addAll(QFilenameList,filenameList.get(i));
        }
    }

    //QFilenameListを出力する
    public void printQFilenameList(){
        if (QFilenameList.size() == 0) {
            System.out.println("ファイル名が登録されていません");
        } else {
            for (int i = 0; i < QFilenameList.size(); i++) {
                System.out.print("FILE NUMBER:" + i + "->");
                System.out.println(QFilenameList.get(i));
            }
        }
    }

    //QFilenameListに要素に追加する
    public void addQFilenameList(String filename){
        QFilenameList.add(filename);
    }
    public void filePrint(){
        String fileContents = null;
        for(String filename : filenameList){
            try{
                fileContents = FilePrinter.filePrint(new File(filename));
            }catch (IOException e){
                e.printStackTrace();
            }
            System.out.println("---------------------------------------------------");
            System.out.println(fileContents);
            System.out.println("---------------------------------------------------");
        }
    }
}


