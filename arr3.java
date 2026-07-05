class arr3
{
    public static void main(String[] args) {
        // Scanner sc=new Scanner (System.in);
        int oneDArray[]={10,20,30,40,50};
        int key=30;
        int count=0;
        for(int i=0;i<oneDArray.length;i++)
        {
            if(key==oneDArray[i])
            {
                count++;
            }
        }
        if(count>0)
        {
            System.out.print("true");
        }
        else{
            System.out.println("false");
        }
    }
}