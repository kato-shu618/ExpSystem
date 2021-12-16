// APIのクラス

import java.util.ArrayList;
import java.util.List;

public class Api {
    private List<String> methodNames = new ArrayList<>();
    private List<String> methodWorks = new ArrayList<>();
    public Api(){

    }
    //メソッド名とその振る舞いを設定する
    public void addAPI(String methodName,String methodWork){
        this.methodNames.add(methodName);
        this.methodWorks.add(methodWork);
    }

    //動作確認用メソッド
    public List<String> getMethodNames(){
        return this.methodNames;
    }
    //動作確認用メソッド
    public List<String> getMethodWorks(){
        return this.methodWorks;
    }

    //API仕様を出力するメソッド
    public void printAPI(){
        for(int i = 0; i < methodNames.size();i++){
            System.out.println(methodNames.get(i));
            System.out.println("\t" + methodWorks.get(i));
            System.out.println("----------------");
        }
    }
}
