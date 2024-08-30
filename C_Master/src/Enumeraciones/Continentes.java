package Enumeraciones;

public enum Continentes {
    AFRICA(32),
    AMERICA(34),
    OCEANIA(51),
    EUROPA(49),
    ASIA(37);

    private final int paises;

    Continentes (int paises){
        this.paises=paises;
    }

    public int getPaises() {
        return this.paises;
    }
}
