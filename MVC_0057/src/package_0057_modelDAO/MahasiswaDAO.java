package package_0057_modelDAO;
import java.util.List;
import package_0057_modelData.Mahasiswa;
/**
 *
 * @author
 * Muhammad Afrizaldi Attalah
 * 13020220057
 * A2
 * 
 */

public interface MahasiswaDAO{
    public boolean insert(Mahasiswa m);
    public boolean update(Mahasiswa m);
    public boolean delete(Mahasiswa m);
    
    public List<Mahasiswa>getAllMahasiswa();
    public Mahasiswa getById(String nim);
    
   public List<Mahasiswa> getByName(String name);
}
