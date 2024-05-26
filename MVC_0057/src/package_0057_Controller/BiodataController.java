package package_0057_Controller;

import package_0057_modelDAO.MahasiswaDAO;
import package_0057_modelDAO.MahasiswaDAOImpl;
import package_0057_modelData.Mahasiswa;
import java.util.List;
import java.util.Observable;

/**
 *
 * @author
 * Muhammad Afrizaldi Attalah
 * 13020220057
 * A2
 * 
 */

public class BiodataController extends Observable{
    private MahasiswaDAO dao = new MahasiswaDAOImpl();
    private CrudState crudState;
    public void setDao(MahasiswaDAO dao){
        this.dao=dao;
    }
    
    public List<Mahasiswa> getAllMahasiswa(){
        return dao.getAllMahasiswa();
    }
    public void manipulate(Mahasiswa m, CrudState c){
        boolean result = false;
        switch(c){
            case INSERT:
                result = dao.insert(m);
                break;
            case UPDATE:
                result = dao.update(m);
                break;
            case DELETE:
                result = dao.delete(m);
                break;
        }
        setChanged();
        if(result){
            notifyObservers(m);
        }else{
            notifyObservers();
        }
}
    public CrudState getCrudState(){
        return crudState;
    }
}