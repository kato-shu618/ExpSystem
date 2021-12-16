
// �𓚂�o�^����N���X
public class Answer {
    private FileList classFigureFilename = new FileList();
    private FileList programFilename = new FileList();
    private FileList flameFilename = new FileList();
    private FileList testFilename = new FileList();
    private Api api = new Api();
    private String comment;
    private String explain;
    private String result;

    public Answer() {

    }
    //�N���X�}�o�^�A�擾���\�b�h
    public void setClassFigureFilename(String... classFigureFilenames){
        this.classFigureFilename.addFilename(classFigureFilenames);
    }
    public FileList getClassFigureFilename(){
        return this.classFigureFilename;
    }

    //�\�[�X�R�[�h��o�^�A�擾���\�b�h
    public void setProgramFilename(String... programFilenames){
        this.programFilename.addFilename(programFilenames);
    }
    public FileList getProgramFilename(){
        return this.programFilename;
    }

    //�@�B�I���o�̓o�^�A�擾���\�b�h
    public void setFlameFilename(String... flameFilenames){
        this.flameFilename.addFilename(flameFilenames);
    }
    public FileList getFlameFilename(){
        return this.flameFilename;
    }

    //���s�m�F�v���O�����̓o�^�A�擾���\�b�h
    public void setTestFilename(String... testFilenames){
        this.testFilename.addFilename(testFilenames);
    }
    public FileList getTestFilename(){
        return this.testFilename;
    }

    //API�d�l��o�^�A�擾���郁�\�b�h
    public void setApi(String methodName,String methodWork){
        this.api.addAPI(methodName,methodWork);
    }
    public Api getApi(){
        return this.api;
    }

    public String getComment() {
        return this.comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getExplain() {
        return this.explain;
    }

    public void setExplain(String explain) {
        this.explain = explain;
    }

    public String getResult() {
        return this.result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}

