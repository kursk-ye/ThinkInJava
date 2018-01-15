package chapter.typeinfo.pets;

import java.util.ArrayList;
import java.util.List;

public class ForNameCreator extends PetCreator{
    private static List<Class<? extends Pet>> types = new ArrayList<Class <? extends  Pet>>();
    private static String[] typeNames = {
        "chapter.typeinfo.pets.Mutt",
        "chapter.typeinfo.pets.Pug",
        "chapter.typeinfo.pets.EgyptianMau",
        "chapter.typeinfo.pets.Manx",
        "chapter.typeinfo.pets.Cymric",
        "chapter.typeinfo.pets.Rat",
        "chapter.typeinfo.pets.Mouse",
        "chapter.typeinfo.pets.Hamster"
    };

    private static void loader(){
        for(String name : typeNames) {
            try {
                types.add((Class<? extends Pet>) Class.forName(name));
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
    }

    static {loader();}

    public List<Class<? extends Pet>> types() {return types;}
}
