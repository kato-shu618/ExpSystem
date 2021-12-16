//������String�^�v�f�𗘗p����N���X

// �V�X�e���J�����邤���Ŏ������邽�߂̃v���O����

//�����̃t�@�C�����Ǘ�����N���X

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    private List<String> filenameList = new ArrayList<>();
    private List<String> QFilenameList = new ArrayList<>();

    //�R���X�g���N�^()
    public Test() {
    }

    //filename��ǉ����郁�\�b�h
    public void addFilename(String... filenames) {
        Collections.addAll(this.filenameList, filenames);
    }

    //�t�@�C�������X�g��Ԃ�
    public List<String> getFilenameList() {
        return filenameList;
    }


    //filenameList���o��
    public void printFilenameList() {
        if (filenameList.size() == 0) {
            System.out.println("�t�@�C�������o�^����Ă��܂���");
        } else {
            for (int i = 0; i < filenameList.size(); i++) {
                System.out.print("FILE:" + i + "->");
                System.out.println(filenameList.get(i));
            }
        }
    }

    //���Ƃ��Ďg�p�������t�@�C����I������
    public void createQFilenameList(int... num){
        for(int i : num){
            Collections.addAll(QFilenameList,filenameList.get(i));
        }
    }

    //QFilenameList���o�͂���
    public void printQFilenameList(){
        if (QFilenameList.size() == 0) {
            System.out.println("�t�@�C�������o�^����Ă��܂���");
        } else {
            for (int i = 0; i < QFilenameList.size(); i++) {
                System.out.print("FILE NUMBER:" + i + "->");
                System.out.println(QFilenameList.get(i));
            }
        }
    }

    //QFilenameList�ɗv�f�ɒǉ�����
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


