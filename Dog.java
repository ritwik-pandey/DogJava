import java.util.Comparator;
public class Dog implements Comparable<Dog>{
    private String name;
    private int size;

    public Dog(String n , int s){
        name = n;
        size = s;
    }

    public void bark(){
        System.out.println(name + " says bark");
    }

    public int compareTo(Dog o){
        Dog uddaDog = (Dog)o;
         return this.size - uddaDog.size;
    }

    private static class NameComperator  implements Comparator<Dog> {
        public int compare(Dog a , Dog b){
            return a.name.compareTo(b.name);
        }
    }

    public static Comparator<Dog> getNameComperator(){
        return new NameComperator();
    }

}
