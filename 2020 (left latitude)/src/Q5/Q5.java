
package Q5;

public class Q5 {
    public static void main(String[] args) {
        Job j1=new Job("J1", 252, 20);
        Job j2=new Job("J2", 108, 10);
        Job j3=new Job("J3", 72, 25);
        
        CloudPackage cp1=new CloudPackage("P2-15",4,15,1.24);
        CloudPackage cp2=new CloudPackage("P2-30",6,30,2.11);
        CloudPackage cp3=new CloudPackage("R5-20",4,20,1.38);
        CloudPackage cp4=new CloudPackage("R6-20",6,20,1.88);
        
        Job[] jobssssss={j1,j2,j3};
        CloudPackage[] cpppppp={cp1,cp2,cp3,cp4};
        double lasttotalcost=0;
        for(int i=0;i<jobssssss.length;i++){
            CloudPackage lowest=new CloudPackage("temp",1,1,9999999);
            for(int j=0;j<cpppppp.length;j++){
                if((cpppppp[j].check(jobssssss[i])==true && cpppppp[j].totalCost(jobssssss[i])<lowest.totalCost(jobssssss[i]))){
                    lowest=cpppppp[j];
                }
            }
            System.out.println(jobssssss[i].toString());
            System.out.println(lowest.toString());
            lasttotalcost+=lowest.getTotalcost();
        }
        System.out.println("Total cost : "+lasttotalcost);
    }
}
