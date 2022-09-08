package coppy_file;

import java.io.*;
import java.nio.file.FileAlreadyExistsException;
import java.util.ArrayList;
import java.util.List;
public class CoppyFile {
    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<String> list = readAndWriteFile.readFile("D:\\BaiTap\\module2\\TEXT FILE\\src\\coppy_file\\source.txt");
        for (String e : list){
            readAndWriteFile.writeFile("src/coppy_file/target_file.txt",e);
        }
    }
}
