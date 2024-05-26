package package_0057_modelDAO;

import package_0057.database;
import package_0057_modelData.*;
import java.sql.*;
import java.util.*;
import java.util.logging.*;

/**
 *
 * @author
 * Muhammad Afrizaldi Attalah
 * 13020220057
 * A2
 * 
 */

public class MahasiswaDAOImpl implements MahasiswaDAO{
    public boolean insert(Mahasiswa m){
        String sql= "INSERT INTO mahasiswa VALUES (?, ?, ?)";
        try{
            PreparedStatement statement = database.getConnection().prepareStatement(sql);
            statement.setString(1, m.getStambuk());
            statement.setString(2, m.getNama());
            statement.setInt(3, Integer.parseInt(m.getProdi().getId()));
            int row = statement.executeUpdate();
            if(row > 0){
            return true;
        }
            statement.close();
        }catch(Exception ex){
            Logger.getLogger(Mahasiswa.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public boolean update(Mahasiswa m){
        String sql = "UPDATE mahasiswa SET nama=?, prodi=?, WHERE nim=?";
        try{
            PreparedStatement stm = database.getConnection().prepareStatement(sql);
            stm.setString(1, m.getNama());
            stm.setInt(2, Integer.parseInt(m.getProdi().getId()));
            stm.setString(3, m.getStambuk());
            int row = stm.executeUpdate();
            if(row > 0){
                return true;
            }
            stm.close();
        }catch(Exception ex){
            Logger.getLogger(Mahasiswa.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public boolean delete(Mahasiswa m){
        String sql="DELETE FROM mahasiswa WHERE nim=?";
        try{
            PreparedStatement stm = database.getConnection().prepareStatement(sql);
            stm.setString(1, m.getStambuk());
            int row= stm.executeUpdate();
            if(row >0){
                return true;
            }
        }catch(Exception ex){
            Logger.getLogger(Mahasiswa.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public List<Mahasiswa> getAllMahasiswa(){
        List<Mahasiswa> mahasiswa = new ArrayList<Mahasiswa>();
        String sql="SELECT FROM mahasiswa INNER JOIN jurusan ON jurusan.id=mahasiswa.prodi";
        try{
        if(database.getConnection()==null){
            return null;
        }else{
            PreparedStatement stm = database.getConnection().prepareStatement(sql);
                
            ResultSet rs= stm.executeQuery();
            while(rs.next()){
                Mahasiswa p = new Mahasiswa(
                        rs.getString(1),
                        rs.getString(2),
                        new Jurusan(rs.getString(3), rs.getString(4))
                );
                mahasiswa.add(p);
            }
            stm.close();
        }     
        }catch(Exception ex){
            Logger.getLogger(Mahasiswa.class.getName()).log(Level.SEVERE, null, ex);
        }
        return mahasiswa;
    }
    
    public Mahasiswa getById(String nim){
        throw new UnsupportedOperationException("Not Supported yet.");
    }
    
    public List<Mahasiswa> getByName(String name){
        throw new UnsupportedOperationException("Not Supported yet.");
    }
}
