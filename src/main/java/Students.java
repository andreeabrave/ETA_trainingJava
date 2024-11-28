public class Students {

    public String Nume;

    public String Prenume;

    public Integer Varsta;

    public String Adresa;

    public Double Inaltime;

    public Float Greutate;

    public Character Sex;

    public Boolean AreDiploma;


    @Test
    public void prezentareStudent(){
        Nume="Muresan";
        Prenume="Andreea";
        Varsta=32;
        Adresa="Sobarilor 38A";
        Inaltime=1.76;
        Greutate=80.1f;
        Sex='F';
        AreDiploma=true;

        System.out.print(Nume);
    }



}
