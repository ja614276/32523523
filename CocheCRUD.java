package et5;

import java.util.ArrayList;
import java.util.List;

public class CocheCRUD {
    //save() findAll() delete() que simplemente impriman por consola el nombre del propio método.

    //estructura de datos
    List<Coche> coche=new ArrayList<>();
    //CREATE
    public void save (Coche coche1){
        coche.add(coche1);
    }
    public List<Coche> findAll(){
        return coche;
    }
    public void delete(Coche coche1){
        coche.remove(coche1);
    }
}
