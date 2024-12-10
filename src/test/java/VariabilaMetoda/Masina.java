package VariabilaMetoda;

import org.testng.annotations.Test;

public class Masina {

    public String marca;
    public String model;
    public Integer anFabricare;

    @Test
    public void metodaTest(){
        dateMasina("Audi","Q33", 2023);
        dateMasina("BMW","X5",2023);

        calculMedie(6.5,9.5);
        calculMedie(7.0,8.0);
    }

    public void dateMasina(String param1, String param2, Integer param3){
        marca=param1;
        model=param2;
        anFabricare=param3;

        System.out.println("Marca masinii este: "+marca);
        System.out.println("Modelul masinii este: "+model);
        System.out.println("Anul de fabricare al masinii este: "+anFabricare);
    }

    //calculam media la doua numere

    public void calculMedie(Double nota1, Double nota2){
        Double rezultat=(nota1+nota2)/2;
        System.out.println("Media este: "+rezultat);

    }

}
