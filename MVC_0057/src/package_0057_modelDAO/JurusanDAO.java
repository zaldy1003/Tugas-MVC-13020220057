package package_0057_modelDAO;

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
public interface JurusanDAO {
    public boolean insert (Jurusan j);
    
    public boolean update(Jurusan j);
    
    public boolean delete(Jurusan j);
    
    public List<Jurusan>getAllJurusan();
    
    public Jurusan getById(String id);
    
    public List<Jurusan> getByName(String name);
}
