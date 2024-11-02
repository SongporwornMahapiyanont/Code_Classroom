package pokemon;

class PokiStats {
    int[] hps,attks,defends;

    PokiStats(int[]hps, int[] attks, int[] defends){

        this.hps = new int[6];
        this.attks = new int[6];
        this.defends = new int[6];
        for(int i=0;i<6;i++)
        {
            this.hps[i] = hps[i];
            this.attks[i] = attks[i];
            this.defends[i] = defends[i];
        }
    }   
}