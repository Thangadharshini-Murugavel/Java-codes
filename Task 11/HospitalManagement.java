
package scenariobased;

class Hospital {

    String Hospital_Name;
    String Hospital_Location;

    Hospital(String Hospital_Name, String Hospital_Location) {

        this.Hospital_Name = Hospital_Name;
        this.Hospital_Location = Hospital_Location;
    }
}

class Personn extends Hospital {

    String Person_Name;
    int Person_Age;

    Personn(String Hospital_Name, String Hospital_Location,
            String Person_Name, int Person_Age) {

        super(Hospital_Name, Hospital_Location);

        this.Person_Name = Person_Name;
        this.Person_Age = Person_Age;
    }
}

class Doctor extends Personn {

    int Doctor_ID;
    String Dept;

    Doctor(String Hospital_Name, String Hospital_Location,
           String Person_Name, int Person_Age,
           int Doctor_ID, String Dept) {

        super(Hospital_Name, Hospital_Location,
              Person_Name, Person_Age);

        this.Doctor_ID = Doctor_ID;
        this.Dept = Dept;
    }

    public void DisplayDetails() {

        System.out.println("Hospital Name     : " + Hospital_Name);
        System.out.println("Hospital Location : " + Hospital_Location);
        System.out.println("Person Name       : " + Person_Name);
        System.out.println("Person Age        : " + Person_Age);
        System.out.println("Doctor ID         : " + Doctor_ID);
        System.out.println("Department        : " + Dept);
    }
}

public class HospitalManagement {

    public static void main(String[] args) {

        Doctor d = new Doctor(
            "Apollo Hospital",
            "Chennai",
            "Arun",
            35,
            101,
            "Cardiology"
        );

        d.DisplayDetails();
    }
}
