package DZ7.ExceptionTasks;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FirstTask {

    BufferedReader reader = null;

    public void readFile(){
        try{
            reader = new BufferedReader(new FileReader("Data.txt"));

            String line = null;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
        }catch(IOException e){
            System.out.println("Файл не найден");
        }
        finally{
            try {
                if (reader != null) {
                    reader.close();
                }
                }catch(IOException e){
                System.out.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        FirstTask test = new FirstTask();
        test.readFile();
    }
}
