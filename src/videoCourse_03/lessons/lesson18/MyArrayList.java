package videoCourse_03.lessons.lesson18;

public class MyArrayList {

    private String[] array = new String[10];
    private int size = 0;

    public void add(String s) {
        array[size] = s;
        size++;
        if (size == array.length) {
            String[] newArray = new String[array.length * 2];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
    }

    public void remove(int index) {
        if (index >= 0 && index < size) {
            for (int i = index; i < size - 1; i++) {
                array[i] = array[i + 1];
            }
            size--;
        }
    }

    public void remove(String s) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (s.equals(array[i])) {
                index = i;
            }
        }
        if (index != -1) {
            remove(index);
        }
    }

    public int getSize() {
        return size;
    }

    public String get(int index) {
        if (index >= 0 && index < size) {

            return array[index];
        } else {
            return "Элемент не найден";
        }
    }
}

class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList employees = new MyArrayList();
        employees.add("Иван");
        employees.add("Петр");
        employees.add("Семен");
        employees.add("Максим");
        employees.add("Денис");
        employees.add("Николай");
        for (int i = 0; i < employees.getSize(); i++) {
            System.out.println(employees.get(i));
        }
        System.out.println("------------------");
        employees.remove(2);
        for (int i = 0; i < employees.getSize(); i++) {
            System.out.println(employees.get(i));
        }
        System.out.println("------------------");
        employees.remove("Петр");
        employees.remove("Николай");
        for (int i = 0; i < employees.getSize(); i++) {
            System.out.println(employees.get(i));
        }
    }
}