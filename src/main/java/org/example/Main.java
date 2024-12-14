package org.example;

public class Main {
    public static void main(String[] args) {

                int[] arr = {18, -3, 5, -7, 6, 89, 13, 0, -89};

                for (int i = 0; i < arr.length - 1; i++) {
                    int minimum = i;
                    for (int j = i + 1; j < arr.length; j++) {
                        if (arr[j] < arr[minimum]) {
                            minimum = j;
                        }
                    }

                    if (minimum != i) {
                        arr[i] = arr[i] + arr[minimum];
                        arr[minimum] = arr[i] - arr[minimum];
                        arr[i] = arr[i] - arr[minimum];
                    }
                }

                for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
                }
            }
        }
