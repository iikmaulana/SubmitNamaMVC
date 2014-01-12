/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package form.mvc.iik.controller;

import form.mvc.iik.model.NamaModel;
import form.mvc.iik.view.NamaView;
import javax.swing.JOptionPane;

/**
 *
 * @author maulana
 */
public class NamaController {
    
    private NamaModel model;
    
    public void setModel(NamaModel model){
        this.model = model;
    }
    
    public void resetForm(NamaView view){
        String namaDepan = view.getTextNamaDepan().getText();
        String namaTengah = view.getTextNamaTengah().getText();
        String namaBelakang = view.getTextNamaBelakang().getText();
        
        if(namaBelakang.equals("") && namaTengah.equals("") && namaDepan.equals("")){
            
        }else{
            model.resetForm();
        }
    }
   
    public void submitForm(NamaView view){
        String namaDepan = view.getTextNamaDepan().getText();
        String namaTengah = view.getTextNamaTengah().getText();
        String namaBelakang = view.getTextNamaBelakang().getText();
        
        if(namaDepan.trim().equals("")){
            JOptionPane.showMessageDialog(view, "Nama Depan Masih Kosong");
        }else if(namaBelakang.trim().equals("")){
            JOptionPane.showMessageDialog(view, "Nama Belakang Masih Kosong");
        }else{
            model.submitForm();
        }
            
            
        
    }
}
