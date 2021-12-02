package edu.pnu.admin;
import java.util.HashMap;
import java.util.Iterator;

public class Cafe {
    private String name;
    private edu.pnu.collection. GenericList<edu.pnu.admin.Beverage> menus = new edu.pnu.collection. GenericList<edu.pnu.admin.Beverage>();

    public Cafe(String name) {
        this.name = name;
    }
    public void addBeverage(edu.pnu.admin.Beverage newBewerage) {
        menus.putIfAbsent(newBewerage);
    }
    public void removeAllBeverage() {
        menus.clear();
    }
//    public String Cafe() {
//        return "Asdf";
//    }
    public edu.pnu.admin.Beverage findBeverage(String name, String type) {
        return menus.get(name,type);
    }
    public String toString() {
        String msg = "Cafe Name: " + name + " Beverage Count: " + menus.size() + "\n";
        int sz = menus.size();
        for (int i = 0; i < sz; i++) {
            edu.pnu.admin.Beverage tmp = menus.getIth(i);
            msg += tmp.toString() + '\n';
        }
        return msg;
    }
}
