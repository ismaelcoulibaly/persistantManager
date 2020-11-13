import annotations.Bean;
import annotations.BeanList;
import annotations.Ignore;

import java.util.ArrayList;
import java.util.List;

@Bean(table ="cours", primaryKey="coursid",listMyInstance = "listeCours")
public class Cours {
    /********* Variables instances *********/
    private int coursid;
    private String nameCours;
    private String sigle;
    private String description;

    @Ignore
    public static List<Cours> listeCours = new ArrayList<>();

    @BeanList
    private List<Inscription> inscriptions = new ArrayList<>();

    /************* Constructor *************/
    public Cours(int coursid, String nameCours, String sigle, String description){
        this.coursid = coursid;
        this.nameCours = nameCours;
        this.sigle = sigle;
        this.description = description;
    }

    /************ Getter & Setter **********/
    public int getCoursid() {
        return coursid;
    }

    public void setCoursid(int coursid) {
        this.coursid = coursid;
    }

    public String getNameCours() {
        return nameCours;
    }

    public void setNameCours(String nameCours) {
        this.nameCours = nameCours;
    }

    public String getSigle() {
        return sigle;
    }

    public void setSigle(String sigle) {
        this.sigle = sigle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
