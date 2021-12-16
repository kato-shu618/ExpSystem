// API�̃N���X

import java.util.ArrayList;
import java.util.List;

public class Api {
    private List<String> methodNames = new ArrayList<>();
    private List<String> methodWorks = new ArrayList<>();
    public Api(){

    }
    //���\�b�h���Ƃ��̐U�镑����ݒ肷��
    public void addAPI(String methodName,String methodWork){
        this.methodNames.add(methodName);
        this.methodWorks.add(methodWork);
    }

    //����m�F�p���\�b�h
    public List<String> getMethodNames(){
        return this.methodNames;
    }
    //����m�F�p���\�b�h
    public List<String> getMethodWorks(){
        return this.methodWorks;
    }

    //API�d�l���o�͂��郁�\�b�h
    public void printAPI(){
        for(int i = 0; i < methodNames.size();i++){
            System.out.println(methodNames.get(i));
            System.out.println("\t" + methodWorks.get(i));
            System.out.println("----------------");
        }
    }
}
