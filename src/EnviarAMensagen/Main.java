
package EnviarAMensagen;

import SalvaConversa.Cloud;
import SalvaConversa.ProcessaConversa;
import VerificaAndroid.Celular;
import VerificaAndroid.Desatualizado;


public class Main {

      public static void main(String[] args) {
        Celular celular = new Celular();
        celular.AtualizarVersao(new Desatualizado());
        ProcessaConversa processa = new Cloud();
        
                
        Pessoa p = new Pessoa();
        EnviaMensagem porWhatsapp = new ViaWhatsapp();
        EnviaMensagem porSms = new ViaSms();
        
        p.SetEnvia(porWhatsapp);
        p.envia();
        System.out.println("");
        celular.versaoAndroid();
        p.SetEnvia(porSms);
        System.out.println("");
        p.envia();
        System.out.println("");
        processa.constroi();
    
    
    }
    
}
