import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.Callable;

class ArrayFilter {

    public static void main(String[] args) {
        Element firstEle = new Element("I am first element.", false);
        Element secondEle = new Element("I am second element.", false);
        Element thirdEle = new Element("I am third element.", true);

        ArrayList<Element> list = new ArrayList<>();
        list.add(firstEle);
        list.add(secondEle);
        list.add(thirdEle);
 
        implement_list(list);
    }

    static boolean filter(Element ele) {
        if(ele.isTrue == true)
            return true;
        
        return false;
    }

    static void implement_list(ArrayList<Element> arr) {
        for(int i=0;i<arr.size();i++) {
            if(filter(arr.get(i)) == true)
                System.out.println(arr.get(i).name);
        }
    }
}

class Element {
    String name;
    Boolean isTrue;

    Element(String name, Boolean isTrue) {
        this.name = name;
        this.isTrue = isTrue;
    }

}