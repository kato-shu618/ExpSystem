// �v���O�������Ǘ�����N���X
//�����̃\�[�X�R�[�h�̃p�X��o�^�ł���悤�ɂ���B

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestProgramList {
    private List<String> programList = new ArrayList<>();
    private List<String> useProgramList = new ArrayList<>();

    //�R���X�g���N�^�Ŏg�p����\�[�X�R�[�h�̃t�@�C������o�^
    public TestProgramList(String... programFile) {
        Collections.addAll(programList, programFile);
    }

    //(�e�X�g�p)�o�^���ꂽ�t�@�C�������o�͂��郁�\�b�h
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

    //���Ɏg�p����\�[�X�R�[�h��I������(��X�L�[�{�[�h���͂̕�����������)
    public List<String> choseProgram(int... i) {
        try {
            for (int num : i) {
                useProgramList.add(programList.get(num));
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("�t�@�C���ԍ���I�����Ă�������");
        }
        return useProgramList;
    }

    //�i�e�X�g�p�j���Ƃ��Ďg�p����\�[�X�R�[�h���o��
    public void printUseProgramList(){
        if(useProgramList.size() == 0){
            System.out.println("���Ƃ��ēo�^����Ă���\�[�X�R�[�h������܂���");
        }else{
            for (String filename : useProgramList){
                System.out.println(filename);
            }
        }
    }
}
