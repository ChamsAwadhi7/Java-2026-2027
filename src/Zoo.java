public class Zoo {
    Animal[] animals;
    String name;
    String city;
    int nbrCages;

    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = new Animal[30];
    }

    @Override
    public String toString() {
        return "Nom de zoo : "+name+"et la ville est"+city+"et le nbre de cages de cette zoo est "+nbrCages;
    }

    public void displayZoo(){
        System.out.println(this.toString());

    }
}
