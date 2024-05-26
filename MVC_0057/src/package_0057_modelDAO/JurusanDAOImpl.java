package package_0057_modelDAO;

import package_0057.database;
import package_0057_modelData.Jurusan;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author
 * Muhammad Afrizaldi Attalah
 * 13020220057
 * A2
 * 
 */

public class JurusanDAOImpl implements JurusanDAO{
    public boolean insert(Jurusan j){
        throw new UnsupportedOperationException("Not Supported Yet");
    }
    public boolean update(Jurusan j){
        throw new UnsupportedOperationException("Not Supported Yet");
    }
    public boolean delete(Jurusan j){
        throw new UnsupportedOperationException("Not Supported Yet");
    }
    public List<Jurusan> getAllJurusan(){
        List<Jurusan> categories = new ArrayList<>();
        String sql = "SELECT *FROM jurusan";
        try{
            if(database.getConnection()==null){
                return null;
            }else{
                PreparedStatement stm = database.getConnection().prepareStatement(sql);
                ResultSet rs= stm.executeQuery();
                while(rs.next()){
                    Jurusan c = new Jurusan(
                            rs.getString(1),
                            rs.getString(2)
                    );
                    categories.add(c);
                }
                stm.close();
            }
        }catch(Exception ex){
            return categories;
        }
        return categories;
    }
    public Jurusan getById(String id){
        throw new UnsupportedOperationException("Not Supported Yet");
    }
    public List<Jurusan> getByName(String name){
        throw new UnsupportedOperationException("Not Supported Yet");
    }
}
