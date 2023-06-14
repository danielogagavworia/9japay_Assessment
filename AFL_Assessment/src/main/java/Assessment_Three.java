public class Assessment_Three {
    /**Using the OOP feature Inheritance, create a class Animal with the method
     sound() and then create a Cat and Dog class that inherits from the Animal class.
     The Cat and Dog class should override the sound class and print a different
     sound.
     * */
    public static void main(String[] args) {
        Animal animal= new Animal();
        animal.sound();

       Dog dog= new Dog();
        dog.sound();

        Cat cat= new Cat();
        cat.sound();
    }


    //The Animal Class
    static class Animal{
        public void sound(){
            System.out.println("The Animal makes animal sounds");
        }
    }

    static class Dog extends Animal{
        public void sound(){
            System.out.println("Dog: Woof! Woof!!");
        }
    }

    static class Cat extends Animal{
        public void sound(){
            System.out.println("Cat: Meow! Meow!!");
        }
    }
}
