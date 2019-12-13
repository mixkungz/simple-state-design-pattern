public class OutState implements State {
    public void nextState(User user) {
        user.setState(new InState());
    }
    public void previousState(User user) {
        System.out.println("Can't go previous, This's root state");
    }
    public void printState() {
        System.out.println("Out State !!");
    }
}
