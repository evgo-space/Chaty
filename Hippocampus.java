import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.List;


public class Hippocampus extends Cortex {

public String cate;
     
public Hippocampus(String[] hear, String[] speak){
   super(hear,speak);

}



//method for matching user input with correct bot output
@Override
public String wernicke(String s){
    String strng = s.toLowerCase();
    for(int i = 0; i<super.hear.length; i++){
        String temp = super.hear[i];
            if(strng.contains(temp)){
                return temp;
            }      
    }
    return null;
}

@Override
public String chooseWordsWisely (){
    String response;
    int index = (int) (Math.random()*super.speak.length);
        response = super.speak[index];
    return response;
}

@Override
public String getInput(String s){
    if(s.contains("name")){
        return Category.getCat("name");
    }
    if(s.contains("who i am")){
        return Category.getCat("name");
    }
   
    else{return "";}
}





}