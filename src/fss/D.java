package fss;

import shared.*;
import shared.Error;
import id3.ID3Inducer;

/* Driver class, used to create,initialize,run inducers */

public class D {
    
    public static void main(String[] args) {
        /*ID3Inducer test*/
        ID3Inducer id3 = new ID3Inducer("ID3");
        FSSInducer FSS = new FSSInducer("FSS",id3);
        
        InstanceList traindata = new InstanceList(args[0],".names",".data");
        InstanceList testdata = new InstanceList(args[0],".names",".test");
        if(args.length < 2) FSS.set_log_level(1);
        else FSS.set_log_level(Integer.parseInt(args[1]));
        System.out.println("The probability of error is: "+FSS.train_and_perf(traindata,testdata));
        
        
        
        FSS.display_struct();
    }
    
}

