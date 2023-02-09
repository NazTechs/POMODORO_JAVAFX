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
public class SortPpoint implements Comparator<Ppoint> {
        @Override
    public int compare(Ppoint o1, Ppoint o2) {
        if (o1.getpHour() != o2.getpHour()) {
            return (o1.getpHour() - o2.getpHour());
        } else {
            return (o1.getpMin() - o2.getpMin());
        }
    }
}
