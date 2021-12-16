//������String�^�v�f�𗘗p����N���X

// �V�X�e���J�����邤���Ŏ������邽�߂̃v���O����

//�����̃t�@�C�������Ǘ�����N���X

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FileList {
        private List<String> fileList = new ArrayList<>();

        //�R���X�g���N�^()
        public FileList() {
        }

        //filename��ǉ����郁�\�b�h
        public void addFilename(String... filenames) {
            Collections.addAll(this.fileList, filenames);
        }

        //�t�@�C�������X�g��Ԃ�
        public List<String> getFilenameList() {
            return this.fileList;
        }


        //filenameList���o��
        public void printFilenameList() {
            if (this.fileList.size() == 0) {
                System.out.println("�t�@�C�������o�^����Ă��܂���");
            } else {
                for (int i = 0; i < this.fileList.size(); i++) {
                    System.out.print("FILE:" + i + "->");
                    System.out.println(this.fileList.get(i));
                }
            }
        }

        //�t�@�C���̒��g��ǂݎ���ĕ\�����郁�\�b�h
        public void filePrint(){
            String fileContents = null;
            for(String filename : this.fileList){
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
