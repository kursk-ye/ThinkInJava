package chapter.innerclass.anonymous;

import static kursk.Kutils.println;

/**
 * Created by kursk on 2016/5/31.
 */

interface Monster {
    void menace();
}

interface DangerousMonster extends Monster {
    void destroy();
}

interface Lethal {
    void kill();
}

interface Vampire extends DangerousMonster, Lethal {
    void drinkBlood();
}

public class HorrorShow {
    DangerousMonster getDangerousMonster(){
        return new DangerousMonster(){
            public void menace(){
                println("DangerousMonster menace");
            }
            public void destroy(){
                println("DangerousMonster destroy");
            }
        };
    }

    Vampire getVampire(){
        return new Vampire(){
            public void menace(){println("Vampire menace");}
            public void destroy(){println("Vampire destroy");}
            public void kill(){println("Vampire kill");}
            public void drinkBlood(){println("Vampire drinkBlood");}
        };
    }

    public static void main(String[] args) {
        HorrorShow hs = new HorrorShow();
        DangerousMonster dm = hs.getDangerousMonster();
        Vampire vp = hs.getVampire();
        dm.destroy();
        vp.destroy();
    }


}
