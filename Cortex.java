import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Cortex {

    public String[] hear;
    public String[] speak;
    public String cate = null;

   
public Cortex(String[] hear, String[] speak){
    this.hear = hear;
    this.speak = speak;
}



//method for matching user input with correct bot output
public String wernicke(String s){
    String strng = s.toLowerCase();
    for(int i = 0; i<hear.length; i++){
        String temp = hear[i];
            if(strng.contains(temp))
                return temp;      
    }
    return null;
}

public String chooseWordsWisely (){
    String response;
    int index = (int) (Math.random()*speak.length);
        response = speak[index];
    return response;
}

public String getInput(String s){
    return "";
}



}






//(int) (Math.random() * (speak.length))

//for(String temp: hear)
       // if(strng.contains(temp))
           // return temp;
