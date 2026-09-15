public static String timeConversion(String s) {
    // Write your code here
    StringBuilder sb=new StringBuilder(s);
    if(sb.charAt(8)=='P'){
        if(!(sb.charAt(0)=='1'&&sb.charAt(1)=='2')){
            sb.setCharAt(0, (char)((int)sb.charAt(0)+1));
            sb.setCharAt(1, (char)((int)sb.charAt(1)+2));
        }
    }else if(sb.charAt(8)=='A'&&(sb.charAt(0)=='1'&&sb.charAt(1)=='2')){
        sb.setCharAt(0, '0');
        sb.setCharAt(1, '0');
    }
    return sb.substring(0,8);
    }
//cheat day 
