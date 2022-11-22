public class Main {

    public static void main(String[] args) {

        Caretaker Caretaker = new Caretaker();
        Originator originator = new Originator();
        originator.setState("First state");

        Caretaker.saveMemento(originator.createMemento());
        originator.setState("Second state");

        Caretaker.saveMemento(originator.createMemento());
        originator.setState("Third state");

        Caretaker.saveMemento(originator.createMemento());
        originator.restore(Caretaker.getMemento(0));

        System.out.println(originator.getState());
        originator.restore(Caretaker.getMemento(1));

        System.out.println(originator.getState());
        originator.restore(Caretaker.getMemento(2));

        System.out.println(originator.getState());
    }

}


