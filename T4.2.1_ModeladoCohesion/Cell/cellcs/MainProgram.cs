public class MainProgram{
    public static void Main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat("Persa", "Blanco", "Felino", 0.5f, 3.5f);
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
        cat.setEspecie("Gato");
        cat.setEcosistema("Terrestre");
        cat.setLongevidad(14);
        cat.setTamano(35);
        cat.setPeso(30);
        cat.doAction();
    }
}