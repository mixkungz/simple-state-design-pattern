public class User {
    private State state = new OutState();

    public void setState(State state) {
        this.state = state;
    }
    public void getState() {
        state.printState();
    }
    public void getIn() {
        state.nextState(this);
    }
    public void getOut() {
        state.previousState(this);
    }
    public void exit(){
        this.state = new OutState();
    }
}
