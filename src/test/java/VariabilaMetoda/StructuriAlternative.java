package VariabilaMetoda;

import org.testng.annotations.Test;

public class StructuriAlternative {

    // structuri alternative = if - then - else; switch-case;

    @Test
    public void metodaTest(){
//        metodaVerificareNumar(7);
//        metodaVerificareNumar(3);
//        metodaVerificareNumar(5);
//        parPozitivNegativ(4);
//        parPozitivNegativ(5);
//        parPozitivNegativ(-9);
//        parPozitivNegativ(-2);
//        parPozitivNegativ(0);
        zileSaptamana(2);

    }

    // verificam un nr. mai mare decat 5
    public void metodaVerificareNumar(int Valoare){
        if (Valoare>5){
            System.out.println("Numarul " + Valoare + " este mai mare decat 5");
        }
        else if (Valoare<5){
            System.out.println("Numarul " + Valoare + " este mai mic decat 5");
        }
        else {
            System.out.println("Numarul " + Valoare + " este egal cu 5");
        }
    }

    //verificam daca un nr este par pozitiv sau par negativ
    public void parPozitivNegativ(int Valoare) {
        if (Valoare > 0) {
            if (Valoare % 2 == 0) {
                System.out.println("Numarul " + Valoare + " este par pozitiv");
            } else {
                System.out.println("Numarul " + Valoare + " este impar pozitiv");
            }
        }
        else if (Valoare < 0) {
            if (Valoare % 2 == 0) {
                System.out.println("Numarul " + Valoare + " este par negativ");
            } else {
                System.out.println("Numarul " + Valoare + " este impar negativ");
            }
        }
        else if (Valoare==0) {
            System.out.println("Numarul " + Valoare + " este null");
        }

    }

    //EXEMPLU SWITCH CASE

    public void zileSaptamana(Integer zi){
        switch (zi){
            case 1:
                System.out.println("Astazi este luni");
                break;
            case 2:
                System.out.println("Astazi este marti");
                break;
            case 3:
                System.out.println("Astazi este miercuri");
                break;
            case 4:
                System.out.println("Astazi este joi");
                break;
            case 5:
                System.out.println("Astazi este vineri");
                break;
            default:
                System.out.println("Nu mai sunt zile");
        }
    }

}


