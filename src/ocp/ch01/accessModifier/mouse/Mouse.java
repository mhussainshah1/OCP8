package OCP.ch01.accessModifier.mouse;

import OCP.ch01.accessModifier.cat.BigCat;

class Mouse {

    public static void main(String[] args) {
        BigCat cat = new BigCat();
        System.out.println(cat.name);
        System.out.println(cat.hasFur);
        System.out.println(cat.hasPaws);
        System.out.println(cat.id);
    }
}
