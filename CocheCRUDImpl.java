package et5;

public class CocheCRUDImpl extends CocheCRUD implements CocheService{
    @Override
    public Coche crearCocheDemo() {
        System.out.println("Creando coche.");
        return new Coche();
    }

    @Override
    public Coche destruirCoche(Coche Coche) {
        return null;
    }

}
