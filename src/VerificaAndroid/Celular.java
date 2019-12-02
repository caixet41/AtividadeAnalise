/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VerificaAndroid;

/**
 *
 * @author caixe
 */
public class Celular {
    private VerificaVersaoAndroid versao;
    
    public void AtualizarVersao(VerificaVersaoAndroid novaVersao){
        this.versao= novaVersao;
    }
    
    public void versaoAndroid(){
   
        versao.versaoAndroid();
    }
}
