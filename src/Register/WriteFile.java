/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Register;

import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author kz
 */

public class WriteFile extends CreateFile{
   public void writer(){
        try {
            CreateFile();
            try (FileWriter myWriter = new FileWriter("account/"+getNames()+".txt")) {
                myWriter.write("Name : "+getNames());
                myWriter.write("\n");
                myWriter.write("User : "+getUsers());
                myWriter.write("\n");
                myWriter.write("Password : "+getPass());
                myWriter.write("\n");
                myWriter.write("ID_Card : "+getID_Card());
                myWriter.write("\n");
                myWriter.write("Email : "+getEmail());
                myWriter.write("\n");
                myWriter.write("Nationality : "+getNationality());
                myWriter.write("\n");
                myWriter.write("Phone : "+getPhone());
                myWriter.write("\n");
                myWriter.write("Address : "+getAddress());
                myWriter.write("\n");
                
                System.out.println(getNames());
            }
          System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
          System.out.println("An error occurred.");
        }
    }
}
