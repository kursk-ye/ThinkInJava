package chapter.innerclass.template;

/**
 * Created by kursk on 2016/6/7.
 */
public abstract class Event {
    private long delay;
    private long eventTime;
    public Event(long delay){
        this.delay = delay;
        start();
    }
    public void start(){
        eventTime = delay + System.nanoTime();
    }
    public boolean ready(){
        if (System.nanoTime() >= eventTime){
            return true;
        }
            return false;
    }
    abstract void action();
}
