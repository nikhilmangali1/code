import java.io.File;
public class FileClass1 {
    public static void main(String[] args) {
        File f=new File("C:/Users/Nikhil/Documents/code/java programs/basic/IO Streams");
        System.out.println(f.isDirectory());
        File ff[]=f.listFiles();
        for(File k:ff)
        {
            System.out.println(k.getName()+"\t"+k.getPath()+"\t"+k.getParent());
        }
        String[] list=f.list();
        for(String s:list)
        {
            System.out.println(s);
        }
    }
}
