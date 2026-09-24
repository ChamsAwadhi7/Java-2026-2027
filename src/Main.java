//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.public class main() {
 public static void main(String[] args){
     Animal lion = new Animal("Carnivores","Saro",15,true);
     Animal giraffe = new Animal("Giraffes","jeff",20,true);
     Animal oiseau = new Animal("oiseaux","Barry",2,false);

     Zoo myZoo=new Zoo("Zoo tunis ","Tunis",30);

     myZoo.displayZoo();

    System.out.println(myZoo);
     System.out.println(oiseau);
     //System.out.println(myZoo.toString());//D'apres cette instruction et l'instruction précedente on obtient le numero d'adresse de myZoo mais non pas les valeurs d'attributs qu'on souhaite

}
