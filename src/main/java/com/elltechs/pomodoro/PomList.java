/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.elltechs.pomodoro;
import com.elltechs.pomodoro.Ppoint.PSTATE;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author Soheil
 */
public class PomList implements Serializable {
     private ArrayList<Ppoint> pList = new ArrayList<>();

   
    public  PomList(ArrayList<Ppoint> pList) {
         this.pList = pList;
         Collections.sort( this.pList,new SortPpoint());
    }

    public ArrayList<Ppoint> getpList() {
        return pList;
    }

    public void setpList(ArrayList<Ppoint> pList) {
        this.pList = pList;
    }
    public PSTATE findState(int hour,int min){
        int nearSample = 0;
        SortPpoint spp = new SortPpoint();
        Ppoint pp = new Ppoint(hour, min, PSTATE.PAUSE);
        for ( int i = 1 ; i < pList.size(); i++){
            if (spp.compare(pp, pList.get(i) ) < 0){
                nearSample = i-1;
                break;
            }
            System.out.println(String.format("Phour = %d Pmin = %d STATE = %s", pList.get(i).getpHour(),pList.get(i).getpMin(), pList.get(i).getpState()));
        }
         return pList.get(nearSample).getpState();
    };
    public long findWorkPeriod(int hour,int min){
        long workPeriod;
        int nearSample = 0;
        SortPpoint spp = new SortPpoint();
        Ppoint pp = new Ppoint(hour, min, PSTATE.PAUSE);
        for ( int i = 1 ; i < pList.size(); i++){
            if (spp.compare(pp, pList.get(i) ) < 0){
                nearSample = i-1;
                break;
            }
        }
        workPeriod = ( pList.get(nearSample + 1).getpHour() - pList.get(nearSample).getpHour()) * 60 * 60 * 1000 +   (pList.get(nearSample + 1).getpMin()- pList.get(nearSample).getpMin()) * 60 * 1000;
        return workPeriod;
    }
    public Ppoint findPpoint(int hour,int min){
        int nearSample = 0;
        SortPpoint spp = new SortPpoint();
        Ppoint pp = new Ppoint(hour, min, PSTATE.PAUSE);
        for ( int i = 1 ; i < pList.size(); i++){
            if (spp.compare(pp, pList.get(i) ) < 0){
                nearSample = i-1;
                break;
            }
        }
        return pList.get(nearSample);
    }

  
    
}
     
