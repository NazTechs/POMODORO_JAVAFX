/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.elltechs.pomodoro;

import java.util.Comparator;

/**
 *
 * @author Soheil
 */
public class Ppoint  {



    public enum PSTATE {
        POMODORO,
        SHORTREST,
        LONGREST,
        PAUSE,
        FREEWORKING,
    }
    private int pHour;
    private int pMin;
    private PSTATE pState;

    public Ppoint(int pHour, int pMin, PSTATE pState) {
        this.pHour = pHour;
        this.pMin = pMin;
        this.pState = pState;
    }

    public int getpHour() {
        return pHour;
    }

    public void setpHour(int pHour) {
        this.pHour = pHour;
    }

    public int getpMin() {
        return pMin;
    }

    public void setpMin(int pMin) {
        this.pMin = pMin;
    }

    public PSTATE getpState() {
        return pState;
    }

    public void setpState(PSTATE pState) {
        this.pState = pState;
    }

}

