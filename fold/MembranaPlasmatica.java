class MembranaPlasmatica {
    private String nombre;
    private Float tamano;

    public MembranaPlasmatica(String n, Float t){
        nombre = n;
        tamano = t;
    }

    public void printMembranaPlasmatica(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Tamano: "+tamano+" nanometros");
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public Float getTamano(){
        return tamano;
    }

    public void setTamano(Float tamano){
        this.tamano = tamano;
    }
    
}

