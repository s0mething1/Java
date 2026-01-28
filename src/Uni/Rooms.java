package Uni;

import java.sql.Time;
import java.util.ArrayList;

public class Rooms {
    protected int roomNumber;
    protected Teachers teacher;
    protected boolean available;
    private static int counter = 0;
    Rooms(){
       this.roomNumber = counter++;
    }
    Rooms(Teachers teacher) {
        this.roomNumber = counter++;
        this.teacher = teacher;
    }
    public void takeRoom(Teachers teacher) {
         if(this.available) {
             this.teacher = teacher;
             this.available = false;
         } else {
             System.out.println(this.roomNumber + " is taken by " + this.teacher.getName());
         }
    }
    public void freeRoom() {
        if(this.isAvailable()) {
            System.out.println("Room #" + this.roomNumber + " was available");
        } else {
            this.available = true;
            System.out.println("Now room #" + this.roomNumber + " is available");
        }
    }
    public boolean isAvailable() {
        if(this.available) {
            return true;
        } else {
            return false;
        }
    }
}
