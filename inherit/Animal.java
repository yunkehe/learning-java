package inherit;

class Animal {
    private String name;
    private int id;

    public Animal(String myName, int myId) {
        name = myName;
        id = myId;
    }

    public void eat() {
        System.out.println(name + " is eating!");
    };

    public void sleep() {
        System.out.println(name + " is sleeping!");
    };

    public void introduction() {
        System.out.println("hello everyone! I'm " + name + ", and My id is " + id);
    }
}