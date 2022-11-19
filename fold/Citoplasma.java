class Citoplasma {
    private String nombre;
    private Float tamano;

    public Citoplasma(String n, Float t){
        nombre = n;
        tamano = t;
    }

    public void printCitoplasma(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Tamano: "+tamano+" micrometro");
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
