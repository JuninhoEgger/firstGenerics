package service;

import java.util.ArrayList;
import java.util.List;

import static javax.swing.JOptionPane.showMessageDialog;

public class PrintService<T> {

    private List<T> list = new ArrayList<>();

    public void addValue(T value) {
        list.add(value);
    }

    public T first() {
        if (list.isEmpty()) {
            throw new IllegalStateException("LIST IS EMPTY");
        }
        return list.get(0);
    }

    public void print() {
        StringBuilder response = new StringBuilder("[");
        if (!list.isEmpty()) {
            showMessageDialog(null, list.get(0));
        }
        list.forEach(value ->
                response.append(", ").append(value)
        );
        response.append("]");
        showMessageDialog(null, response);
    }

}
