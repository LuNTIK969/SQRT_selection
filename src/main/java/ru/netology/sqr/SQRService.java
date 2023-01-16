package ru.netology.sqr;

public class SQRService {
    public int calc(int lowRange, int highRange) {
        int box = 0;
        for (int i = 10; i <= 99; i++) {
            int iSqr = i * i;
            if (iSqr >= lowRange) {
                if (iSqr <= highRange) {
                    box++;
                }
            }
        }
        return box;
    }

}