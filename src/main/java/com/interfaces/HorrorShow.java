package com.interfaces;

/**
 * @Auther: linklmm
 * @Date: 2019/6/25 16:10
 * @Description:
 */
interface Monster{
    void meance();
}
interface DangerousMonster extends Monster{
    void destroy();
}
interface Lethal{
    void kill();
}
class DragonZilla implements DangerousMonster{
    @Override
    public void meance() {

    }

    @Override
    public void destroy() {

    }
}
interface Vampire extends DangerousMonster,Lethal{
    void drinkBlood();
}
class VeryBadVampire implements Vampire{
    @Override
    public void meance() {

    }

    @Override
    public void destroy() {

    }

    @Override
    public void kill() {
    }

    @Override
    public void drinkBlood() {

    }
}
public class HorrorShow {
    static void u(Monster b){
        b.meance();
    }
    static void v(DangerousMonster d){
        d.meance();
        d.destroy();
    }
    static void w(Lethal l){
        l.kill();
    }

    public static void main(String[] args) {
        DangerousMonster barney = new DragonZilla();
        u(barney);
        v(barney);
        Vampire vlad = new VeryBadVampire();
        u(vlad);
        v(vlad);
        w(vlad);
    }
}
