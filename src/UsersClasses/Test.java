package UsersClasses;

public class Test {

    private String name;
    private int listTestID;
    private int updateTestID;
    private int teacherID;
    private int numberOfQuestions;
    private int listNumberOfQuestions;
    private int timeInMin;

    public Test() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setListID(int listTestID) {
        this.listTestID = listTestID;
    }

    public void setupdateTestID(int updateTestID) {
        this.updateTestID = updateTestID;
    }

    public void setTeacherID(int teacherID) {
        this.teacherID = teacherID;
    }

    public void setNumberOfQuestions(int numberOfQuestions) {
        this.numberOfQuestions = numberOfQuestions;
    }

//    public void setListNumberOfQuestions(int listNumberOfQuestions) {
//        this.listNumberOfQuestions = listNumberOfQuestions;
//    }

    public void setTimeInMin(int timeInMin) {
        this.timeInMin = timeInMin;
    }

    public String getName() {
        return name;
    }

    public int getListTestID() {
        return listTestID;
    }
    
//    public int getListNumberOfQuestions(){
//        return listNumberOfQuestions;
//               
//    }

    public int getupdateTestID() {
        return updateTestID;
    }

    public int getTeacherID() {
        return teacherID;
    }

    public int getNumberOfQuestions() {
        return numberOfQuestions;
    }

    public int getTimeInMin() {
        return timeInMin;
    }
}
