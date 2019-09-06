package OCP.java11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Guideline5 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list = new CopyOnWriteArrayList<>();
        list = new LinkedList<>();

        var list1 = new ArrayList<String>();
        list1 = new CopyOnWriteArrayList<String>();
        list1 = new LinkedList<String>();
    }
}
