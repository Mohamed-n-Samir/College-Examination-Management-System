package UsersClasses;


public class Question {




    private String Question;
    private String answer1;
    private String answer2;
    private String answer3;
    private String answer4;
    private String answer;
    private int QuestionID;
    
    public Question(){
        
    }
    public void setQuestion(String Question){
        this.Question = Question;
    }
    public void setQuestionID(int QuestionID){
        this.QuestionID = QuestionID;
    }
    public void setAnswer1(String answer1){
        this.answer1 = answer1;
    }
    public void setAnswer2(String answer2){
        this.answer2 = answer2;
    }
    public void setAnswer3(String answer3){
        this.answer3 = answer3;
    }
    public void setAnswer4(String answer4){
        this.answer3 = answer4;
    }
    public void setAnswer(String answer){
        this.answer3 = answer;
    }
    public String getQuestion(){
        return Question;
    }
    public int getQuestionID(){
        return QuestionID;
    }
    public String getAnswer1(){
        return answer1;
    }
    public String getAnswer2(){
        return answer2;
    }
    public String getAnswer3(){
        return answer3;
    }
    public String getAnswer4(){
        return answer4;
    }
    public String getAnswer(){
        return answer;
    }


}
