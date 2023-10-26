// // class Animal {
// //     void makeSound() {
// //         System.out.println("Animal makes a sound");
// //     }
    
// //     String sound = "Animal sound";
// // }

// // class Dog extends Animal {
// //     void makeSound() {
// //         System.out.println("Dog barks");
// //     }
    
// //     String sound = "Dog sound";
// // }

// // public class MidSem {
// //     public static void main(String[] args) {
// //                                                                                     // Dynamic Binding (Method invocation)
// //         Animal myAnimal = new Dog();                                                // Dynamic binding: Actual method called is determined at runtime
        
// //                                                                                     // Accessing variables using static binding
// //         System.out.println("Variable sound in Animal: " + myAnimal.sound);          // Static binding: Animal's sound variable
// //                                                                                     // Output: "Animal sound" because myAnimal is of type Animal
        
// //                                                                                     // Uncommenting the line below would result in a compilation error because the breed variable is not defined in Animal class.
// //                                                                                     // System.out.println("Variable breed in Animal: " + myAnimal.breed); // This line would not compile
        
// //                                                                                     // Accessing the overridden method using dynamic binding
// //         myAnimal.makeSound();                                                       // Dynamic binding: Actual method called depends on the runtime type of myAnimal
// //                                                                                     // Output: "Dog barks" because myAnimal points to a Dog object
// //     }
// // }

// public class MidSem {

//     public static void main(String[] args) {
//         // Create an object of MyClass
//         MidSem myObject = new MidSem();

//         // Call methods from the object
//         myObject.method1();
//         myObject.method2();

//         int result = myObject.add(5, 7);
//         System.out.println("The result of addition is: " + result);
//     }

//     public void method1() {
//         System.out.println("Method 1 is called.");
//     }

//     public void method2() {
//         System.out.println("Method 2 is called.");
//     }

//     public int add(int a, int b) {
//         return a + b;
//     }

// }
class A {
    void sound() {
        System.out.println("A");
    }

    char character = 'A';
}

class B extends A {
    void sound() {
        System.out.println("B");
    }

    char character = 'B';
}

class C extends A {
    void sound() {
        System.out.println("C");
    }

    char character = 'C';
}
public class MidSem {

    // public static void print(int... num) {
    //     for(int n : num) {
    //         System.out.println(n);
    //     }
    // }

    // public static void print(int n, int b, int c) {
    //     System.out.println(n);
    //     System.out.println(b);
    //     System.out.println(c);
    // }
    // public static void main(String[] args) {
    //     print(5, 6, 7);
    //     print(5);
    // }

    public static void main(String[] args) {
        // A a = new A();
        B b = new C();
        // C c = new C();

        // A ref;

        // ref = a;
        // ref.sound();
        // System.out.println(ref.character);

        // ref = b;
        // ref.sound();
        // System.out.println(ref.character);

        // ref = c;
        // ref.sound();
        // System.out.println(ref.character);
    }
}