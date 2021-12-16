//�𓚃N���X��������쐬����v���O����

public class QuestionTest {
    private AnswerTest answer;
    public QuestionTest(AnswerTest answer){
        this.answer = answer;
    }


    //�K�v�ȃ��\�b�h
    //�N���X�}�쐬���->�K�v�ȗv�f|��蕶�A�\�[�X�R�[�h
    public void createClassQuestion(){
        System.out.println("�ȉ��̃\�[�X�R�[�h����N���X�}���쐬���Ȃ����B");
        //�𓚃N���X����K�v�ȃ\�[�X�R�[�h���擾����B
        Test questionSourceCode = this.answer.getProgramFilename();
        //questionSourceCode.printFilenameList();
        questionSourceCode.filePrint();
        //�𓚂Ƃ��āA�N���X�}���擾
        Test questionClassFigure = this.answer.getClassFigureFilename();
        questionClassFigure.printFilenameList();
    }

    //�@�B�I���o���->�K�v�ȗv�f|��蕶�A�N���X�}
    public void createFlameQuestion(){
        System.out.println("�ȉ��̃N���X�}����@�B�I���o�����Ȃ���");
        //�𓚃N���X����N���X�}���擾����B
        Test classFigure = this.answer.getClassFigureFilename();
        //�𓚂Ƃ��āA�@�B�I���o���擾
        Test flameCode = this.answer.getFlameFilename();
    }

    //�\�[�X�R�[�h�쐬���->�K�v�ȗv�f|��蕶�AAPI�d�l
    public void createSourceQuestion(){
        System.out.println("�ȉ���API�d�l����\�[�X�R�[�h���쐬���Ȃ����B");
        //�𓚃N���X����API�d�l���擾����
        Api api = this.answer.getApi();
        api.printAPI();
        //�𓚂Ƃ��āA�\�[�X�R�[�h�擾
        Test sourceCode = this.answer.getProgramFilename();
    }

    //���s���ʗ\�z���->�K�v�ȗv�f|��蕶�A�\�[�X�R�[�h�A�e�X�g�P�[�X
    public void createResultQuestion(){
        System.out.println("�ȉ��̃\�[�X�R�[�h�A���s�m�F�p�v���O������p���Ď��s�����ꍇ�̌��ʂ�\�z���Ȃ����B");
        //�𓚃N���X����\�[�X�R�[�h�A���s�m�F�p�̃v���O�������擾����
        Test sourceCode = this.answer.getProgramFilename();
        Test testCode = this.answer.getTestFilename();
        //�𓚂Ƃ��āAresult���擾����
    }
}
