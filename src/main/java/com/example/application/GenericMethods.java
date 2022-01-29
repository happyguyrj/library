package com.example.application;

import java.util.ArrayList;
import java.util.List;

// allow to create new type param just for method
public class GenericMethods {

    static Character[] charArray = {'a','b','c','d'};
    static Integer[] intArray = {1,2,3,4,5};
    static Boolean[] boolArray = {true, false, null};

    public static List arrayToList(Object[] array, List<Object> list) {
        for (Object object : array) {
            list.add(object);
        }
        return list;
    }

    public static<T> List<T> arrayToListGeneric(T[] array, List<T> list) {
        for (T object : array) {
            list.add(object);
        }
        return list;
    }

    public static void main(String[] args) {
        List<Character> charList = arrayToList(charArray, new ArrayList<>());
        List<Integer> intList = arrayToList(intArray, new ArrayList<>());
        List<Boolean> boolList = arrayToList(boolArray, new ArrayList<>());

        List<String> intLis = arrayToList(intArray, new ArrayList<>());
        //run time error - java.lang.ClassCastException
        //System.out.println(charListInInteger.get(0));

        //with generics compiled time error
        //List<String> charListInIntegerGeneric = arrayToListGeneric(intArray, new ArrayList<>());
    }
}
