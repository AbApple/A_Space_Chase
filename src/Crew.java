import java.util.*;
import java.io.*;
public class Crew {
    String name;
    String role;
    String ID;
    int sus_lvl = 0;
    String ephrase;
    String sphrase;
    String[] general_Log = {"Lookin' good.", "Ready to go!", "All set!!", 
        "Up and ready.", "Clear down here.", "This place isn't so bad."};

    Crew(String r, String n, String i, String p, String s){
        this.name = n;
        this.role = r; 
        this.ID = i;
        this.ephrase = p;
        this.sphrase = s;
        // char s = role.charAt(0);
        // switch(s){
        //     case 'C':
        //     {

        //     }
        // }
    }
    @Override
    public String toString() {
        String s = role + " " + name; 
        // TODO Auto-generated method stub
        // return super.toString();
        return s;
    }

    
}
