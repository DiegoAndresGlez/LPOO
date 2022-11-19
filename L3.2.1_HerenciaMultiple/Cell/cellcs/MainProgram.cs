public class MainProgram{
    public static void Main(String[] args) {
        Dog dog = new Dog();
        Procariota proc = new Procariota();
        Eucariota euca = new Eucariota();
        dog.setEcosistema("Terrestre");
        dog.setEspecie("Perro");
        dog.setTamano(50);
        dog.setPeso(45);
        dog.setRaza("Beagle");
        dog.setColor("Cafe y blanco");
        dog.setLongevidad(15);
        proc.setName("Procariota");
        euca.setName("Eucariota");
        Console.WriteLine(dog.toString()+proc.toString()+euca.toString());
    }
}