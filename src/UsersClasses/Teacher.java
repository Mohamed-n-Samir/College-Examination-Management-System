package UsersClasses;


public class Teacher {
    private static int id;
    private static String name;
    private static String subject;
    

    public Teacher(int id, String name, String subject){
        this.id = id;
        this.name = name;
        this.subject = subject;
    }
    
    public static int getID(){
        return id;
    }
    
    public static String getName(){
        return name;
    }
    
    public static String getSubject(){
        return subject;
    }
    
}
