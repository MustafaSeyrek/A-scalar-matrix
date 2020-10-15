package com.company;

public class ItemNode {
    private int ItemName;
    private ItemNode next;

    public ItemNode(int dataToAdd) {
        ItemName = dataToAdd;
        next = null;
    }

    public int getItemName() { return ItemName; }
    public void setItemName(int data) { this.ItemName = data;  }
    public ItemNode getNext() { return next;  }
    public void setNext(ItemNode next) { this.next = next;   }
}