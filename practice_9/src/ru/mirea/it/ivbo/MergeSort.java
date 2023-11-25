package ru.mirea.it.ivbo;

public class MergeSort
{
    public static Student[] sortArray(Student[] list)
    {
        if (list == null) {
            return null;
        }
        if (list.length < 2) {
            return list;
        }

        Student[] list1 = new Student[list.length / 2];
        System.arraycopy(list, 0, list1, 0, list.length / 2);

        Student[] list2 = new Student[list.length - list.length / 2];
        System.arraycopy(list, list.length / 2, list2, 0, list.length - list.length / 2);

        list1 = sortArray(list1);
        list2 = sortArray(list2);

        return mergeSort(list1, list2);
    }
    public static Student[] mergeSort(Student[] list1, Student[] list2)
    {
        Student[] mergedArray = new Student[list1.length + list2.length];
        int i = 0, j = 0, k = 0;

        while (i < list1.length && j < list2.length) {
            if (list1[i].compareTo(list2[j]) < 0) {
                mergedArray[k] = list1[i];
                i++;
            } else {
                mergedArray[k] = list2[j];
                j++;
            }
            k++;
        }

        while (i < list1.length) {
            mergedArray[k] = list1[i];
            i++;
            k++;
        }

        while (j < list2.length) {
            mergedArray[k] = list2[j];
            j++;
            k++;
        }

        return mergedArray;
    }
}