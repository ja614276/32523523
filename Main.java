package et5;

import java.util.List;


public class Main {
    public static void main(String[] args) {
        CocheCRUD cocheCrud=new CocheCRUDImpl();

        cocheCrud.save(new Coche());
        List<Coche> coches = cocheCrud.findAll();
        cocheCrud.delete(coches.get(0));
    }
}
