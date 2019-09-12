import java.util.Calendar;

public class Person{
    private int m_PersNr;
    private String m_Anrede;
    private String m_Name;
    private String m_Vorname;
    private String m_PLZ;
    private String m_Ort;
    private int m_Eintrittsjahr;
    private double m_Salaer;
    private double m_Pensum;


    void Person(){
        this.m_PersNr = -1;
        this.setM_Anrede("Frau");
        this.setM_Name("Neue Person");
        this.setM_Vorname("");
        this.setM_PLZ("6000");
        this.setM_Eintrittsjahr();
        this.setM_Salaer(5000);
        this.setM_Pensum(100);
    }



    public int getM_PersNr(){
        return m_PersNr;
    }

    public String getM_Anrede(){
        return m_Anrede;
    }

    public void setM_Anrede(String m_Anrede){
        this.m_Anrede = m_Anrede;
    }

    public String getM_Name(){
        return m_Name;
    }

    public void setM_Name(String m_Name){
        this.m_Name = m_Name;
    }

    public String getM_Vorname(){
        return m_Vorname;
    }

    public void setM_Vorname(String m_Vorname){
        this.m_Vorname = m_Vorname;
    }

    public String getM_PLZ(){
        return m_PLZ;
    }

    public void setM_PLZ(String m_PLZ){
        this.m_PLZ = m_PLZ;
    }

    public String getM_Ort(){
        return m_Ort;
    }

    public void setM_Ort(String m_Ort){
        this.m_Ort = m_Ort;
    }

    public int getM_Eintrittsjahr(){
        return m_Eintrittsjahr;
    }

    public void setM_Eintrittsjahr(){
        if(m_Eintrittsjahr >= 1975 && m_Eintrittsjahr <= 2019){
            this.m_Eintrittsjahr = Calendar.YEAR;
        }
    }

    public double getM_Salaer(){
        return m_Salaer;
    }

    public void setM_Salaer(double m_Salaer){
        if(m_Salaer >= 0 && m_Salaer <= 99999.95){
            this.m_Salaer = m_Salaer;
        }
    }

    public double getM_Pensum(){
        return m_Pensum;
    }

    public void setM_Pensum(double m_Pensum){
        this.m_Pensum = m_Pensum;
    }
}
