package animals;

class Animal {
    private String name;

    public Animal(String myName, int myId) {
        name = myName;
    };

    public void eat() {
        System.out.println(name + " is eating!");
    };

    public void sleep() {
        System.out.println(name + " is sleeping!");
    };
}