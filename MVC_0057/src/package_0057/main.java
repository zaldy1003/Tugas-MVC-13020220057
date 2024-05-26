package package_0057;

import javax.swing.UnsupportedLookAndFeelException;
import java.util.logging.Level;
import java.util.logging.Logger;
import package_0057_View.BiodataForm;


/**
 *
 * @author
 * Muhammad Afrizaldi Attalah
 * 13020220057
 * A2
 * 
 */

public class main {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
        for(javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()){
            if("Nimbus".equals(info.getName())){
                try{
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }catch(UnsupportedLookAndFeelException ex){
                    Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                    
                }
            }
        }
        new BiodataForm().setVisible(true);
    }
}
