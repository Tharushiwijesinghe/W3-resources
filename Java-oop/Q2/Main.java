public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Zeeba","Bulldog");
        Dog dog2 = new Dog("Checko","German Sherphed");

        System.out.println(dog1.getName() + " is a " + dog1.getBreed());
        System.out.println(dog2.getName() + " is a " + dog2.getBreed());

        System.out.println("\nSet the new breed for dog1 and set the new name for dog2:\n");

        dog1.setBreed("Rotwhilet");
        dog2.setName("Chesmi");

        System.out.println(dog1.getName()+" is a "+dog1.getBreed());
        System.out.println(dog2.getName()+" is a "+dog2.getBreed());
    }
}
