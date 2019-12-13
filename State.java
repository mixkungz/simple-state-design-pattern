public interface State {
    void nextState(User user);
    void previousState(User user);
    void printState();
}
