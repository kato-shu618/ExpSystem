// �𓚂�o�^����N���X
public class AnswerTest {
    private Test classFigureFilename = new Test();
    private Test programFilename = new Test();
    private Test flameFilename = new Test();
    private Test testFilename = new Test();
    private Api api = new Api();
    //private String comment;
    //private String explain;
    //private String result;

    public AnswerTest() {

    }
    //�N���X�}�o�^�A�擾���\�b�h
    public void setClassFigureFilename(String... classFigureFilenames){
        this.classFigureFilename.addFilename(classFigureFilenames);
    }
    public Test getClassFigureFilename(){
        return this.classFigureFilename;
    }

    //�\�[�X�R�[�h��o�^�A�擾���\�b�h
    public void setProgramFilename(String... programFilenames){
        this.programFilename.addFilename(programFilenames);
    }
    public Test getProgramFilename(){
        return this.programFilename;
    }

    //�@�B�I���o�̓o�^�A�擾���\�b�h
    public void setFlameFilename(String... flameFilenames){
        this.flameFilename.addFilename(flameFilenames);
    }
    public Test getFlameFilename(){
        return this.flameFilename;
    }

    //���s�m�F�v���O�����̓o�^�A�擾���\�b�h
    public void setTestFilename(String... testFilenames){
        this.testFilename.addFilename(testFilenames);
    }
    public Test getTestFilename(){
        return this.testFilename;
    }

    //API�d�l��o�^�A�擾���郁�\�b�h
    public void setApi(String methodName,String methodWork){
        this.api.addAPI(methodName,methodWork);
    }
    public Api getApi(){
        return this.api;
    }
}

