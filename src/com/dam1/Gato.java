package com.dam1;

import javax.swing.*;

public class Gato extends Mamífero implements IPodeNadar{
    public Gato() {
    }

    @Override
    public void podeCamiñar() {
        super.podeCamiñar();
        JOptionPane.showMessageDialog(null , " Polo tanto o gato tamén pode camiñar ");

    }

    @Override
    public void podeNadar() {
        JOptionPane.showMessageDialog(null , " O gato pode nadar ");
    }
}
