
package Q5;
public class Job {
    protected String jobname;
    protected int task,memory;
    
    public Job(String jobname, int task,int memory){
        this.jobname=jobname;
        this.task=task;
        this.memory=memory;
    }
    
    public String getJobname(){
        return jobname;
    }
    public int getTasknum(){
        return task;
    }
    public int getMemory(){
        return memory;
    }
    
    @Override
    public String toString(){
         return "Job Name : "+getJobname()+" Memory = "+getMemory()+"GB Number Of Task = "+getTasknum();
    }
}
