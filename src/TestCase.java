//Answer�N���X�̃e�X�g�P�[�X(�𓚂̗v�f��o�^����)


public class TestCase {
    public static void main(String[] args) {
        Api api = new Api();
        api.addAPI("Student","�R���X�g���N�^�ł��B����(price:int)�͉��i�ł��B\n\t���i(����:price)���C���X�^���X�ϐ�price�ɑ�����܂��B");
        api.addAPI("getItem","�i����ԋp���܂��B\n\t�C���X�^���X�ϐ�item��ԋp���܂��B");
        api.printAPI();

        Practice1 answer1 = new Practice1();
        answer1.setClassFigureFile("Student1.java","StudentList.java","StudentManager.java");
        Test classFilenames = answer1.getClassFigureFile();
        classFilenames.printFilenameList();

    }
}
