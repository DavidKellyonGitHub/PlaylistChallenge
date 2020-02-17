package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList){ this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){
        return playlist(playList,startIndex,selection);
    }

    public int playlist(String[] playList, int k, String q){
        String[] threeXLengthArray = new String[3*playList.length];
        int counter1 = 0;
        int counter2 = 0;
        int counter3 = 0;
        for (int s = 0; s < threeXLengthArray.length;s+= playList.length) {
            for (int i = 0; i < playList.length; i++) {
                threeXLengthArray[i + s] = playList[i];
            }
        }

        int currentTrack = k + playList.length;
        int forwardSteps = 1;
        int backwardSteps = 1;
        for (int i = currentTrack+1;i < threeXLengthArray.length;i++){

            if (threeXLengthArray[i] == q){
                break;
            }
            forwardSteps++;
        }
        for (int i = currentTrack-1;i > 0;i--){

            if (threeXLengthArray[i] == q){
                break;
            }
            backwardSteps++;
        }

        if (backwardSteps<forwardSteps){
            return backwardSteps;
        } else {
            return forwardSteps;
        }


    }
}
