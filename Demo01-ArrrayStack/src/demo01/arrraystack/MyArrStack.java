/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo01.arrraystack;

/**
 *
 * @author NC
 */
public class MyArrStack<E> {

    //Che du lieu de ko cho ben ngoai truy cap
    private int MAXN = 100;
    private int cur = -1; // chi so phan tu hien hanh
    private Object[] arr = null; // mảng đối tượng

    public <E> MyArrStack() {
        arr = new Object[MAXN];
    }

    public <E> MyArrStack(int maxN) {
        MAXN = maxN;
        arr = new Object[MAXN];
    }

    public boolean isEmpty() {
        return cur == -1;
    }

    public boolean isFull() {
        return cur == MAXN - 1;
    }

    public E push(E item) {
        if (isFull()) {
            return null;
        }
        cur++;
        arr[cur] = item; // them vao cuoi ->o(1)
        return item;
    }

    public E pop() {
        if (isEmpty()) {
            return null;
        }
        E item = (E) arr[cur]; // phan tu dc lay ra . o(1)
        cur--; // stack bot 1 phan tu
        return item;

    }

    // lấy tham chiếu đến phần tử đỉnh trên stack
    public E topE1() {
        if (isEmpty()) {
            return null;
        }
        return (E) arr[cur];
    }

    static class Lamp {

        String id;
        int price;

        public Lamp(String id, int price) {
            this.id = id;
            this.price = price;
        }

        @Override
        public String toString() {
            return id + ", " + price;
        }

    }

    public static void main(String[] args) {
        MyArrStack<Integer> stk = new MyArrStack();
        stk.push(5);
        stk.push(10);
        stk.push(15);
        System.out.printf(stk.pop()+", "); // Xuat 15
        stk.push(20);
        stk.push(25);
        System.out.printf(stk.pop()+", "); // Xuat 25
        System.out.println(stk.pop()+", "); // xuat 20;
        //stack of students
        MyArrStack<Lamp> stk2 = new MyArrStack();
        stk2.push(new Lamp("L01",7));
        stk2.push(new Lamp("L05",2));
        stk2.push(new Lamp("L99",4));
        while(!stk2.isEmpty())
            System.out.println(stk2.pop());
    }
}
