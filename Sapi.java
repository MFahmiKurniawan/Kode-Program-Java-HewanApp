public class Sapi extends Hewan {

    public final String Type;
    
    public Sapi(String nama, int umur){
        super(nama, umur);
        this.Type = "Mamalia";
    }

    public void suaraHewan() {
        System.out.println("Mooo Moooo Mooo");
    }

    public String getType() {
        return Type;
    }
}