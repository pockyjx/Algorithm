class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int len = toSec(video_len);
        int start = toSec(pos);
        int ops = toSec(op_start);
        int ope = toSec(op_end);
        
        for(String command : commands) {
            if(start >= ops && start <= ope) start = ope;
            
            if(command.equals("prev")) {
                start -= 10;
                if(start < 0) start = 0;
            } else {
                start += 10;
                if(start > len) start = len;
            }
        }
        
        if(start >= ops && start <= ope) start = ope;
        
        int m = start / 60;
        int s = start % 60;
        
        return String.format("%02d", m) + ":" + String.format("%02d", s);
    }
    
    static int toSec(String time) {
        String[] tmp = time.split(":");
        int m = Integer.parseInt(tmp[0]);
        int s = Integer.parseInt(tmp[1]);
        
        return m * 60 + s;
    }
}