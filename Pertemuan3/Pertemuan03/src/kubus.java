/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class kubus {
    public int sisi;
    
    public kubus (int s)
    {   sisi = s;
    }
    public int hitungVolumeKubus(){
        return sisi*sisi*sisi;
    }
    public int hitungLuasPermukaanKubus(){
        return 6*(sisi*sisi);
    }
}
