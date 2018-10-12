class Penguin extends Animal {
    public Penguin(String myName, int myId) {
        super(myName, myId);
    }

    public static void main(String[] args) {
        Penguin p = new Penguin("Heke", 2);
        p.eat();
    }
}