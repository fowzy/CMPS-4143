import java.io.File;

class FileListing {    
    public static void main(String[] args) {
        File file = null;
        String [] paths;

        try{
            file = new File ("/home/fowzy/Desktop/");
            paths = file.list();
            for(String path:paths){
                System.out.println(paths);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}