public class Main {
    public static void main(String[] args) {
        Answer answer1 = new Answer();
        answer1.setApi("CoinBox", "�R���X�g���N�^�ł�");
        answer1.setApi("add", "CoinBox�I�u�W�F�N�g��Value�I�u�W�F�N�g�����܂�");
        answer1.setApi("remove", "CoinBox�I�u�W�F�N�g�ɓ����Ă���Value�I�u�W�F�N�g��Ԃ��A�폜���܂��B");
        answer1.setApi("size", "CoinBox�I�u�W�F�N�g���ɂ���Value�I�u�W�F�N�g�̌���Ԃ��܂��B");
        answer1.setApi("getSum", "CoinBox�I�u�W�F�N�g�ɓ����Ă���Value�I�u�W�F�N�g�̉��l�̍��v��ԋp���܂�");
        answer1.setApi("print","�S�Ă�Value�I�u�W�F�N�g�̉��l���o�͂��܂��B");

        answer1.setClassFigureFilename("classFigure1","classFigure2");
        answer1.setProgramFilename("Value.java","Wallet.java","Coin100.java","Coin50.java","Bill1000.java");
        answer1.setFlameFilename("Wallet.txt","Coin100.txt","Coin50.txt","Bill1000.txt");
        answer1.setTestFilename("C1_1.java");


        Question question1 = new Question(answer1);
        //�N���X�}�L�q���
        question1.createClassQuestion();

        //�@�B�I���o���
        //question1.createFlameQuestion();

        //�\�[�X�R�[�h�L�q���
        //question1.createSourceQuestion();

        //���s���ʗ\�z���
        //answer1.setResult("���z�̒��g��1250�ł��B");
        //question1.createResultQuestion();
    }
}
