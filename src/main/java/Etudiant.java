import annotations.Bean;
import annotations.BeanList;
import annotations.Ignore;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Bean(table = "etudiant", primaryKey = "etudiantid", listMyInstance = "listeEtudiants")
public class Etudiant {
    /********* Variables instances *********/
    private int etudiantid;
    private String fname;
    private String lname;
    private int age;

    @Ignore
    public static final ArrayList<Etudiant> listeEtudiants = new ArrayList<>();

    @BeanList
    public ArrayList<Inscription> inscriptions = new ArrayList<>();


    /*********** Constructors **************/
    public Etudiant(String fname, String lname, int age) {
        this.fname = fname;
        this.lname = lname;
        this.age = age;
        // Ne Considerer Que les saisies Correctes
        if(fname != null && lname != null)
            listeEtudiants.add(this);
    }

    public Etudiant(){

        listeEtudiants.add(this);
    }

    /********** Getter & Setter ***********/
    public int getEtudiantid() {
        return etudiantid;
    }

    public void setEtudiantid(int etudiantid) {
        this.etudiantid = etudiantid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<Inscription> getInscriptions() {
        return inscriptions;
    }

    public void setInscriptions(ArrayList<Inscription> inscriptions) {
        this.inscriptions = inscriptions;
    }

    @Override
    public String toString() {

        return "Etudiant : " + etudiantid + " - " + fname + " " + lname + " a " + age;
    }
}

