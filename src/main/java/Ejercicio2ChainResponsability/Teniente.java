package Ejercicio2ChainResponsability;

public class Teniente implements IHandler{
    private IHandler next;
    @Override
    public void setNext(IHandler handler) {
        next=handler;
    }

    @Override
    public void criteriaHandler(String ordenes) {
        if (ordenes > disciplina && ordenes < entrevistas){
            System.out.println("El teniente enseña disciplina:"+ordenes);
        } else {
            next.criteriaHandler(ordenes);
        }

    }

    @Override
    public IHandler next() {
        return next;
    }
}
