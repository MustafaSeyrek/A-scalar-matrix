package com.company;

public class MultiLinkedList {
    CategoryNode head;

    public void addCategory(String dataToAdd) {
        CategoryNode temp;
        if (head == null) {
            temp = new CategoryNode(dataToAdd);
            head = temp;
        } else {
            temp = head;
            while (temp.getDown() != null)
                temp = temp.getDown();
            CategoryNode newnode = new CategoryNode(dataToAdd);
            temp.setDown(newnode);
        }
    }

    public void addItem(String Category, int Item) {
        if (head == null)
            System.out.println("Add a Category before Item");
        else {
            CategoryNode temp = head;
            while (temp != null) {
                if (Category.equals(temp.getCategoryName())) {
                    ItemNode temp2 = temp.getRight();
                    if (temp2 == null) {
                        temp2 = new ItemNode(Item);
                        temp.setRight(temp2);
                    } else {
                        while (temp2.getNext() != null)
                            temp2 = temp2.getNext();
                        ItemNode newnode = new ItemNode(Item);
                        temp2.setNext(newnode);
                    }
                }
                temp = temp.getDown();
            }
        }
    }

    public int sizeCategory() {
        int count = 0;
        if (head == null)
            System.out.println("linked list is empty");
        else {
            CategoryNode temp = head;
            while (temp != null) {
                count++;
                temp = temp.getDown();
            }
        }
        return count;
    }

    public int sizeItem() {
        int count = 0;
        if (head == null)
            System.out.println("linked list is empty");
        else {
            CategoryNode temp = head;
            while (temp != null) {
                ItemNode temp2 = temp.getRight();
                while (temp2 != null) {
                    count++;
                    temp2 = temp2.getNext();
                }
                temp = temp.getDown();
            }
        }
        return count;
    }

    public void display() {
        if (head == null)
            System.out.println("linked list is empty");
        else {
            CategoryNode temp = head;
            while (temp != null) {
                System.out.print(temp.getCategoryName() + " --> ");
                ItemNode temp2 = temp.getRight();
                while (temp2 != null) {
                    System.out.print(temp2.getItemName() + " ");
                    temp2 = temp2.getNext();
                }
                temp = temp.getDown();
                System.out.println();
            }
        }
    }

    public boolean control() {
        boolean flag = true;
        int count = 0;
        int count2 = 0;
        int value = 0;
        if (head == null)
            System.out.println("linked list is empty");
        else {
            CategoryNode temp = head; //row1 mesela
            while (temp != null) {
                ItemNode temp2 = temp.getRight(); // matrisin 0,0 elemanı

                if (count == 0) {//0,0 elemanını kontrol edip değere atama
                    if (temp2.getItemName() != 0) {
                        value = temp2.getItemName();
                    }
                    if (temp2.getItemName() == 0) { //sıfırsa flag false
                        flag = false;
                        break;
                    }
                }
                while (temp2 != null) {

                    /*if (count == 0) {
                        if (temp2.getItemName() != 0) {
                            flag = false;
                            break;
                        }
                    }*/
                    if(count  == count2){
                        if(value != temp2.getItemName()){
                            flag = false;
                            break;
                        }
                    }
                    else if(count != count2){
                        if(temp2.getItemName() != 0){
                            flag =false;
                            break;
                        }
                    }
                    temp2 = temp2.getNext(); //sağa ilerler
                    count2++;

                }
                temp = temp.getDown();//aşağı ilerler
                count++;
                count2=0;
            }


        }
        return flag;
    }


}
