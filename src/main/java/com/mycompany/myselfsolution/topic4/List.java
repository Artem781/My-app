package com.mycompany.myselfsolution.topic4;
//1). Реализовать двусвязный список List (с дженериком) с методами:
//        - добавления элемента в конец (offerLast)
//        - удаление элемента с конца (pollLast)
//        - просмотр последнего элемента (peekLast)
//        - добавление элемента в начало (offerFirst)
//        - удаление элемента с начала (pollFirst)
//        - просмотр первого элемента (peekFirst)
//        - получение размера (size)
//        - получение элемента по индексу (get)
//        - добавление элемента по индексу (add)
//        - удаление элемента по индексу (remove)
//        - метод, который возвращает все элементы в виде массива (Object[] toArray)
//
//        На основе списка реализовать очередь Queue
//        - добавления элемента в конец (offerLast)
//        - удаление элемента с начала (pollFirst)
//        - просмотр первого элемента (peekFirst)
//        - проверить пустая ли очередь (isEmpty)

import com.mysql.cj.x.protobuf.MysqlxExpr;

import java.util.ArrayDeque;
import java.util.LinkedList;

public class List<T> {
    int size = 0;

    Node<T> first;
    Node<T> last;

    private class Node<T> {
        T item;
        Node<T> next;
        Node<T> prev;

        Node(Node<T> prev, T element, Node<T> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }

//    void linkLast(T e) {
//        final Node<T> l = last;
//        final Node<T> newNode = new Node<>(l, e, null);
//        last = newNode;
//        if (l == null)
//            first = newNode;
//        else
//            l.next = newNode;
//        size++;
//    }
    //     - добавления элемента в конец (offerLast)
    public void offerLast(T t) {


    }


    private T[] list;

    public List() {
        this.list = (T[]) new Object[12];
    }

    public static void main(String[] args) {
        LinkedList<Object> objects = new LinkedList<>();
        objects.addLast(2);
        objects.add(null);
        System.out.println(objects.toString());
    }


}
