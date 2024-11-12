package lab12;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ex1 {
    public static void main(String[] args) {
        try (FileInputStream in = new FileInputStream("input.txt");
             FileOutputStream out  =  new FileOutputStream("output.txt")){
            byte[] buf = new byte[in.available()];
            in.read(buf,0, buf.length);
            out.write(buf,0, buf.length);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
