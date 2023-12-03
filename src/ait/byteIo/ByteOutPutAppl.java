package ait.byteIo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteOutPutAppl {
    public static void main(String[] args) {
         try ( FileOutputStream fout=new FileOutputStream(new File("C:\\Users\\mmaks\\IdeaProjects\\Lesson_57_BiteIO\\dest\\test\\newFile"))){
       fout.write(57);
       fout.write(67);
       fout.write(257);
       fout.write(59);
       fout.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
