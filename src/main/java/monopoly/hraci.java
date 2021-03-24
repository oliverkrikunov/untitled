package monopoly;

    public class hraci {
        int rand_hod,range=6-1+1,pozicia,peniaze=5000;
        private void setPozicia(){
            rand_hod=(int)(Math.random()*range)+1;
            pozicia+=rand_hod;
            if(rand_hod==6){
                rand_hod=(int)(Math.random()*range)+1;
                pozicia+=rand_hod;
            }
            if(pozicia<=24){
                rand_hod =(int)(Math.random()*range)+1;
                pozicia+=rand_hod;
            }
            if(pozicia>24)
                pozicia-=24;
        }
        private int getPozicia() {
            return pozicia;
        }
        private void setPeniaze(int pozicia){
            if(pozicia>24)
                peniaze+=1500;
            if(pozicia==)
        }
    }
