public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Procariota proc = new Procariota();
        Eucariota euca = new Eucariota();
        dog.setEcosistema("Terrestre");
        dog.setEspecie("Canino");
        dog.setRaza("Beagle");
        dog.setColor("Cafe y blanco");
        dog.setLongevidad(15);
        dog.setTamano(50);
        dog.setPeso(45);
        proc.setName("Procariota");
        euca.setName("Eucariota");
        System.out.println(dog.toString()+proc.toString()+euca.toString());
    }
}
