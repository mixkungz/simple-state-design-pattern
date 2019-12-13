public class UserStateTest {
    public static void main(String args[]){
        User user = new User();
        user.getState(); //Out state

        user.getIn();
        user.getState(); //In state
        
        user.getIn();
        user.getState(); //Inner State
        
        user.getOut();
        user.getState(); //In State

        user.getIn(); //Inner State
        user.getIn(); //Inner State
        user.exit();
        user.getState(); //Out State
    }
}
