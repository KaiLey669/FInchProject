package com.company.finch;

import com.company.finchDriver.Finch;

public class FinchDrawer {

    private Finch finch;

    public FinchDrawer(){
        finch = new Finch();
    }

    public void drawPolygon(float cornerNumber){

        float angle = 180 - (cornerNumber - 2)/cornerNumber * 180;

        for (int i = 0; i < cornerNumber; i++){
            finch.setMove("F", 10, 20);
            finch.setTurn("R", angle, 60);
        }

        finch.stopAll();
        finch.disconnect();
    }


    public void drawCircle(){
        finch.setMotors(50, 0);
        finch.pause(2.9);

        finch.stopAll();
        finch.disconnect();
    }


    public void drawHeart(){

        finch.setTurn("L",40, 60);

        finch.setMove("F", 12, 20);
        finch.setMotors(40, 0);
        finch.pause(2.4);

        finch.setTurn("L", 182, 60);

        finch.setMotors(40, 0);
        finch.pause(2.4);
        finch.setMotors(0,0); //Для выравнивания движения после setMotors
        finch.pause(0.5);            //---------------
        finch.setMove("F", 12, 20);

        finch.stopAll();
        finch.disconnect();
    }


    public void drawHouse(){
        drawPolygon(4);

        finch.setMove("F", 10, 20); //Переход в нужную точку
        finch.setTurn("R",30, 60);

        //drawPolygon(3);
        finch.setMove("F", 10, 20);
        finch.setTurn("R",120, 60);
        finch.setMove("F", 10, 20);

        finch.stopAll();
        finch.disconnect();
    }


    public void drawSun(){

        drawCircle();
        for(int i = 0; i < 5; i++){
            finch.setTurn("L", 90, 60);
            finch.setMove("F", 7, 20);
            finch.setMove("B", 7, 20);
            finch.setTurn("R", 90, 60);
            finch.setMotors(50,0);
            finch.pause(0.6);

            finch.setMotors(0,0);
            finch.pause(0.5);
        }

        finch.stopAll();
        finch.disconnect();
    }

    public void drawTree(){

        finch.setMove("F", 30, 20);
        finch.setTurn("R", 90, 60);
        for (int i = 0; i < 3; i++){
            finch.setMotors(50, 0);
            finch.pause(0.8);
            finch.setTurn("L", 50, 60);
        }

        finch.setTurn("R", 50, 60);

        for(int i = 0; i < 3; i++){
            finch.setMotors(50, 0);
            finch.pause(0.8);
            finch.setTurn("L", 50, 60);
        }

        finch.stopAll();
        finch.disconnect();
    }

}
