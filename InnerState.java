public class InnerState implements State {
    public void nextState(User user) {
        System.out.println("Can't go next because this's last state");
    }
    public void previousState(User user) {
        user.setState(new InState());
    }
    public void printState() {
        System.out.println("Inner State !!");
    }
}
