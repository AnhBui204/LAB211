
package Model;

public class Doctor{

    public String code;
    public String DocName;
    public String Specialization;
    public int Availability;

    public Doctor() {
    }

    public Doctor(String code, String DocName, String Specialization, int Availability) {
        this.code = code;
        this.DocName = DocName;
        this.Specialization = Specialization;
        this.Availability = Availability;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDocName() {
        return DocName;
    }

    public void setDocName(String DocName) {
        this.DocName = DocName;
    }

    public String getSpecialization() {
        return Specialization;
    }

    public void setSpecialization(String Specialization) {
        this.Specialization = Specialization;
    }

    public int getAvailability() {
        return Availability;
    }

    public void setAvailability(int Availability) {
        this.Availability = Availability;
    }

    @Override
    public String toString() {
        return "DocCode " + code + " | DocName " + DocName + " | Specialization " + Specialization + " | Availability " + Availability;
    }
    
  
}
