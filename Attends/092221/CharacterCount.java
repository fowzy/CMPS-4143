import java.io.*;

public class CharacterCount {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        FileInputStream in;
        try{
            //String fName = 'sample.txt';
            in = new FileInputStream("sample.txt");
            int count=0;
            while (in.read() !=-1 ){
                count++;
            }
            System.out.println("Total characters are "+ count);
        }
        catch(FileNotFoundException e1){
            System.out.println("sample.txt is not found!");
            e1.printStackTrace();
        }
        catch(IOException e2){
            System.out.println("There might be some errors!");
            e2.printStackTrace();
        }
        finally{

        }
    }
}
