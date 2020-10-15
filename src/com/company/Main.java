package com.company;

public class Main {

    public static void main(String[] args) {
        MultiLinkedList MLL = new MultiLinkedList();
        //matix tanımlama
        int[][] matrix = {
                {55, 0, 0, 0, 0},
                {0, 55, 0, 0, 0},
                {0, 0, 55, 0, 0},
                {0, 0, 0, 55, 0},
                {0, 0, 0, 0, 55}
        };

        // int[][] matrix = {{18,0,0,0},{0,18,0,0},{0,0,18,0},{0,0,0,18}};




       /* int[][] matrix =
                {{6, 0, 0, 0, 0, 0}, {0, 6, 0, 0, 0, 0}, {0, 0, 6, 0, 0, 0}, {0, 0, 0, 6, 0, 0}, {0, 0, 0, 0, 7, 0}, {0, 0, 0, 0, 0, 6}};*/

       /* int[][] matrix =
                {{6,0,0,0,0,0},{0,6,0,0,0,0},{0,0,6,0,0,0},{0,0,0,6,0,0},{0,0,0,0,7,0},{0,0,0,0,0,6}};*/



        if (matrix.length != matrix[0].length) {//kare mi değil mi
            System.out.println("false");
        } else {
            String row = ""; //matrix row ismi ve elemanlarını MLL ekleme.
            for (int i = 0; i < matrix.length; i++) {
                row = "Row" + "" + (i + 1);
                MLL.addCategory(row); //row ekleme
                for (int j = 0; j < matrix[0].length; j++) {
                    MLL.addItem(row, matrix[i][j]);
                }
            }
           // MLL.display();
            System.out.println(MLL.control());
        }


    }
}
