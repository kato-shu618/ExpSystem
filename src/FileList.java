//複数のString型要素を利用するクラス

// システム開発するうえで実験するためのプログラム

//複数のファイル名を管理するクラス

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FileList {
        private List<String> fileList = new ArrayList<>();

        //コンストラクタ()
        public FileList() {
        }

        //filenameを追加するメソッド
        public void addFilename(String... filenames) {
            Collections.addAll(this.fileList, filenames);
        }

        //ファイル名リストを返す
        public List<String> getFilenameList() {
            return this.fileList;
        }


        //filenameListを出力
        public void printFilenameList() {
            if (this.fileList.size() == 0) {
                System.out.println("ファイル名が登録されていません");
            } else {
                for (int i = 0; i < this.fileList.size(); i++) {
                    System.out.print("FILE:" + i + "->");
                    System.out.println(this.fileList.get(i));
                }
            }
        }

        //ファイルの中身を読み取って表示するメソッド
        public void filePrint(){
            String fileContents = null;
            for(String filename : this.fileList){
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
