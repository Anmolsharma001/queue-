import java.util.*;
public class insertQueue
{
    public static void main(String[] args)
    {
      Queue<Integer>q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        Queue<Integer>helper=new ArrayDeque<>();
        while(q.size()>0)
        {
            System.out.print(q.peek()+" ");
            helper.add(q.remove());
        }
        while(helper.size()>0)
        {
            q.add(helper.poll());
        }
    }
}