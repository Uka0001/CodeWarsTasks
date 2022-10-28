package org.example;

public class PaginationService {
    private String[] data;
    private int elementsPerPage;

    public PaginationService(String[] data, int elementsPerPage) {
        this.data = data;
        this.elementsPerPage = elementsPerPage;
    }

    // create getElementsCount() method
    public int getElementsCount() {
        return data.length;
    }

    // create getPageNumberByElementIndex(int index) method
    public int getPageNumberByElementIndex(int index) {
        if (index < 0) {
            return -1;
        } else if (index  > data.length) {
            return -1;
        } else {
            return index / elementsPerPage;
        }
    }
}
