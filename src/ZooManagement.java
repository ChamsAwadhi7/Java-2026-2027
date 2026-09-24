import java.util.Scanner;

public class ZooManagement {

    int nbrCages;
    String zooName;
    public static void main(String[] args) {
        ZooManagement zoo= new ZooManagement();
        Scanner scanner = new Scanner(System.in);
        System.out.println("veuillez entrer le nom de zoo");
        zoo.zooName = scanner.nextLine();
        System.out.println("veuillez entrer le nom de cages");
        zoo.nbrCages = scanner.nextInt();
        if(zoo.nbrCages>0 && zoo.zooName.length()>0){
        System.out.println(zoo.zooName+" comporte "+zoo.nbrCages+" Cages");
        }else{
        System.out.println("Erreur, veuillez verifier vos données");
}}}
