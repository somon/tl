package bootstrap;

import colors.ColorFactory;
import colors.IColor;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TrafficLight {

    public void run(){
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));){
        
        int time = new Integer(br.readLine());
            IColor color = ColorFactory.create(time);
            System.out.println(color.getName());
        }catch(NumberFormatException | IOException e){
            System.err.println(e.getMessage());
        }catch(IllegalArgumentException e){
            System.err.println(e.getMessage());
        }
    }
}
