package pk18;
import  java.io.*;
public class Encryption {
    static void main(String[] args) {

        try {
            FileInputStream fs1 = new FileInputStream("C:\\Users\\DELL\\OneDrive\\Desktop\\one.txt");

            FileOutputStream fs2 =  new FileOutputStream("C:\\Users\\DELL\\OneDrive\\Desktop\\encrypted.txt");
            String key = "1A7&fhI@#9(nx$";
            int avl , j ,k ,keyLen,newVal;

            keyLen = key.length();
            int loc = 0;
            try {
                avl = fs1.available();

                for(int  i = 0;i<avl ;i++){
                    j = fs1.read();
                    k = key.charAt(loc);
                    newVal = j+k;
                    fs2.write(newVal);

                    if(loc==keyLen-1){
                        loc =0;
                    }else{
                        loc++;
                    }
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println(avl);


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}