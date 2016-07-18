package chapter.holdyourobjects.exe3;

import java.util.ArrayList;
import java.util.Objects;

import static kursk.Kutils.println;

/**
 * Created by kursk on 2016/7/8.
 */
public class SequenceTest {
    private ArrayList<Object> list = new ArrayList<Object>();
    public void add(Object o){
        list.add(o);
    }
    private class SequenceSelector implements Selector {
        private int i = 0;
        public void next(){ i++; }
        public boolean end(){ return i == list.size();}
        public Object current(){ return list.get(i);}
    }

    public Selector selector(){return  new SequenceSelector();}

    public static void main(String[] args) {
        SequenceTest st = new SequenceTest();
        for(int i=0 ; i<=10; i++)
            st.add(i);
        Selector s = st.selector();
        while(!s.end()){
            println(s.current());
            s.next();
        }
        st.add(11);
        st.add(12);
        st.add(13);
        st.add("good boy!");
        while(!s.end()){
            println(s.current());
            s.next();
        }
    }
}
