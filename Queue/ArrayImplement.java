public class ArrayImplement
{
    public static class queue
    {
        int f=-1;
        int r=-1;
        int size=0;
        int[] arr=new int[5];
       public void add(int val)
        {
            if(r==arr.length-1)
            {
                System.out.println("queue is full");
            return;
            }
            if(f==-1)
            {
                f=r=0;
                arr[0]=val;
            }
            else
            {
                arr[++r]=val;
            }
            size++;
        }
        public int remove()
        {
            if(size==0)
            {
                System.out.println("queue is empty");
                return-1;
            }
            f++;
            size--;
           return arr[f-1];
        }
        public int peek()
        {
            if(size==0)
            {
                System.out.println("queue is empty");
                return-1;
            }
            return arr[f];
        }
        public boolean isEmpty()
        {
            if(size==0)
                return true;
            else
                return false;
        }
        public void display()
        {
            if(size==0)
            {
                System.out.println("queue is empty");
            }
            else
            {
                for(int i=f;i<=r;i++)
                {
                    System.out.print(arr[i]+" ");
                }
                System.out.println();
            }
        }
        public static void main(String[] args)
        {
          queue q=new queue();
            q.add(1);
            q.add(2);
            q.add(3);
            q.add(4);
            q.add(5);
            q.display();
            q.remove();
        }
    }
}