package VariabilaMetoda;

import org.testng.annotations.Test;

public class StructuriAlternative {

    // structuri alternative = if - then - else; switch-case;

    @Test
    public void metodaTest(){
//        metodaVerificareNumar(7);
//        metodaVerificareNumar(3);
//        metodaVerificareNumar(5);
        parPozitivNegativ(4);
        parPozitivNegativ(5);
        parPozitivNegativ(-9);
        parPozitivNegativ(-2);
        parPozitivNegativ(0);

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
}


