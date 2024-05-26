package package_0057_Controller;
import package_0057_modelDAO.JurusanDAO;
import package_0057_modelDAO.JurusanDAOImpl;
import package_0057_modelData.Jurusan;
import java.util.List;

/**
 *
 * @author
 * Muhammad Afrizaldi Attalah
 * 13020220057
 * A2
 * 
 */

public class JurusanController {
    private JurusanDAO dao = new JurusanDAOImpl();
    
    public List<Jurusan> getAllData(){
        return dao.getAllJurusan();
    }
}
