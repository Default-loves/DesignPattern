package State.example2.bad;

import com.junyi.State.example2.ISwitchState;
import com.junyi.State.example2.IUser;
import com.junyi.State.example2.bad.State;

/**
 * @time: 2020/10/15 9:48
 * @version: 1.0
 * @author: junyi Xu
 * @description: if the State has many, the bugGood() should need to add many if-else
 */
public class User implements IUser, ISwitchState {

    State state = State.NORMAL;

    @Override
    public void purchasePlus() {
        state = State.PLUS;
    }

    @Override
    public void expire() {
        state = State.NORMAL;
    }

    @Override
    public void buyGood() {
        if (state == State.PLUS) {
            System.out.println("Invoke Plus service");
        } else if (state == State.NORMAL) {
            System.out.println("Invoke Normal service");
        }
    }
}
