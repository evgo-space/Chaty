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
    if(s.contains("recommend")){
        return Category.getCat("book");
    }
    if(s.contains("recommendation")){
        return Category.getCat("book");
    }
    if(s.contains("it")){ 
        return Category.getCat("book");
    }
    if(s.contains("okay")){
        return Category.getCat("memb");
    }

    if(s.contains("yes")){
        return Category.getCat("memb");
    }
    if(s.contains("anyway")){
        return Category.getCat("memb");
    }
    if(s.contains("sk")){
        return Category.getCat("pref");
    }
    if(s.contains("questions")){
        return Category.getCat("pref");
    }
    if(s.contains("bored")){
        return Category.getCat("pref");
    }
   
    else{return "Because I am not a sentient being I will never truly die";}
}





}