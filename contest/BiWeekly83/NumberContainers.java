import java.util.*;

public class NumberContainers {
    public ArrayList<Integer> a;

    public NumberContainers() {
        this.a = new ArrayList<>();
    }

    public void change(int index, int number) {
        if (a.size() > index) {
            a.set(index, number);
        } else {
            a.add(number);
        }
    }

    public int find(int number) {
        return a.indexOf(number);
    }

    public static void main(String []args)
    {
        NumberContainers obj = new NumberContainers();
        System.out.println(obj.find(Integer.valueOf(10)));
        obj.change(2,10);
        obj.change(1,10);

        obj.change(3,10);
        obj.change(5,10);
        System.out.println(obj.find(Integer.valueOf(10)));
        obj.change(1,20);
        System.out.println(obj.find(Integer.valueOf(10)));
    }
}
