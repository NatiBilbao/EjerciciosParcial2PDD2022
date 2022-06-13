package Ejercicio2ChainResponsability;

public class General implements IHandler{
    private IHandler next;

    @Override
    public void setNext(IHandler handler) {
        next=handler;
    }

    @Override
    public void criteriaHandler(String ordenes) {
        if (ordenes > entrevistas){
            System.out.println("El general da entrevistas"+ordenes);
        } else {
            next.criteriaHandler(ordenes);
        }

        @Override
        public IHandler next() {
            return next;
        }

    }
}
