package pk18;
import java.io.*;

public class Start {
    static void main(String[] args) {
    try{
        FileInputStream fs1 = new FileInputStream("C:\\Users\\DELL\\OneDrive\\Desktop\\one.txt");
        FileInputStream fs2 = new FileInputStream("C:\\Users\\DELL\\OneDrive\\Desktop\\two.txt");
        FileOutputStream fs3 = new FileOutputStream("C:\\Users\\DELL\\OneDrive\\Desktop\\three.txt");

        int i , j , k , avl , l;
        try {
            avl = fs2.available();

            for(i = 0;i<avl;i++){
                j = fs2.read();
                if(j!= 32){
                    System.out.print((char)j);
                    fs3.write(j);
                }else {
                    k = fs1.read();
                    if(k!=32) {
                        System.out.print((char) k);
                        fs3.write(k);
                        System.out.print((char) j);
                        fs3.write(j);
                    }else{
                        k = fs1.read();
                        System.out.print((char) k);
                        fs3.write(k);
                        System.out.print((char) j);
                        fs3.write(j);

                    }

                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

   }
    catch (FileNotFoundException e) {
    throw new RuntimeException(e);
    }
    }
}
