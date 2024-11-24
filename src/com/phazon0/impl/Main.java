package com.phazon0.impl;

import com.phazon0.impl.gui.CPUViewer;

/**
 * Main method for program
 * Used to create Emulator and a GUI frame for displaying it
 */
public class Main
{
    public static void main(String... args){
        Emulator emu = new Emulator();
        CPUViewer viewer = new CPUViewer(emu);
        viewer.show();
        emu.getCpu().reset();

    }

}
