/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.elltechs.pomodoro;

import java.util.ArrayList;

/**
 *
 * @author Soheil
 */
public class PpointFactory {

    private ArrayList<Ppoint> pListArg = new ArrayList<>();
    private ArrayList<Ppoint> pListhome = new ArrayList<>();

    public ArrayList<Ppoint> getpListArg() {
        return pListArg;
    }

    public void setpListArg(ArrayList<Ppoint> pListArg) {
        this.pListArg = pListArg;
    }

    public ArrayList<Ppoint> getpListhome() {
        return pListhome;
    }

    public void setpListhome(ArrayList<Ppoint> pListhome) {
        this.pListhome = pListhome;
    }

    public PpointFactory() {
        pListArg.add(new Ppoint(00, 00, Ppoint.PSTATE.FREEWORKING));
        pListArg.add(new Ppoint(7, 0, Ppoint.PSTATE.FREEWORKING));
        pListArg.add(new Ppoint(9, 0, Ppoint.PSTATE.POMODORO));
        pListArg.add(new Ppoint(9, 45, Ppoint.PSTATE.SHORTREST));
        pListArg.add(new Ppoint(10, 00, Ppoint.PSTATE.POMODORO));
        pListArg.add(new Ppoint(10, 45, Ppoint.PSTATE.SHORTREST));
        pListArg.add(new Ppoint(11, 00, Ppoint.PSTATE.POMODORO));
        pListArg.add(new Ppoint(11, 45, Ppoint.PSTATE.LONGREST));
        pListArg.add(new Ppoint(13, 00, Ppoint.PSTATE.POMODORO));
        pListArg.add(new Ppoint(13, 45, Ppoint.PSTATE.SHORTREST));
        pListArg.add(new Ppoint(14, 00, Ppoint.PSTATE.POMODORO));
        pListArg.add(new Ppoint(14, 45, Ppoint.PSTATE.SHORTREST));
        pListArg.add(new Ppoint(15, 00, Ppoint.PSTATE.POMODORO));
        pListArg.add(new Ppoint(15, 45, Ppoint.PSTATE.SHORTREST));
        pListArg.add(new Ppoint(16, 00, Ppoint.PSTATE.POMODORO));
        pListArg.add(new Ppoint(16, 45, Ppoint.PSTATE.SHORTREST));
        pListArg.add(new Ppoint(17, 00, Ppoint.PSTATE.POMODORO));
        pListArg.add(new Ppoint(17, 45, Ppoint.PSTATE.SHORTREST));
        pListArg.add(new Ppoint(18, 00, Ppoint.PSTATE.FREEWORKING));
        pListArg.add(new Ppoint(24, 00, Ppoint.PSTATE.FREEWORKING));

        pListhome.add(new Ppoint(00, 00, Ppoint.PSTATE.POMODORO));
        pListhome.add(new Ppoint(00, 25, Ppoint.PSTATE.SHORTREST));
        pListhome.add(new Ppoint(00, 30, Ppoint.PSTATE.POMODORO));
        pListhome.add(new Ppoint(00, 55, Ppoint.PSTATE.SHORTREST));

        pListhome.add(new Ppoint(22, 00, Ppoint.PSTATE.POMODORO));
        pListhome.add(new Ppoint(22, 25, Ppoint.PSTATE.SHORTREST));
        pListhome.add(new Ppoint(22, 30, Ppoint.PSTATE.POMODORO));
        pListhome.add(new Ppoint(22, 55, Ppoint.PSTATE.SHORTREST));

        pListhome.add(new Ppoint(23, 00, Ppoint.PSTATE.POMODORO));
        pListhome.add(new Ppoint(23, 25, Ppoint.PSTATE.SHORTREST));
        pListhome.add(new Ppoint(23, 30, Ppoint.PSTATE.POMODORO));
        pListhome.add(new Ppoint(23, 55, Ppoint.PSTATE.SHORTREST));

        pListhome.add(new Ppoint(21, 00, Ppoint.PSTATE.POMODORO));
        pListhome.add(new Ppoint(21, 25, Ppoint.PSTATE.SHORTREST));
        pListhome.add(new Ppoint(21, 30, Ppoint.PSTATE.POMODORO));
        pListhome.add(new Ppoint(21, 55, Ppoint.PSTATE.SHORTREST));

        pListhome.add(new Ppoint(20, 00, Ppoint.PSTATE.POMODORO));
        pListhome.add(new Ppoint(20, 25, Ppoint.PSTATE.SHORTREST));
        pListhome.add(new Ppoint(20, 30, Ppoint.PSTATE.POMODORO));
        pListhome.add(new Ppoint(20, 55, Ppoint.PSTATE.SHORTREST));

    }

}
