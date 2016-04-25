package chapter.interfaces.hero;

/**
 * Created by kursk on 2016/4/21.
 */
public class Hero extends ActionCharacter implements CanFly, CanFight, CanSwim, CanClimb {
    public void fly(){}
    public void swim(){}

    @Override
    public void climb() {

    }
}
