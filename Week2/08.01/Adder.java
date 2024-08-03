//package e.api.ex02;

import java.util.*;

public class Adder {    
    // Field
    
    // Constructor
    public Adder() {
    }
    
    // Method
    public int execute(String expr) {
        int result = 0;
        String strNum = "";
        expr = expr.trim();

        for (int i = 0; i < expr.length(); i++) {
            char c = expr.charAt(i);

            if (c == '+') {
                result += Integer.parseInt(strNum);
                strNum = "";
            } else {
                strNum += c;
            }
        } 

        return result+Integer.parseInt(strNum);
    }

	public int exe(String expr) {

		int plus = 0;
		int minus = 0;

		// ´õÇÏ±â´Â ´õÇÏ±â³¢¸® »©±â´Â »©±â³¢¸® Vector¿¡ ¸ðÀ¸±â
		Vector<String> strPlus = new Vector<String>();
		Vector<String> strMinus = new Vector<String>();

		String[] splitByPlus = expr.split("\\+");
		String[] splitByMinus = null;

		for (String strP: splitByPlus)
		{
			if(strP.contains("-")) {
				splitByMinus = strP.split("-");
				for (int i=0; i<splitByMinus.length;i++)
				{
					if (i == 0)
					{
						strPlus.add(splitByMinus[i]);
					} else {
						strMinus.add(splitByMinus[i]);
					}
				}
			}else {
				strPlus.add(strP);
			}

		}

		
		for (String strNum: strPlus)
		{
			plus += Integer.parseInt(strNum);
		}

		for (String strNum: strMinus)
		{
			minus += Integer.parseInt(strNum);
		}

		return plus-minus;
		/*
		for (String str: strArray)
		{
			result+=Integer.parseInt(str);
		}
		
		return result;
		*/
	}

    // Main Method
    public static void main(String[] args) {    
        Adder adder = new Adder();
        String expr = "3+5+9+1";
        System.out.println(expr + " = " + adder.execute(expr));

        expr = "11+45+77+3";
        System.out.println(expr + " = " + adder.execute(expr));
        
        expr = "33+51+12+11";
        System.out.println(expr + " = " + adder.execute(expr));
		
		expr = "33+51-12+7-88+10-11+100";
		System.out.println(expr + " = " + adder.exe(expr));

    } // main end
} // class end
