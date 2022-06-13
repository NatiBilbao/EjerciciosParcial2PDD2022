package Ejercicio2ChainResponsability;

public interface IHandler {
    void setNext(IHandler handler);
    void criteriaHandler(String ordenes);
    IHandler next();
}
