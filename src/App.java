import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String []args) throws IOException{
        int length = readFiles();
        System.out.println(length);
        writeFile(length);
    }

    public static int readFiles() throws FileNotFoundException{
        Scanner s = new Scanner(new File("src\\input.txt"));
        ArrayList<String> list = new ArrayList<String>();
        while (s.hasNext()){
            list.add(s.next());
        }
        s.close();
        int length = list.size();
        return length;
    }

    public static void writeFile(int length)  throws IOException{
        FileWriter writer = new FileWriter("src\\output.txt");
        writer.write("Words in input file: " + length);
        writer.close();
    }
}

