import java.io.PrintWriter;
//import java.nio.file.FileSystemNotFoundException;

public class Task2 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        sb.append("Test".repeat(100));
        try(PrintWriter pw=new PrintWriter("Task2.txt")){
pw.print(sb);
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }
}
