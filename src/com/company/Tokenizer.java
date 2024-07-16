package com.company;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Tokenizer {
    static void myTokenizer(Scanner myReader){
        try{
            FileWriter myWriter = new FileWriter("output.txt");
            BufferedWriter bw = new BufferedWriter(myWriter);
            String token;
            String tokenType="";
            String ID_RE="^([a-zA-Z_$][a-zA-Z\\d_$]*)$";
            String Num_RE="[0-9]+";
            //int line = 1;
        while (myReader.hasNext()) {
            token=myReader.next();
            if(Pattern.matches(";",token)){
                tokenType="SEMICOLON";
            }
            else if(Pattern.matches(Num_RE,token)){
                tokenType="NUMBER";
            }
            else if(Pattern.matches("if",token)){
                tokenType="IF";
            }
            else if(Pattern.matches("then",token)){
                tokenType="THEN";
            }
            else if(Pattern.matches("end",token)){
                tokenType="END";
            }
            else if(Pattern.matches("repeat",token)){
                tokenType="REPEAT";
            }
            else if(Pattern.matches("until",token)){
                tokenType="UNTIL";
            }
            else if(Pattern.matches(":=",token)){
                tokenType="ASSIGN";
            }
            else if(Pattern.matches("read",token)){
                tokenType="READ";
            }
            else if(Pattern.matches("write",token)){
                tokenType="WRITE";
            }
            else if(Pattern.matches("<",token)){
                tokenType="LESSTHAN";
            }
            else if(Pattern.matches("=",token)){
                tokenType="EQUAL";
            }
            else if(Pattern.matches("\\+",token)){
                tokenType="PLUS";
            }
            else if(Pattern.matches("-",token)){
                tokenType="MINUS";
            }
            else if(Pattern.matches("\\*",token)){
                tokenType="MULT";
            }
            else if(Pattern.matches("/",token)){
                tokenType="DIV";
            }
            else if(Pattern.matches("\\(",token)){
                tokenType="OPENBRACKET";
            }
            else if(Pattern.matches("\\)",token)){
                tokenType="CLOSEDBRACKET";
            }

            else if(Pattern.matches(ID_RE,token)) {
                tokenType = "identifier";
            }
            //System.out.println(token+","+tokenType);
            bw.write(token+","+tokenType+"\n");
            bw.flush();
        }
        myReader.close();
        bw.close();
    } catch (
    FileNotFoundException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
    } catch (
    IOException e) {
        e.printStackTrace();
    }

}
}

