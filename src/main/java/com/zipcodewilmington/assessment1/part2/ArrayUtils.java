package com.zipcodewilmington.assessment1.part2;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {

         int count = 0;


        for (int i = 0; i < objectArray.length; i++) {

            if (objectToCount.equals(objectArray[i])) {


                count = count + 1;


            }
        }
        return new Integer(count);
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove) {
        ArrayList<Object> returnwithoutvalue = new ArrayList<Object>();


        int count = 0;
        for (int i = 0; i < objectArray.length; i++) {
            if (!objectToRemove.equals(objectArray[i])) {
                returnwithoutvalue.add(objectArray[i]);
                count++;

            }


        }
        Integer[] newarray=returnwithoutvalue.toArray(new Integer[0]);
        return newarray;
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {

        ArrayList<Object> mostcommonlist = new ArrayList<Object>();
        int count = 0;
        for (int i = 0; i < objectArray.length; i++) {
            mostcommonlist.add(objectArray[i]);
        }

        int numberofocurrences=0;
        int maxocurences=0;
        Object number=objectArray[0];

        for (int i=0; i < objectArray.length; i++){
            numberofocurrences= Collections.frequency(mostcommonlist,objectArray[i]);
            if (numberofocurrences > maxocurences) {
                number=objectArray[i];
                maxocurences=numberofocurrences;

            }
        }

        return number;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {


            ArrayList<Object> leastcommonlist = new ArrayList<Object>();
            for (int i = 0; i < objectArray.length; i++) {
                leastcommonlist.add(objectArray[i]);
            }

            int numberofocurrences=0;
            int minocurences=Collections.frequency(leastcommonlist,objectArray[0]);
            Object number=objectArray[0];

            for (int i=0; i < objectArray.length; i++){
                numberofocurrences= Collections.frequency(leastcommonlist,objectArray[i]);
                if (numberofocurrences < minocurences) {
                    number=objectArray[i];
                    minocurences=numberofocurrences;

                }
            }
            return number;
        }




    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {

        ArrayList<Object> mergeArray = new ArrayList<Object>();
        for (int i = 0; i < objectArray.length; i++) {
            mergeArray.add(objectArray[i]);
        }
        for (int i = 0; i < objectArrayToAdd.length; i++) {
            mergeArray.add(objectArrayToAdd[i]);
        }
        Integer[] newarray = mergeArray.toArray(new Integer[0]);
        return newarray;

    }
}
