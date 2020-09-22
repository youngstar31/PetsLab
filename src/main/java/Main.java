import java.util.ArrayList;
import java.util.Scanner;

public class Main {
        public static ArrayList<Pets> petsList = new ArrayList<>();
        public static Scanner scanner = new Scanner(System.in);

        public static int countPets() {
            System.out.println("How many pet(s) do you have?");
            return scanner.nextInt();
        }

        public static String getPetTypeInput(String prompt){
            //System.out.println("What type of pet do you have?");
            Scanner scanner = new Scanner(System.in);
            System.out.println(prompt);
            String userInput = scanner.nextLine();
            return userInput;
    }

    public static String getPetNameInput(String prompt){
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);
        String userInput = scanner.nextLine();
        return userInput;
    }
// Method that returns the list of pets
    public static ArrayList<Pets> listOfPets(int numberOfPets){
            for(int index = 0; index < numberOfPets; index++){
                String typePet = getPetTypeInput("What type of pet(s) do you have?");
                String petName = getPetNameInput("What is your " + typePet + "'s name?");
                if (typePet.equalsIgnoreCase("Dog")){
                    Dog dog = new Dog(petName);
                    petsList.add(dog);
                }
                else if(typePet.equalsIgnoreCase("Cat")){
                    Cat cat = new Cat(petName);
                    petsList.add(cat);
                }
                else{
                    Snake snake = new Snake(petName);
                    petsList.add(snake);
                }
            }
            return petsList;
    }



    public static void main(String[] args) {
            int numberOfPets = countPets();
            ArrayList<Pets> userPets =listOfPets(numberOfPets);
            for(Pets x : userPets){
                System.out.println(x.getName() + " says " + x.speak() + ".");
            }

            // way to gather number of pets
        //ArrayList that hols num of pets
        //loop that will loop through the new ArrayList

    }
}
