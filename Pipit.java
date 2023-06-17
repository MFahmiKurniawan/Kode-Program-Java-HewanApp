public class Pipit extends Hewan {

    public final String Type;
    
    public Pipit(String nama, int umur){
        super(nama, umur);
        this.Type = "Aves";
    }

    public void suaraHewan() {
        System.out.println("cittt cit cit cuwitt");
    }

    public String getType() {
        return Type;
    }
}