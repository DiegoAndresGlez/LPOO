

public class Celula{
    public static void main(String[] args){
        NucleoCelular nucleocelular = new NucleoCelular("Nucleo Celular", 5.0f);
        MembranaPlasmatica mp = new MembranaPlasmatica("Membrana plasmatica", 10.0f);
        Citoplasma cp = new Citoplasma("Citoplasma", 1.0f);
        CelulaEscariota ce = new CelulaEscariota("Celula Escariota", 5.0f);
        CelulaProcariota cep = new CelulaProcariota("Celula Procariota", 10.0f);
        CelulaAnimal ca = new CelulaAnimal("Celula Animal", 30.0f);
        CelulaVegetal cv = new CelulaVegetal("Celula Vegetal", 30.0f);

        nucleocelular.printCelula();
        mp.printMembranaPlasmatica();
        cp.printCitoplasma();
        ce.printCelulaEscariota();
        cep.printCelulaProcariota();
        ca.printCelulaAnimal();
        cv.printCelulaVegetal();

    }
}