public class InState implements State {
    public void nextState(User user) {
        user.setState(new InnerState());
    }
    public void previousState(User user) {
        user.setState(new OutState());
    }
    public void printState() {
        System.out.println("In State !!");
    }
}
