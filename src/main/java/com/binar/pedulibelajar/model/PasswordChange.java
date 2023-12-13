package com.binar.pedulibelajar.model;

import javax.swing.JOptionPane;

public class PasswordChange {
    private String password;

    public PasswordChange(String password) {
        this.password = password;
    }

    public boolean changePassword() {
        String oldPassword = JOptionPane.showInputDialog(null, "Masukkan kata sandi lama: ", "Input", JOptionPane.QUESTION_MESSAGE);
        if (oldPassword.equals(password)) {
            String newPassword = JOptionPane.showInputDialog(null, "Masukkan kata sandi baru: ", "Input", JOptionPane.QUESTION_MESSAGE);
            String confirmNewPassword = JOptionPane.showInputDialog(null, "Konfirmasi kata sandi baru: ", "Input", JOptionPane.QUESTION_MESSAGE);
            if (newPassword.equals(confirmNewPassword)) {
                password = newPassword;
                JOptionPane.showMessageDialog(null, "Kata sandi berhasil diubah", "Pesan", JOptionPane.INFORMATION_MESSAGE);
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Konfirmasi kata sandi salah", "Pesan", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Kata sandi lama salah", "Pesan", JOptionPane.INFORMATION_MESSAGE);
        }
        return false;
    }
}
