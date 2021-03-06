package projectparta;

import java.util.ArrayList;
import java.util.Date;

public class Assignment {

    private String tittle;
    private String description;
    private Date subDateTime;   
    private int oralMark;
    private int totalMark;

    public Assignment (String tittle, String description, Date subDateTime) {
        if ((tittle.length() != 0) && (description.length() != 0)
                && (oralMark >= 0) && (oralMark <= 100) && (totalMark >= 0) && (totalMark <= 100)) {
            this.tittle = tittle;
            this.description = description;
            this.subDateTime = subDateTime;           
        }
    }

    public void setTittle(String tittle) {
        if (tittle.length() != 0) {
        this.tittle = tittle;
        }
    }

    public void setDescription(String description) {
        if (description.length() != 0) {
        this.description = description;
        }
    }

    public void setSubDateTime(Date subDateTime) {
        this.subDateTime = subDateTime;
    }

    public void setOralMark(int oralMark) {
        if (oralMark >= 0) {
        this.oralMark = oralMark;
        }
    }

    public void setTotalMark(int totalMark) {
        if (totalMark >= 0) {
        this.totalMark = totalMark;
        }
    }    
    
    public String getTittle() {
        return tittle;
    }

    public String getDescription() {
        return description;
    }

    public Date getSubDateTime() {
        return subDateTime;
    }

    public int getOralMark() {
        return oralMark;
    }

    public int getTotalMark() {
        return totalMark;
    }  
    
    public void printInfo () {
         System.out.println("Assignment's Information");
         System.out.println("Tittle: "+this.tittle);
         System.out.println("Description: "+this.description);        
         
     }     
    
}
