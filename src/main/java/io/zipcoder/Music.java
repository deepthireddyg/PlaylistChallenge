package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){

     int upcount = 0;
     int downcount = 0;
     int idx = startIndex;
     while(upcount<this.playList.length) {
         if (this.playList[idx].equals(selection))
             break;
             upcount++;
             idx++;

         if(idx>playList.length-1)
             idx = 0;
         
     }

     while(downcount<this.playList.length){
         if(this.playList[idx].equals(selection))
             break;
             downcount++;
         idx--;
         if(idx < 0)
             idx = playList.length-1;

     }
     if(upcount <= downcount){
         return upcount;
     }

        return downcount;
    }
}
