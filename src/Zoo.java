public class Zoo {
    Animal[] animals = new Animal[25]; // max 25 animaux
    String name;
    String city;
    final int NBR_CAGES=25;
    int nbrAnimals;
    public Zoo(){}
    // Constructeur paramétré
    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;
    }
    boolean addAnimal(Animal animal){

        if(searchAnimal(animal)!=-1){

            System.out.println("Animal existant");
            return false;
        }
        if(isZooFull()){
            System.out.println("Zoo Complet");
            return false;
        }
        animals[nbrAnimals] = animal;
        nbrAnimals++;
        return true;
    }
    public void displayAnimals(){
        for(int i = 0; i < nbrAnimals; i++){
            System.out.println(animals[i]);
        }
    }
    public int searchAnimal(Animal animal){
        for(int i = 0; i < nbrAnimals; i++){
            if(animals[i].name.equals(animal.name))
                return i;
        }
        return -1;
    }
    boolean removeAnimal(Animal animal){
        int index = searchAnimal(animal);
        if(index==-1)
            return false;
        for(int i = index; i < nbrAnimals; i++){
            animals[i] = animals[i+1];
        }
        animals[nbrAnimals-1] = null;
        nbrAnimals--;
        return true;
    }
    boolean isZooFull(){
        return nbrAnimals>=NBR_CAGES;
    }
    Zoo compareZoo(Zoo z1, Zoo z2){
        if(z1.nbrAnimals > z2.nbrAnimals)
            return z1;
        else if (z2.nbrAnimals > z1.nbrAnimals )
            return z2;
        else
            return null;
    }
    public void displayZoo() {
        System.out.println("Zoo : " + name + ", Ville : " + city + ", Cages : " + nbrCages);
    }
    @Override
    public String toString() {
        return "Zoo [Nom=" + name + ", Ville=" + city + ", Cages=" + nbrCages + "]";
    }
}
