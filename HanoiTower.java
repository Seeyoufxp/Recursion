package love.seeyoufxp.recursion;

import java.util.LinkedList;

public class HanoiTower {
    static LinkedList<Integer> a = new LinkedList<>();
    static LinkedList<Integer> b = new LinkedList<>();
    static LinkedList<Integer> c = new LinkedList<>();

    static void init(int n) {
        for (int i = n; i > 0; i--) {
            a.addLast(i);
        }
    }

    /*
        n：圆盘个数
        a：源
        b：借
        c：目
     */

    static void move(int n, LinkedList<Integer> a,
                     LinkedList<Integer> b,
                     LinkedList<Integer> c) {
        if (n == 0) {
            return;
        }
        move(n - 1, a, c, b);
        c.addLast(a.removeLast());
        print();
        move(n - 1, b, a, c);
    }


/*
    move(3) {
        move(2, a, c, b){
            ··move(1, a, c, b){
                ·move(0, a, c, b){
                ·        return;
                ·}
                ·c.addLast(a.removeLast());
                ·print();
                ·move(0, b, a, c){
                ·    return;
                ·}
            ··}
            ··c.addLast(a.removeLast());
            ··print();
            ··move(1, b, a, c){
                ·move(0, a, c, b){
                    ·return;
                ·}
            ··}
        }
        c.addLast(a.removeLast());
        print();
        move(2, b, a, c){
            ··move(1, a, c, b){
                ·move(0, a, c, b){
                ·        return;
                ·}
                ·c.addLast(a.removeLast());
                ·print();
                ·move(0, b, a, c){
                ·    return;
                ·}
            ··}
            ··c.addLast(a.removeLast());
            ··print();
            ··move(1, b, a, c){
                ·move(0, a, c, b){
                    ·return;
                ·}
            ··}
        }
 */

    private static void print() {
        System.out.println("---");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    public static void main(String[] args) {
        init(10);
        print();
        move(10, a, b, c);
    }
}
