package com.company;


public class DegreesImplements implements DegreesInterface{



    @Override
    public int add(int qtyBTech, int qtyMTech, int qtyMS, int qtyPhD) {
        int totalStudentQty = qtyBTech + qtyMTech + qtyMS + qtyPhD;

        return totalStudentQty;
    }

    @Override
    public int randomize() {

        int randomicNo = (int)(Math.random() * 4) + 1;
        return randomicNo;
    }
}
