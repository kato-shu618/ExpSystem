//�𓚂���͂��郁�C��

public class AnswerTestCase {
    public static void main(String[] args) {
        Answer answer1 = new Answer();
        answer1.setApi("Student", "�R���X�g���N�^�ł��D�u�w���v��id������id�ŁC���O������name�œn���܂��D\n\t���ꂼ��C�C���X�^���X�ϐ�id�Cname�ɑ�����܂�");
        answer1.setApi("getId", "�u�w���v��id��Ԃ��܂��D");
        answer1.setApi("setId", "�u�w���v��id��ύX���܂��D");
        answer1.setApi("getName", "�u�w���v�̖��O��Ԃ��܂��D");
        answer1.setApi("setName", "�u�w���v�̖��O��ύX���܂��D");
        //answer1.getApi().printAPI();

        answer1.setClassFigureFilename("classFigure1","classFigure2");
        answer1.setProgramFilename("Student.java","StudentList.java");
        answer1.setFlameFilename("Value.txt","Coin50.txt","Coin100.txt","Coin1000.txt","CoinBox.txt");
        answer1.setTestFilename("C1_1.java");

        //System.out.println("�N���X�}�ꗗ");
        //answer1.getClassFigureFilename().printFilenameList();

        //System.out.println("\n�\�[�X�R�[�h�ꗗ");
        //answer1.getProgramFilename().printFilenameList();

        //System.out.println("\n�@�B�I���o�ꗗ");
        //answer1.getFlameFilename().printFilenameList();

        //System.out.println("\n����m�F�p�R�[�h�ꗗ");
        //answer1.getTestFilename().printFilenameList();

        Question question1 = new Question(answer1);
        //�N���X�}�L�q���
        question1.createClassQuestion();

        //�@�B�I���o���
        question1.createFlameQuestion();

        //�\�[�X�R�[�h�L�q���
        question1.createSourceQuestion();

    }
}
