package arbol;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Base64;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Arbol {

    public static boolean val = true;

    public static void main(String[] args) {
        
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        

        if (!Paths.get("company.bin").toFile().exists()) {     
                Escribir(Base64.getEncoder().encode("Arbol".getBytes()), "company.bin");
            }
        
        String Titulo = new String(Base64.getDecoder().decode(Leer("company.bin")), "UTF-8");
        
        arbol.TransparentSplashScreen ir = new arbol.TransparentSplashScreen();
        ir.titu(Titulo);
        ir.setLocationRelativeTo(null);
        ir.setVisible(true);
} catch (Exception ex) {
                JOptionPane.showMessageDialog(null,ex.getMessage(), "Error", 0);

        }
    }

    public static  void  Escribir(byte[] aBytes, String aFileName) throws IOException {
        Path path = Paths.get(aFileName);
        Files.write(path, aBytes);
    }
    
   public static  byte[] Leer(String aFileName) throws IOException {
        Path path = Paths.get(aFileName);
        return Files.readAllBytes(path);
    }

    
}
