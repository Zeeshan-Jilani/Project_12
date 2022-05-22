package com.company.Main;

enum Lights{
    RED,YELLOW,GREEN
}
class Zeeshan_56855{
    Lights Ls = Lights.RED;
    void ChangeColor_56473(){
        switch (Ls){
            case RED :
                Ls=Lights.YELLOW;
                break;
            case YELLOW :
                Ls=Lights.GREEN;
                break;
            case GREEN :
                Ls=Lights.RED;
                break;
        }
    }
    public String toString(){
        return " "+Ls;
    }

}

public class TrafficLights {
    public static void main(String[] args){
        Zeeshan_56855 s = new Zeeshan_56855();
        for (int i = 0; i < 6; i++) {
            System.out.println(s);
            s.ChangeColor_56473();
        }

    }
}
