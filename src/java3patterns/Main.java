
package java3patterns;

public class Main {

      public static void main(String[] args) {
        Pessoa p = new Pessoa();
        EnviaMensagem porWhatsapp = new ViaWhatsapp();
        p.envia();
        p.SetEnvia(porWhatsapp);
        p.envia();
    
    
    }
    
}
