package chapter.typeinfo.pets;

import net.mindview.util.MapData;

import java.util.LinkedHashMap;

public class PetCount3 {
    static class PetCounter extends LinkedHashMap<Class<? extends Pet>,Integer>{
        public PetCounter(){
            super(MapData.map(LiteralPetCreator.allTypes, 0));
        }

    }
}
