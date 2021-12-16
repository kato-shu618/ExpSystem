//�𓚃N���X��������쐬����v���O����

public class Question{
    private Answer answer;
    public Question(Answer answer){
        this.answer = answer;
    }

    //�K�v�ȃ��\�b�h
    //�N���X�}�쐬���->�K�v�ȗv�f|��蕶�A�\�[�X�R�[�h
    public void createClassQuestion(){
        System.out.println("���⁄�ȉ��̃\�[�X�R�[�h����N���X�}���쐬���Ȃ����B");
        //�𓚃N���X����K�v�ȃ\�[�X�R�[�h���擾����B
        FileList qSourceCode = this.answer.getProgramFilename();
        qSourceCode.filePrint();
        //�𓚂Ƃ��āA�N���X�}���擾
        System.out.println("���𓚁�");
        FileList qClassFigure = this.answer.getClassFigureFilename();
        qClassFigure.printFilenameList();
    }

    //�@�B�I���o���->�K�v�ȗv�f|��蕶�A�N���X�}
    public void createFlameQuestion(){
        System.out.println("���⁄�ȉ��̃N���X�}����@�B�I���o�����Ȃ���");
        //�𓚃N���X����N���X�}���擾����B
        FileList classFigure = this.answer.getClassFigureFilename();
        classFigure.printFilenameList();
        //�𓚂Ƃ��āA�@�B�I���o���擾
        FileList flameCode = this.answer.getFlameFilename();
        System.out.println("���𓚁�");
        flameCode.filePrint();
    }

    //�\�[�X�R�[�h�쐬���->�K�v�ȗv�f|��蕶�AAPI�d�l�A�N���X�}
    public void createSourceQuestion(){
        System.out.println("���⁄�ȉ���API�d�l�ƃN���X�}����\�[�X�R�[�h���쐬���Ȃ����B");
        //�𓚃N���X����API�d�l���擾����
        Api api = this.answer.getApi();
        api.printAPI();
        FileList classFileList = this.answer.getClassFigureFilename();
        classFileList.printFilenameList();
        //�𓚂Ƃ��āA�\�[�X�R�[�h�擾
        System.out.println("���𓚁�");
        FileList sourceCode = this.answer.getProgramFilename();
        sourceCode.filePrint();
    }

    //���s���ʗ\�z���->�K�v�ȗv�f|��蕶�A�\�[�X�R�[�h�A�e�X�g�P�[�X
    public void createResultQuestion(){
        System.out.println("���⁄�ȉ��̃\�[�X�R�[�h�A���s�m�F�p�v���O������p���Ď��s�����ꍇ�̌��ʂ�\�z���Ȃ����B");
        //�𓚃N���X����\�[�X�R�[�h�A���s�m�F�p�̃v���O�������擾����
        FileList sourceCode = this.answer.getProgramFilename();
        sourceCode.filePrint();
        System.out.println("���s�m�F�p�v���O����");
        FileList testCode = this.answer.getTestFilename();
        testCode.filePrint();
        //�𓚂Ƃ��āAresult���擾����
        System.out.println("���𓚁�");
        System.out.println(this.answer.getResult());
    }
}
