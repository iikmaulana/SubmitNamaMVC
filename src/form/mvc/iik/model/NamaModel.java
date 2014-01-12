/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package form.mvc.iik.model;

import form.mvc.iik.model.event.NamaListener;
import javax.swing.JOptionPane;

/**
 *
 * @author maulana
 */
public class NamaModel {
    
    private String namaDepan;
    
    private String namaTengah;
    
    private String namaBelakang;
    
    private NamaListener namaListener;

    public NamaListener getNamaListener() {
        return namaListener;
    }

    public void setNamaListener(NamaListener namaListener) {
        this.namaListener = namaListener;
    }
    
    

    public String getNamaDepan() {
        return namaDepan;
    }

    public void setNamaDepan(String namaDepan) {
        this.namaDepan = namaDepan;
        fireOnChange();
        
    }

    public String getNamaTengah() {
        return namaTengah;
    }

    public void setNamaTengah(String namaTengah) {
        this.namaTengah = namaTengah;
        fireOnChange();
    }

    public String getNamaBelakang() {
        return namaBelakang;
    }

    public void setNamaBelakang(String namaBelakang) {
        this.namaBelakang = namaBelakang;
        fireOnChange();
    }
    protected void fireOnChange(){
        if(namaListener != null){
            namaListener.onChange(this);
        }
    }
    
    public void resetForm(){
        setNamaBelakang("");
        setNamaDepan("");
        setNamaTengah("");
    }
    
    public void submitForm(){
        JOptionPane.showMessageDialog(null, "Name Berhasil di Submit");
        resetForm();
    }
    
}
