import java.util.ArrayList;

public class Sequence
{
   private ArrayList<Integer> values;

   public Sequence()
   {
      values = new ArrayList<Integer>();
   }



   public void add(int n)
   {
      values.add(n);
   }



   public String toString()
   {
      return values.toString();
   }



   public Sequence append(Sequence other)
   {
      Sequence app = new Sequence();
      app.values.addAll(this.values);

      for (int values : other.values)
      {
         app.add(values);
      }
      return app;
   }




   public Sequence merge(Sequence other)
   {
      Sequence mergedSequence = new Sequence();

      int i = 0;
      int j = 0; 

      while (i < this.values.size() || j < other.values.size())
      {
         if (i < this.values.size())
         {
            mergedSequence.add(this.values.get(i++));
         } 

         if (j < other.values.size()) 
         {
            mergedSequence.add(other.values.get(j++));
         }
      }

      return mergedSequence; 
   }




   public Sequence mergeSorted(Sequence other)
   {
      Sequence sortMerge = new Sequence();

      int i = 0;
      int j = 0; 

      while (i < this.values.size() && j < other.values.size())
      {
         if (this.values.get(i) < other.values.get(j)) //adds element from the first list if it is bigger than the element in the second list
         {
            sortMerge.add(this.values.get(i++));
         }
         else //adds element in the second list if bigger than the element in the first list.
         {
            sortMerge.add(other.values.get(j++));
         }
      }

      while (i < this.values.size())
      {
         sortMerge.add(this.values.get(i++));
      }

      while (j < other.values.size())
      {
         sortMerge.add(other.values.get(j++));
      }

      return sortMerge;
   }




   public void removeDuplicates()
   {
      for (int i = this.values.size() - 1; i > 0; i--)
      {
         for (int j = i - 1; j >= 0; j--)
         {
            if (this.values.get(i).equals(this.values.get(j)))
            {
               this.values.remove(j);
            }
         }
      }
   }


   
}