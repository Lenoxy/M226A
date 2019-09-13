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

    private static int sAnzahlPersonen = 0;


    public Person(){
        this.setM_PersNr(-1);
        this.setM_Anrede("Frau");
        this.setM_Name("Neue Person");
        this.setM_Vorname("");
        this.setM_PLZ("6000");
        this.setM_EintrittsjahrAuto();
        this.setM_Salaer(5000);
        this.setM_Pensum(100);
        this.countPersonen();
    }

    public Person(String m_Anrede, String m_Name, String m_Vorname){
        this.setM_Anrede(m_Anrede);
        this.setM_Name(m_Name);
        this.setM_Vorname(m_Vorname);
        this.countPersonen();
    }

    public Person(String m_Name, String m_Vorname, int m_Eintrittsjahr){
        this.setM_Name(m_Name);
        this.setM_Vorname(m_Vorname);
        this.setM_Eintrittsjahr(m_Eintrittsjahr);
        this.countPersonen();
    }

    private static double calculateLohn(double salaer, double pensum){
        return (salaer / 100) * pensum;
    }

    private double calculateLohn(){
        return (m_Salaer / 100) * m_Pensum;
    }

    private void countPersonen(){
        Person.sAnzahlPersonen++;
        this.setM_PersNr(sAnzahlPersonen);
    }








    public int getM_PersNr(){
        return m_PersNr;
    }

    private void setM_PersNr(int m_PersNr) {
        this.m_PersNr = m_PersNr;
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

    public void setM_EintrittsjahrAuto(){
        if(m_Eintrittsjahr >= 1975 && m_Eintrittsjahr <= 2019){
            this.m_Eintrittsjahr = Calendar.YEAR;
        }
    }

    public void setM_Eintrittsjahr(int m_Eintrittsjahr){
        this.m_Eintrittsjahr = m_Eintrittsjahr;
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
