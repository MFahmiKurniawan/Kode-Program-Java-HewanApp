public class Ular extends Hewan {

    private final String Type;
    
    public Ular(String nama, int umur){
        super(nama, umur);
        this.Type = "Reptile";
    }

    public void suaraHewan() {
        System.out.println("shsstssth shssttsts");
    }

    public String getType() {
        return Type;
    }

}