/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentinfo;

/**
 *
 * @author arshc
 */
public class Studentinfo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Student [] students = new Student [5];
        students[0] = new Student("Arsh");
        students[1] = new Student("charlie");
        students[2] = new Student("jacky");
        students[3] = new Student("Tom");
        students[4] = new Student("jerry");

        for (Student student : students) {
            System.out.println(student.getName());
        }
    }
}
        
        // TODO code application logic here
    }
    
}
