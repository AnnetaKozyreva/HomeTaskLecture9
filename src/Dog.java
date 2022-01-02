import java.util.Objects;

enum Breed { Beagle, Doberman, Pug, Dachshund, Schnauzer, Canes }


class Dog {
    String name;
    int age;
    Breed breed;


    Dog(String name, int age, Breed breed) {
        this.age = age;
        this.name = name;
        this.breed = breed;
    }

    public static void main(String[] args) {
        Dog pups1 = new Dog("Ci", 3, Breed.Beagle);
        Dog pups2 = new Dog("Bi", 2, Breed.Canes);
        Dog pups3 = new Dog("Di", 1, Breed.Pug);
        if (pups1.name.equals(pups2.name) || pups3.name.equals(pups1.name) || pups2.name.equals(pups3.name)){
            System.out.println("The same Name!");
        }
        int[] age = {1, 2, 3};
        int max = 0;
        for (int i = 0; i < age.length; i++) {
            if (age[i] > max) {
                max = age[i];
            }
        }
        if (max == pups1.age) {
            System.out.println("The oldest dog is - " + pups1.name + ", it is -  " + pups1.age + " years. " + pups1.breed);
        } else if (max == pups2.age) {
            System.out.println("The oldest dog is - " + pups2.name + ", it is -  " + pups2.age + " years. " + pups2.breed);
        } else if (max == pups3.age) {
            System.out.println("The oldest dog is - " + pups3.name + ", it is -  " + pups3.age + " years. " + pups3.breed);
        }else {
            System.out.println("");
        }

    }
}


