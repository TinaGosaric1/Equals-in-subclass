public class Dog {
    private final String name;

    public Dog(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    @Override
    public final boolean equals(Object obj) { //we marked the method final, so we can't override it in subclass
        if(this == obj){
            return true;
        }

        if(obj instanceof Dog){
            String objName = ((Dog) obj).getName();
            return this.name.equals(objName);
        }
        return false;
    }
}
