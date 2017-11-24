package sorting;
//this was made working from home

public class issstudent implements Comparable{
    
    private String name,address;
    private int id;
    
    public issstudent(String n, String a, int i){
        name=n;
        address = a;
        id = i;
    }
    
    public int getId(){
        return id;
    }
    
    public String getName(){
        return name;
    }
    public String toString(){
        String str= "Name:\t" + name;
        str+="\nAddress:\t" +address;
        str+="\nStrudent ID:\t" + id;
        return str;
    }
    @Override
    public int compareTo(Object t) {
        String othername= ((issstudent)t).getName();
        return this.name.compareTo(othername);
    }
    
}
