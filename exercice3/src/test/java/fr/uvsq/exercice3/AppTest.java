package fr.uvsq.exercice3;

import java.util.ArrayList;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    
    @Test
    public void testApp()
    {
    	ArrayList<Robot> robots=new ArrayList<Robot>();
    	robots.add(new RobotType1(20));
    	robots.add(new RobotType2(20));
    	for(int i =0; i<robots.size();i++) {
    		robots.get(i).avance();
    		
    	}
    	for(int i =0; i<robots.size();i++) {
    		System.out.println("position Robot DE TYPE " +(i+1)+" : " +robots.get(i).position);
    		
    	}
    }
}
