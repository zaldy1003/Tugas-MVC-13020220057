package package_0057_modelData;

/**
 *
 * @author
 * Muhammad Afrizaldi Attalah
 * 13020220057
 * A2
 * 
 */

public class Jurusan {
    private String id;
    private String nama;
    public Jurusan(String id, String nama){
        this.id =id;
        this.nama= nama;
    }
    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id=id;
    }
            
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama=nama;
    }
            
    public String toString(){
        return "Jurusan{"+"id= " + id + ", nama= " + nama +"}";
}
}