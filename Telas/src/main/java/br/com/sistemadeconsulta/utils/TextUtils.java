package br.com.sistemadeconsulta.utils;

import javax.swing.*;
import java.awt.*;

public class TextUtils {

    public void setLabel(JLabel label, String text) {
        label.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 20)); // NOI18N
        label.setText(text);
    }

}
