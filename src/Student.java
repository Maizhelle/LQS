/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mcija
 */
public class Student {
    private String Name;
    private String Id;
    
    //constructor so a student MUST have these :>
    public Student(String name, String id) {
        this.Name = name;
        this.Id = id;
    }

    //getters yuh
    public String getName() {
        return Name;
    }

    public String getId() {
        return Id;
    }
}

