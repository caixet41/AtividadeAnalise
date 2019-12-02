/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java3patterns;

/**
 *
 * @author caixe
 */
public class ViaSms implements EnviaMensagem{
   
   @Override
    public void enviar(){
       System.out.println("PADRÃO: Enviar mensagem por sms ");
    }
}
