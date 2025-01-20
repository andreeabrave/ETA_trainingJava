package VariabilaMetoda;

import com.google.errorprone.annotations.Var;
import org.testng.annotations.Test;

import java.sql.SQLOutput;

public class Student {

    public String Nume;

    public String Prenume;

    public Integer Varsta;

    public String Adresa;

    public Double Inaltime;

    public Float Greutate;

    public Character Sex;

    public Boolean AreDiploma;


    @Test
    public void prezentareStudent() {
        Nume = "Muresan";
        Prenume = "Andreea";
        Varsta = 32;
        Adresa = "Sobarilor 38A";
        Inaltime = 1.76;
        Greutate = 80.1f;
        Sex = 'F';
        AreDiploma = true;

        System.out.println("Nume student: " + Nume);
        System.out.println("Prenume student: " + Prenume);
        System.out.println("Varsta student: " + Varsta);
        System.out.println("Adresa student: " + Adresa);
        System.out.println("Inaltime student: " + Inaltime);
        System.out.println("Greutate student: " + Greutate);
        System.out.println("Sex student: " + Sex);
        System.out.println("Diploma student: " + AreDiploma);

        calculMedie();
        System.out.println(getSalariu());
    }
    public void calculMedie(){
        Integer nota1=8;
        Integer nota2=7;
        Integer nota3=10;
        Integer medie=(nota1+nota2+nota3)/3;
        System.out.println("Media studentului este: "+medie);

    }

    //METODA CU RETURN
    public Integer getSalariu (){
        Integer salariu=50000;
        return salariu;
    }
}
