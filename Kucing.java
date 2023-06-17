public class Kucing extends Hewan {

    public final String Type;
    
    public Kucing(String nama, int umur){
        super(nama, umur);
        this.Type = "Mamalia";
    }

    public void suaraHewan() {
        System.out.println("Meow meow meow");
    }

    public String getType() {
        return Type;
    }
}